package com.mwmnya.ofscoremod.mixin;

import net.minecraft.world.gen.MapGenRavine;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MapGenRavine.class)
public class RavineMixin {

    @ModifyConstant(method = "func_151538_a", constant = @Constant(intValue = 50))
    private int increaseRavineFrequency(int original) {
        return 10;
    }
}
