package cc.unilock.chromatifixes.mixin.late.dragonrealmcore;

import Reika.DragonRealmCore.Bees.DRBees;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = DRBees.class, remap = false)
public class DRBeesMixin {
    /**
     * @author unilock
     * @reason does not work with newer Binnie's Mods!<br>TODO: reimplement
     */
    @Redirect(method = "initialize", at = @At(value = "INVOKE", target = "Lcpw/mods/fml/common/Loader;isModLoaded(Ljava/lang/String;)Z"))
    private static boolean initialize$isModLoaded(String modname) {
        return false;
    }
}
