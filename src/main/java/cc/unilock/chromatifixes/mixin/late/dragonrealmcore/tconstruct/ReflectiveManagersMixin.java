package cc.unilock.chromatifixes.mixin.late.dragonrealmcore.tconstruct;

import Reika.DragonRealmCore.DragonRealmCore;
import Reika.DragonRealmCore.Util.ReflectiveManagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = ReflectiveManagers.class, remap = false)
public class ReflectiveManagersMixin {
    /**
     * @author unilock
     * @reason replace reflection
     */
    @Overwrite
    public void increaseSmelterySize(int size) {
        SmelteryLogicAccessor.setMAX_SMELTERY_SIZE(size);
        DragonRealmCore.logger.log("Increasing smeltery max size to " + size + "x" + size);
    }
}
