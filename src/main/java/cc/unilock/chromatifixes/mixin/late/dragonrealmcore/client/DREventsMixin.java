package cc.unilock.chromatifixes.mixin.late.dragonrealmcore.client;

import Reika.DragonRealmCore.DREvents;
import cc.unilock.chromatifixes.ChromatiFixesConfig;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = DREvents.class, remap = false)
public class DREventsMixin {
    /**
     * @author unilock
     * @reason allow disabling the shader via config
     */
    @WrapOperation(method = "applyNetherShader", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;thePlayer:Lnet/minecraft/client/entity/EntityClientPlayerMP;", opcode = Opcodes.GETFIELD))
    private EntityClientPlayerMP applyNetherShader(Minecraft instance, Operation<EntityClientPlayerMP> original) {
        if (ChromatiFixesConfig.disableNetherShader) return null;
        return original.call(instance);
    }
}
