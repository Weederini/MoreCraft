package kittehmod.morecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;

public abstract class ModSlabBlock extends SlabBlock implements IWaterLoggable { 
	
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
    public ModSlabBlock(Block.Properties properties)
    {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(false)));
    }
	
}
