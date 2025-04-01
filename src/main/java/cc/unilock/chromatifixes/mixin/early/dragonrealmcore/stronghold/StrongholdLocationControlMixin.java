package cc.unilock.chromatifixes.mixin.early.dragonrealmcore.stronghold;

import Reika.DragonAPI.ASM.Patchers.Patcher;
import Reika.DragonRealmCore.ASM.Reika.StrongholdLocationControl;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = StrongholdLocationControl.class, remap = false)
public abstract class StrongholdLocationControlMixin extends Patcher {
    public StrongholdLocationControlMixin() {
        super(null);
        throw new InstantiationError("StrongholdLocationControlMixin instantiated!?");
    }

    /**
     * @author unilock
     * @reason allow disabling TerritoryStrongholdSystem
     */
    @Override
    public boolean isDisabledByDefault() {
        return true;
    }
}
