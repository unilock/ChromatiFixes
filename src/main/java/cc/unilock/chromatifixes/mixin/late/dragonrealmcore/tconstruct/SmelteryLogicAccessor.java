package cc.unilock.chromatifixes.mixin.late.dragonrealmcore.tconstruct;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "tconstruct.smeltery.logic.SmelteryLogic")
@Pseudo
public interface SmelteryLogicAccessor {
    @Accessor
    @Mutable
    static void setMAX_SMELTERY_SIZE(int value) {
        throw new AssertionError();
    }
}
