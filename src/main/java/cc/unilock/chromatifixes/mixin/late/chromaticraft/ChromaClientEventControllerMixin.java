package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import Reika.ChromatiCraft.ChromaClientEventController;
import cc.unilock.chromatifixes.ChromatiFixes;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import cpw.mods.fml.common.gameevent.TickEvent;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ChromaClientEventController.class, remap = false)
public class ChromaClientEventControllerMixin {
    /**
     * @author thegamemaster1234
     * @reason catch Exception
     */
    @WrapMethod(method = "updateGlowCliffRendering")
    private void updateGlowCliffRendering(TickEvent.ClientTickEvent evt, Operation<Void> original) {
        try {
            original.call(evt);
        } catch (Exception ignored) {
            ChromatiFixes.LOGGER.warn("Exception caught in ChromaClientEventController#updateGlowCliffRendering");
        }
    }
}
