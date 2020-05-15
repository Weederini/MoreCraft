package kittehmod.morecraft.network;

import java.util.function.Supplier;

import kittehmod.morecraft.MoreCraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkEvent;

public class ModUpdateTileEntityPacket {
	
	private final BlockPos blockPos;
	private final CompoundNBT nbt;

    public ModUpdateTileEntityPacket(BlockPos blockPosIn, CompoundNBT compoundIn) {
        this.blockPos = blockPosIn;
        //this.tileEntityType = tileEntityTypeIn;
        this.nbt = compoundIn;
    }

    public static void encode(ModUpdateTileEntityPacket msg, PacketBuffer buf) {
    	MoreCraft.LOGGER.info("Encoding packet for ModUpdateTileEntityPacket...");
    	buf.writeBlockPos(msg.blockPos);
    	buf.writeCompoundTag(msg.nbt);
    }
    
    public static ModUpdateTileEntityPacket decode(PacketBuffer buf) {
    	MoreCraft.LOGGER.info("Decoding packet for ModUpdateTileEntityPacket...");
    	return new ModUpdateTileEntityPacket(buf.readBlockPos(), buf.readCompoundTag());
    }
	
    public static class Handler {
    	
	    public static void handle(final ModUpdateTileEntityPacket message, Supplier<NetworkEvent.Context> context) {
	    	context.get().enqueueWork(() -> {
	    		World world;
	    		TileEntity te;
	    		if (context.get().getDirection() == NetworkDirection.PLAY_TO_SERVER) {
		    		world = context.get().getSender().getEntityWorld();
		    		te = world.getTileEntity(message.blockPos);
		    		if (te != null && message.nbt != null) {
		    			MoreCraft.LOGGER.info("Getting NBT info:\n" + message.nbt);
			    		te.write(message.nbt);
			    		MoreCraft.LOGGER.info("Successfully written NBT.");
		    		}
	    		}
	        });
	    	context.get().setPacketHandled(true);
	    }
	    
    }
    
}