package com.burningcactus.cactusaether.block;

import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * A campfire useful for enchanting recipes.
 */
public class AmbrosiumCampfire extends CampfireBlock {
    public AmbrosiumCampfire(boolean pSpawnParticles, int pFireDamage, BlockBehaviour.Properties pProperties) {
        super(pSpawnParticles, pFireDamage, pProperties);
    }
}
