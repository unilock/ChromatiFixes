package cc.unilock.chromatifixes.mixin.late.satisforestry;

import Reika.RotaryCraft.API.Power.ShaftPowerReceiver;
import Reika.Satisforestry.Blocks.BlockSFMultiBase.TileShaftConnection;
import cc.unilock.chromatifixes.mixin.late.satisforestry.invokers.TileMinerConnectionInvoker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = TileShaftConnection.class, remap = false)
abstract class TileShaftConnectionMixin {

    /**
     * @author thegamemaster1234
     * @reason fix instanceof checks to allow power hub to work on pressurizer
     */
    @Overwrite
    public void setOmega(int omega) {
        Object root = ((TileMinerConnectionInvoker)this)._getRoot();
        if (((TileShaftConnection)(Object)this).isReceiving() && root != null)
            ((ShaftPowerReceiver)root).setOmega(omega);
    }

    /**
     * @author thegamemaster1234
     * @reason fix instanceof checks to allow power hub to work on pressurizer
     */
    @Overwrite
    public void setTorque(int torque) {
        Object root = ((TileMinerConnectionInvoker)this)._getRoot();
        if (((TileShaftConnection)(Object)this).isReceiving() && root != null)
            ((ShaftPowerReceiver)root).setTorque(torque);
    }

    /**
     * @author thegamemaster1234
     * @reason fix instanceof checks to allow power hub to work on pressurizer
     */
    @Overwrite
    public void setPower(long power) {
        Object root = ((TileMinerConnectionInvoker)this)._getRoot();
        if (((TileShaftConnection)(Object)this).isReceiving() && root != null)
            ((ShaftPowerReceiver)root).setPower(power);
    }
}
