package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import Reika.ChromatiCraft.Block.Worldgen.BlockLootChest;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = BlockLootChest.class, remap = false)
public class BlockLootChestMixin {
    /**
     * @author unilock
     * @reason allow opening loot chests with a block above them (such as those under Data Towers); @Redirect to fail hard
     */
    @Redirect(method = "canOpen", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isSideSolid(IIILnet/minecraftforge/common/util/ForgeDirection;)Z"))
    private static boolean canOpen(World instance, int x, int y, int z, ForgeDirection side) {
        return true;
    }
}
