package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import Reika.ChromatiCraft.Magic.Network.PylonFinder;
import Reika.DragonAPI.Instantiable.Data.Immutable.Coordinate;
import cc.unilock.chromatifixes.ChromatiFixes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

@Mixin(value = PylonFinder.class, remap = false)
public class PylonFinderMixin {
    /**
     * @author thegamemaster1234
     * @reason catch Exception and retry if necessary
     */
    @ModifyVariable(method = "canRainOn", at = @At("HEAD"), argsOnly = true)
    private static Set<Coordinate> canRainOn(Set<Coordinate> set) {
        boolean repeat;
        do {
            repeat = false;

            try {
                set = new HashSet<>(set);
            } catch (ConcurrentModificationException ignored) {
                ChromatiFixes.LOGGER.warn("ConcurrentModificationException caught in PylonFinder#canRainOn");
                repeat = true;
            }
        } while (repeat);

        return set;
    }
}
