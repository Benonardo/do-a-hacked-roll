package nl.enjarai.doabarrelroll.compat.midnightcontrols.mixin;

import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Pseudo
@Mixin(targets = "eu.midnightdust.midnightcontrols.client.MidnightControlsConfig")
public interface MidnightControlsConfigAccessor {

    @Dynamic
    @Accessor
    static double getRotationSpeed() {
        throw new AssertionError();
    }

    @Dynamic
    @Invoker
    static double callGetRightXAxisSign() {
        throw new AssertionError();
    }

    @Dynamic
    @Invoker
    static double callGetRightYAxisSign() {
        throw new AssertionError();
    }
}
