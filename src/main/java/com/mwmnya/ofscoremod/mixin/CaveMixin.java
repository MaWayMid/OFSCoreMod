package com.mwmnya.ofscoremod.mixin;

import net.minecraft.world.gen.MapGenCaves;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MapGenCaves.class)
public class CaveMixin {

    @ModifyConstant(method = "func_151538_a", constant = @Constant(intValue = 15))
    private int increaseCaveFrequency(int original) {
        return 40;
    }
}
