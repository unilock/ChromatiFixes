package cc.unilock.chromatifixes.mixin.late.chromaticraft.client;

import Reika.ChromatiCraft.ModInterface.NEI.EnchantDecompHandler;
import codechicken.nei.recipe.TemplateRecipeHandler;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.awt.Rectangle;

@Mixin(value = EnchantDecompHandler.class, remap = false)
public abstract class EnchantDecompHandlerMixin extends TemplateRecipeHandler {
    /**
     * @author FlamingKetchup
     * @reason Fix GTNewHorizons/NotEnoughItems #595 (ChromatiCraft handlers
     * missing in later releases)
     */
    @Overwrite
    public void loadTransferRects() {
        transferRects.add(new RecipeTransferRect(new Rectangle(100, 13, 24, 29), "ccenchantdecomp"));
    }

}

