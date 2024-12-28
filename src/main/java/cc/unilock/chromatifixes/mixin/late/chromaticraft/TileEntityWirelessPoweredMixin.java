package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import Reika.ChromatiCraft.Base.TileEntity.TileEntityAdjacencyUpgrade;
import Reika.ChromatiCraft.Base.TileEntity.TileEntityWirelessPowered;
import Reika.ChromatiCraft.Registry.CrystalElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TileEntityWirelessPowered.class, remap = false)
public class TileEntityWirelessPoweredMixin {
    @Shadow
    private static TileEntityAdjacencyUpgrade.AdjacencyCheckHandlerImpl adjacency;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(CallbackInfo ci) {
        adjacency = TileEntityAdjacencyUpgrade.getOrCreateAdjacencyCheckHandler(CrystalElement.BLACK, null);
    }
}
