package cc.unilock.chromatifixes.mixin.late.chromaticraft.client;

import Reika.ChromatiCraft.ModInterface.NEI.FabricatorHandler;
import codechicken.nei.recipe.TemplateRecipeHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.awt.*;

@Mixin(value = FabricatorHandler.class, remap = false)
public abstract class FabricatorHandlerMixin extends TemplateRecipeHandler {
    /**
     * @author FlamingKetchup
     * @reason Remove client player openContainer instanceof check; @Overwrite to fail hard
     */
    @Overwrite
    public void loadTransferRects() {
        transferRects.add(new RecipeTransferRect(new Rectangle(32, -12, 105, 10), "ccfabric"));
    }
}
