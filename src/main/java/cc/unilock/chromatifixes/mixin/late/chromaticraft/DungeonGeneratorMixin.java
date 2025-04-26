package cc.unilock.chromatifixes.mixin.late.chromaticraft;

import java.io.File;
import Reika.DragonAPI.IO.ReikaFileReader;
import Reika.ChromatiCraft.World.IWG.DungeonGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = DungeonGenerator.class, remap = false)
public abstract class DungeonGeneratorMixin {
    private static String cachedPath;
    private static File cachedWorldDirectory;

    /**
     * @author FlamingKetchup
     * @reason cache the world directory path
     */
    @Redirect(
        method = "updateNoisemaps",
        at = @At(
            value = "INVOKE",
            target = "LReika/DragonAPI/IO/ReikaFileReader;getRealPath(Ljava/io/File;)Ljava/lang/String;"
        )
    )
    private static String getRealPath$updateNoisemaps(File f) {
        if (cachedPath == null || cachedWorldDirectory != f) {
            cachedPath = ReikaFileReader.getRealPath(f);
            cachedWorldDirectory = f;
        }
        return cachedPath;
    }
}
