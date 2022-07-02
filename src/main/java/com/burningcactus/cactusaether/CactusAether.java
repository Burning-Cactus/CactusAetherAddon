package com.burningcactus.cactusaether;

import com.burningcactus.cactusaether.block.ModBlocks;
import com.burningcactus.cactusaether.item.ModItems;
import com.gildedgames.aether.Aether;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CactusAether.MOD_ID)
public class CactusAether {
    public static final String MOD_ID = "cactusaether";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public CactusAether() {
        LOGGER.info("Hello from mod construction!");
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::clientSetup);
        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
    }

    public void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(
                () -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation(Aether.MODID, "the_aether"), new DimensionSpecialEffects.NetherEffects())
        );
    }
}
