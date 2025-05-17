package cc.unilock.chromatifixes.mixin.late.chromaticraft.client;

import Reika.ChromatiCraft.ModInterface.NEI.FabricatorHandler;
import Reika.ChromatiCraft.GUI.Tile.Inventory.GuiItemFabricator;
import net.minecraft.client.gui.inventory.GuiContainer;
import codechicken.nei.recipe.TemplateRecipeHandler;


import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;

import java.awt.Rectangle;

@Mixin(value = FabricatorHandler.class, remap = false)
public abstract class FabricatorHandlerMixin extends TemplateRecipeHandler {
    /**
     * @author FlamingKetchup
     * @reason Fix Fabricator transferRect (the thing that you click on in
     * the crafter GUI to open recipes for the crafter)
     */
    @ModifyReturnValue(method = "getGuiClass", at = @At("RETURN"))
    private Class<? extends GuiContainer> getGuiClass(Class<? extends GuiContainer> original) {
        if (original == null)
            return GuiItemFabricator.class;
        else
            return original;
    }

    /**
     * @author FlamingKetchup
     * @reason Fix GTNewHorizons/NotEnoughItems #595 (ChromatiCraft handlers
     * missing in later releases)
     * Rect adjusted to be over progress bar
     */
    @Overwrite
    public void loadTransferRects() {
        transferRects.add(new RecipeTransferRect(new Rectangle(60, 4, 70, 56), "ccfabric"));
    }

}
