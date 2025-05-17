package cc.unilock.chromatifixes.mixin.late.chromaticraft.client;

import Reika.ChromatiCraft.ModInterface.NEI.CrystalFurnaceHandler;
import codechicken.nei.recipe.TemplateRecipeHandler;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.awt.Rectangle;

@Mixin(value = CrystalFurnaceHandler.class, remap = false)
public abstract class CrystalFurnaceHandlerMixin extends TemplateRecipeHandler {
    /**
     * @author FlamingKetchup
     * @reason Fix GTNewHorizons/NotEnoughItems #595 (ChromatiCraft handlers
     * missing in later releases)
     */
    @Overwrite
    public void loadTransferRects() {
        transferRects.add(new RecipeTransferRect(new Rectangle(70, 13, 34, 29), "ccfurnace"));
    }

}
