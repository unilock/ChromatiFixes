package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(targets = {"Reika/ChromatiCraft/ModInterface/Bees/TileEntityLumenAlveary$HumidityMatchingEffect", "Reika/ChromatiCraft/ModInterface/Bees/TileEntityLumenAlveary$TemperatureMatchingEffect"}, remap = false)
public class TileEntityLumenAlvearyEffectMixins {
    /**
     * @author thegamemaster1234
     * @reason return true
     */
    @Overwrite
    protected boolean worksWhenBeesDoNot() {
        return true;
    }
}
