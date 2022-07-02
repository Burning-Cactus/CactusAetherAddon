package com.burningcactus.cactusaether.item;

import com.burningcactus.cactusaether.CactusAether;
import com.gildedgames.aether.common.registry.AetherItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Items registry class
 */
public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CactusAether.MOD_ID);

    public static CreativeModeTab creativeTab = new CreativeModeTab(CactusAether.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AetherItems.VAMPIRE_BLADE.get());
        }
    };
}
