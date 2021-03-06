package kittehmod.morecraft.network;

import java.util.function.Supplier;

import kittehmod.morecraft.tileentity.ModSignTileEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkEvent;

//This is necessary for updating sign before writing to NBT as otherwise, the signs won't save and would be blank after load.
public class ModUpdateSignPacket {

	private final BlockPos blockPos;
	private final ITextComponent[] lines;
	private final int color;

    public ModUpdateSignPacket(BlockPos blockPosIn, ITextComponent line1, ITextComponent line2, ITextComponent line3, ITextComponent line4, int colorIn) {
        this.blockPos = blockPosIn;
        this.lines = new ITextComponent[]{line1, line2, line3, line4};
        this.color = colorIn;
    }

    public static void encode(ModUpdateSignPacket msg, PacketBuffer buf) {
    	buf.writeBlockPos(msg.blockPos);
        for(int i = 0; i < 4; ++i) {
            buf.writeTextComponent(msg.lines[i]);
        }
        buf.writeInt(msg.color);
    }
    
    public static ModUpdateSignPacket decode(PacketBuffer buf) {
    	return new ModUpdateSignPacket(buf.readBlockPos(), buf.readTextComponent(), buf.readTextComponent(), buf.readTextComponent(), buf.readTextComponent(), buf.readInt());
    }
	
    public static class Handler {
    	
	    public static void handle(final ModUpdateSignPacket message, Supplier<NetworkEvent.Context> context) {
	    	context.get().enqueueWork(() -> {
	    		World world;
	    		TileEntity te;
	    		if (context.get().getDirection() == NetworkDirection.PLAY_TO_SERVER) {
		    		world = context.get().getSender().getEntityWorld();
		    		te = world.getTileEntity(message.blockPos);
		    		if (te != null && te instanceof ModSignTileEntity) {
		    			ModSignTileEntity sign = (ModSignTileEntity)te;
		    			for (int i = 0; i < 4; i++) {
		    				sign.setText(i, message.lines[i]);
		    			}
		    			sign.setTextColor(DyeColor.byId(message.color));
		    		}
	    		}
	        });
	    	context.get().setPacketHandled(true);
	    }
	    
    }
	
}
