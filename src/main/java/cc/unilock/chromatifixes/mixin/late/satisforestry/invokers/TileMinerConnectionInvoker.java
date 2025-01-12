package cc.unilock.chromatifixes.mixin.late.satisforestry.invokers;

import Reika.Satisforestry.Blocks.BlockSFMultiBase;
import Reika.Satisforestry.Miner.TileResourceHarvesterBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = BlockSFMultiBase.TileMinerConnection.class, remap = false)
public interface TileMinerConnectionInvoker<T extends TileResourceHarvesterBase> {
    @Invoker("getRoot")
    T _getRoot();
}
