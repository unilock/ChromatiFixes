package cc.unilock.chromatifixes;

import com.gtnewhorizon.gtnhmixins.ILateMixinLoader;
import com.gtnewhorizon.gtnhmixins.LateMixin;
import cpw.mods.fml.relauncher.FMLLaunchHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@LateMixin
public class LateMixinLoader implements ILateMixinLoader {
    @Override
    public String getMixinConfig() {
        return "mixins.chromatifixes.late.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedMods) {
        final boolean chromaticraft = loadedMods.contains("ChromatiCraft");

        List<String> mixins = new ArrayList<>();
        if (FMLLaunchHandler.side().isClient()) {
            if (chromaticraft) {
                // TODO
            }
        }
        if (chromaticraft) {
            mixins.add("chromaticraft.TileEntityWirelessPoweredMixin");
        }
        return mixins;
    }
}
