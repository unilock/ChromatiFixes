package cc.unilock.chromatifixes;

import com.gtnewhorizon.gtnhlib.config.Config;

@Config(modid = "chromatifixes")
public class ChromatiFixesConfig {
    @Config.Comment("Disables the shader found near Data Towers from ChromatiCraft")
    @Config.DefaultBoolean(false)
    public static boolean disableArtefactShader;

    @Config.Comment("Disables the \"heat\" shader in the Nether from DragonRealmCore")
    @Config.DefaultBoolean(false)
    public static boolean disableNetherShader;

    @Config.Comment("Forces DragonAPI's \"client-specific\" config options to use the same keys across all systems")
    @Config.DefaultBoolean(false)
    @Config.RequiresMcRestart
    public static boolean disableClientSpecificConfigs;

    @Config.Comment("Disables the TerritoryZone-based Stronghold generation system from DragonRealmCore")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean disableTerritoryStrongholdSystem;

    @Config.Comment("Prevents crashes in `EnergizationManager#getEnergizationLevel`; breaks DragonRealmCore's \"Atmospheric Permeability Mediation\" mechanic")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean energizationManagerFix;
}
