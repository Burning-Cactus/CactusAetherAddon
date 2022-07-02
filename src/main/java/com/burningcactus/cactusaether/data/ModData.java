package com.burningcactus.cactusaether.data;

import com.burningcactus.cactusaether.CactusAether;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * All the mod's data generators are run through here.
 */
@Mod.EventBusSubscriber(modid = CactusAether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModData {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeClient()) {

        }
        if (event.includeServer()) {
            generator.addProvider(true, new ModRecipeData(event.getGenerator()));
        }
    }
}
