package cc.unilock.chromatifixes;

import com.gtnewhorizon.gtnhlib.config.ConfigException;
import com.gtnewhorizon.gtnhlib.config.ConfigurationManager;
import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@IFMLLoadingPlugin.MCVersion("1.7.10")
public class EarlyMixinLoader implements IFMLLoadingPlugin, IEarlyMixinLoader {
    static {
        try {
            ConfigurationManager.registerConfig(ChromatiFixesConfig.class);
        } catch (ConfigException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getMixinConfig() {
        return "mixins.chromatifixes.early.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoreMods) {
        final boolean dragonrealmcore = loadedCoreMods.contains("Reika.DragonRealmCore.DragonRealmASM");

        List<String> mixins = new ArrayList<>();

        if (dragonrealmcore) {
            if (ChromatiFixesConfig.disableTerritoryStrongholdSystem) {
                mixins.add("dragonrealmcore.stronghold.StrongholdLocationControlMixin");
            }
        }

        return mixins;
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        // NO-OP
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
