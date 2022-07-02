package com.burningcactus.cactusaether.block;

import com.burningcactus.cactusaether.CactusAether;
import com.burningcactus.cactusaether.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Blocks registry class
 */
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CactusAether.MOD_ID);

    public static final RegistryObject<Block> AMBROSIUM_CAMPFIRE = registerWithItem("ambrosium_campfire",
            () -> new AmbrosiumCampfire(true, 1, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F)
                    .sound(SoundType.WOOD).lightLevel(blockState -> blockState.getValue(BlockStateProperties.LIT) ? 15 : 0).noOcclusion()), ModItems.creativeTab);

    /**
     * Registers a new block and blockItem to the deferred registers.
     */
    public static RegistryObject<Block> registerWithItem(String name, Supplier<Block> blockSupplier, CreativeModeTab tab) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        registerBlockItem(name, block, tab);
        return block;
    }

    /**
     * Registers a blockItem to the items deferred register.
     */
    public static void registerBlockItem(String name, RegistryObject<Block> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
