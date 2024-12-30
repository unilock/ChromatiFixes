package cc.unilock.chromatifixes;

import cpw.mods.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ChromatiFixes.MOD_ID, version = Tags.VERSION, name = "ChromatiFixes", acceptedMinecraftVersions = "[1.7.10]", acceptableRemoteVersions = "*", dependencies = "after:CaveControl;"+"after:ChromatiCraft;"+"after:DragonRealmCore;"+"after:gtnhlib;")
public class ChromatiFixes {
    public static final String MOD_ID = "chromatifixes";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
}
