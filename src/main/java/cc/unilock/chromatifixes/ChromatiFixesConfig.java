package cc.unilock.chromatifixes;

import com.gtnewhorizon.gtnhlib.config.Config;

@Config(modid = "chromatifixes")
public class ChromatiFixesConfig {
    @Config.DefaultBoolean(false)
    public static boolean disableArtefactShader;

    @Config.DefaultBoolean(false)
    public static boolean disableNetherShader;

    @Config.DefaultBoolean(true)
    public static boolean disableTerritoryStrongholdSystem;

    @Config.DefaultBoolean(true)
    public static boolean energizationManagerFix;
}
