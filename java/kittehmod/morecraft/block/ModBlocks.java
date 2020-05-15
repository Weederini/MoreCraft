package kittehmod.morecraft.block;

import kittehmod.morecraft.MoreCraft;
import kittehmod.morecraft.worldgen.NetherwoodTree;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MoreCraft.MODID);
	
	//--LIST OF BLOCKS--\\
    //Doors & Gates
    public static final RegistryObject<Block> NETHERBRICK_DOOR = BLOCKS.register("netherbrick_door", () -> new ModDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 8.0F).sound(SoundType.STONE))); 
	public static final RegistryObject<Block> NETHERWOOD_DOOR = BLOCKS.register("netherwood_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F, 4.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> GLASS_DOOR = BLOCKS.register("glass_door", () -> new ModDoorBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(1.0F, 2.0F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> BONE_DOOR = BLOCKS.register("bone_door", () -> new ModDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5F, 4.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERBRICK_FENCE_GATE = BLOCKS.register("netherbrick_fence_gate", () -> new FenceGateBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 8.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERWOOD_FENCE_GATE = BLOCKS.register("netherwood_fence_gate", () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F, 4.0F).sound(SoundType.WOOD)));

    //Ores
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new ModOreBlock(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F)));
   
    //Storage Blocks
    public static final RegistryObject<Block> FLESH_BLOCK = BLOCKS.register("flesh_block", () -> new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BLAZE_BLOCK = BLOCKS.register("blaze_block", () -> new BlazeBlock(Block.Properties.create(Material.IRON).harvestLevel(1).hardnessAndResistance(5.0F, 6.0F).lightValue(15).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ENDER_BLOCK = BLOCKS.register("ender_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).hardnessAndResistance(2.5F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> GUNPOWDER_BLOCK = BLOCKS.register("gunpowder_block", () -> new FallingBlock(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.SAND)));
    
    //Netherwood
    public static final RegistryObject<Block> NETHERWOOD_LOG = BLOCKS.register("netherwood_log", () -> new NetherwoodLogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new NetherwoodLogBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_log").setRegistryName("netherwood_log");
    public static final RegistryObject<Block> STRIPPED_NETHERWOOD_LOG = BLOCKS.register("stripped_netherwood_log", () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new NetherwoodLogBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_log").setRegistryName("netherwood_log");
    public static final RegistryObject<Block> NETHERWOOD_WOOD = BLOCKS.register("netherwood_wood", () -> new NetherwoodLogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new NetherwoodLogBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_log").setRegistryName("netherwood_log");
    public static final RegistryObject<Block> STRIPPED_NETHERWOOD_WOOD = BLOCKS.register("stripped_netherwood_wood", () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new NetherwoodLogBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_log").setRegistryName("netherwood_log");
    public static final RegistryObject<Block> NETHERWOOD_PLANKS = BLOCKS.register("netherwood_planks", () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD)));// new NetherwoodPlankBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_planks").setRegistryName("netherwood_planks");
    public static final RegistryObject<Block> NETHERWOOD_LEAVES = BLOCKS.register("netherwood_leaves", () -> new NetherwoodLeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 1.0F))); //(NetherwoodLeavesBlock) new NetherwoodLeavesBlock().setHardness(0.2F).setLightOpacity(1).setUnlocalizedName("netherwood_leaves").setRegistryName("netherwood_leaves");   
    public static final RegistryObject<Block> NETHERWOOD_SAPLING = BLOCKS.register("netherwood_sapling", () -> new NetherwoodSaplingBlock(new NetherwoodTree(), Block.Properties.create(Material.PLANTS).hardnessAndResistance(0F, 0F).sound(SoundType.PLANT))); //new NetherwoodSaplingBlock().setHardness(0F).setResistance(1.0F).setUnlocalizedName("netherwood_sapling").setRegistryName("netherwood_sapling");
    public static final RegistryObject<Block> NETHERWOOD_STAIRS = BLOCKS.register("netherwood_stairs", () -> new ModStairsBlock(NETHERWOOD_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new ModStairsBlock(NETHERWOOD_PLANKS.getDefaultState()).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_stairs").setRegistryName("netherwood_stairs");
    public static final RegistryObject<Block> NETHERWOOD_SLAB = BLOCKS.register("netherwood_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new ModSlabBlock.Half(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_slab").setRegistryName("netherwood_slab");
    public static final RegistryObject<Block> NETHERWOOD_CHEST = BLOCKS.register("netherwood_chest", () -> new NetherwoodChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F, 6.0F).sound(SoundType.WOOD))); //(NetherwoodChestBlock)(new NetherwoodChestBlock(NetherwoodChestBlock.Type.BASIC)).setHardness(2.5F).setResistance(7.0F).setUnlocalizedName("netherwood_chest").setRegistryName("netherwood_chest");    
    public static final RegistryObject<Block> NETHERWOOD_CHEST_TRAPPED = BLOCKS.register("netherwood_trapped_chest", () -> new NetherwoodTrappedChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F, 6.0F).sound(SoundType.WOOD))); //(NetherwoodChestBlock)(new NetherwoodChestBlock(NetherwoodChestBlock.Type.TRAP)).setHardness(2.5F).setResistance(7.0F).setUnlocalizedName("netherwood_chest_trap").setRegistryName("netherwood_chest_trap");
    public static final RegistryObject<Block> NETHERWOOD_CRAFTING_TABLE = BLOCKS.register("netherwood_crafting_table", () -> new NetherwoodCraftingTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new NetherwoodCraftingTableBlock().setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_crafting_table").setRegistryName("netherwood_crafting_table");
    public static final RegistryObject<Block> NETHERWOOD_FENCE = BLOCKS.register("netherwood_fence", () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.WOOD))); //new BlockFence(Material.WOOD, MapColor.OBSIDIAN).setHardness(2.0F).setResistance(20.0F).setUnlocalizedName("netherwood_fence").setRegistryName("netherwood_fence");
    public static final RegistryObject<Block> NETHERWOOD_TRAPDOOR = BLOCKS.register("netherwood_trapdoor", () -> new ModTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 4.0F).sound(SoundType.WOOD))); //new BlockFence(Material.WOOD, MapColor.OBSIDIAN).setHardness(2.0F).setResistance(20.0F).setUnlocalizedName("netherwood_fence").setRegistryName("netherwood_fence");
    public static final RegistryObject<Block> NETHERWOOD_SIGN = BLOCKS.register("netherwood_sign", () -> new NetherwoodStandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD))); //new ModSlabBlock.Half(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_slab").setRegistryName("netherwood_slab");
    public static final RegistryObject<Block> NETHERWOOD_WALL_SIGN = BLOCKS.register("netherwood_wall_sign", () -> new NetherwoodWallSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD))); //new ModSlabBlock.Half(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_slab").setRegistryName("netherwood_slab");
    public static final RegistryObject<Block> NETHERWOOD_BUTTON = BLOCKS.register("netherwood_button", () -> new ModButtonBlock(true, Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD))); //new ModSlabBlock.Half(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_slab").setRegistryName("netherwood_slab");
    public static final RegistryObject<Block> NETHERWOOD_PRESSURE_PLATE = BLOCKS.register("netherwood_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD))); //new ModSlabBlock.Half(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(3.0F).setResistance(8.0F).setUnlocalizedName("netherwood_slab").setRegistryName("netherwood_slab");

    //Heads
    public static final RegistryObject<Block> SPIDER_HEAD = BLOCKS.register("spider_head", () -> new ModSkullBlock(ModSkullBlock.Types.SPIDER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new SoulGlassBlock(Material.GLASS, false).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass").setRegistryName("soul_glass");
    public static final RegistryObject<Block> CAVE_SPIDER_HEAD = BLOCKS.register("cave_spider_head", () -> new ModSkullBlock(ModSkullBlock.Types.CAVE_SPIDER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new ModPaneBlock(Material.GLASS, false).setSoundType(SoundType.GLASS).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass_pane").setRegistryName("soul_glass_pane");
    public static final RegistryObject<Block> ZOMBIE_PIGMAN_HEAD  = BLOCKS.register("zombie_pigman_head", () -> new ModSkullBlock(ModSkullBlock.Types.ZOMBIE_PIGMAN, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");
    public static final RegistryObject<Block> BLAZE_HEAD = BLOCKS.register("blaze_head", () -> new ModSkullBlock(ModSkullBlock.Types.BLAZE, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new BoneLadderBlock().setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("bone_ladder").setRegistryName("bone_ladder");
    public static final RegistryObject<Block> ENDERMAN_HEAD = BLOCKS.register("enderman_head", () -> new ModSkullBlock(ModSkullBlock.Types.ENDERMAN, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");

    public static final RegistryObject<Block> WALL_SPIDER_HEAD = BLOCKS.register("wall_spider_head", () -> new ModWallSkullBlock(ModSkullBlock.Types.SPIDER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new SoulGlassBlock(Material.GLASS, false).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass").setRegistryName("soul_glass");
    public static final RegistryObject<Block> WALL_CAVE_SPIDER_HEAD = BLOCKS.register("wall_cave_spider_head", () -> new ModWallSkullBlock(ModSkullBlock.Types.CAVE_SPIDER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new ModPaneBlock(Material.GLASS, false).setSoundType(SoundType.GLASS).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass_pane").setRegistryName("soul_glass_pane");
    public static final RegistryObject<Block> WALL_ZOMBIE_PIGMAN_HEAD  = BLOCKS.register("wall_zombie_pigman_head", () -> new ModWallSkullBlock(ModSkullBlock.Types.ZOMBIE_PIGMAN, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");
    public static final RegistryObject<Block> WALL_BLAZE_HEAD = BLOCKS.register("wall_blaze_head", () -> new ModWallSkullBlock(ModSkullBlock.Types.BLAZE, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); //new BoneLadderBlock().setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("bone_ladder").setRegistryName("bone_ladder");
    public static final RegistryObject<Block> WALL_ENDERMAN_HEAD = BLOCKS.register("wall_enderman_head", () -> new ModWallSkullBlock(ModSkullBlock.Types.ENDERMAN, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(1.0F))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");

    //Others
    public static final RegistryObject<Block> SOUL_GLASS = BLOCKS.register("soul_glass", () -> new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 3.0F).sound(SoundType.GLASS))); //new SoulGlassBlock(Material.GLASS, false).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass").setRegistryName("soul_glass");
    public static final RegistryObject<Block> SOUL_GLASS_PANE = BLOCKS.register("soul_glass_pane", () -> new ModPaneBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 3.0F).sound(SoundType.GLASS))); //new ModPaneBlock(Material.GLASS, false).setSoundType(SoundType.GLASS).setHardness(0.5F).setResistance(15.0F).setUnlocalizedName("soul_glass_pane").setRegistryName("soul_glass_pane");
    public static final RegistryObject<Block> BONE_LADDER = BLOCKS.register("bone_ladder", () -> new BoneLadderBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 3.0F).sound(SoundType.LADDER))); //new BoneLadderBlock().setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("bone_ladder").setRegistryName("bone_ladder");
    public static final RegistryObject<Block> GLOWSTONE_TORCH = BLOCKS.register("glowstone_torch", () -> new GlowstoneTorchBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.0F, 1.0F).lightValue(15).sound(SoundType.WOOD))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");
    public static final RegistryObject<Block> WALL_GLOWSTONE_TORCH = BLOCKS.register("wall_glowstone_torch", () -> new GlowstoneWallTorchBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.0F, 1.0F).lightValue(15).sound(SoundType.WOOD))); // new GlowstoneTorchBlock().setUnlocalizedName("glowstone_torch").setLightLevel(1.0F).setRegistryName("glowstone_torch");
    public static final RegistryObject<Block> BEDROCK_BRICK = BLOCKS.register("bedrock_brick", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(-1F, 3600000F).sound(SoundType.STONE))); //new ModBlock(Material.ROCK).setSoundType(SoundType.STONE).setBlockUnbreakable().setResistance(6000000.0F).setUnlocalizedName("bedrock_brick").setRegistryName("bedrock_brick");    
    @SuppressWarnings("deprecation")
	public static final RegistryObject<Block> POTTED_NETHERWOOD_SAPLING = BLOCKS.register("potted_netherwood_sapling", () -> new FlowerPotBlock(NETHERWOOD_SAPLING.get(), Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F)));

	@EventBusSubscriber(modid = MoreCraft.MODID)
	public static class RegistrationHandler 
	{
		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
			return setup(entry, new ResourceLocation(MoreCraft.MODID, name));
		}

		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
			entry.setRegistryName(registryName);
			return entry;
		}
		
	    @SubscribeEvent
	    public static void registerBlocks(final RegistryEvent.Register<Block> event) { 
	    	event.getRegistry().registerAll();
	    }
	    
	    @SubscribeEvent
	    public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
	    	event.getRegistry().registerAll(
		    	//setup(new Item(new Item.Properties()), "example_item")
		    );
	    }
	}
}