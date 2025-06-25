package cc.unilock.chromatifixes.mixin.late.dragonrealmcore;

import Reika.DragonRealmCore.Util.ReflectiveManagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ReflectiveManagers.class, remap = false)
public class ReflectiveManagersMixin {
    /**
     * @author unilock
     * @reason does not work with newer Binnie's Mods!<br>TODO: reimplement
     */
    @Redirect(method = "filterBeeProducts", at = @At(value = "INVOKE", target = "Lcpw/mods/fml/common/Loader;isModLoaded(Ljava/lang/String;)Z"))
    private boolean filterBeeProducts$isModLoaded(String modname) {
        return false;
    }
}
