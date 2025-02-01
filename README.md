# ChromatiFixes

Various fixes for issues found in some of Reika's mods

Most credit goes to [gamrguy](https://github.com/gamrguy) a.k.a. "RobotLucca" a.k.a. "thegamemaster1234" for creating the original ASM-based ChromatiFixes

Fixes:
- CaveControl
  - Prevents `CaveLoader#getEffectiveBiome` from ever returning a null biome, fixing crashes usually caused by pylon chunk loading
- ChromatiCraft
  - Allows disabling the Artefact shader
  - Prevents crashes in `ChromaClientEventController#updateGlowCliffRendering`
  - Ignores the order progress was made in `ProgressionManager#isProgressionEqual`
  - Prevents random ConcurrentModificationExceptions during pylon overlay rendering
  - Prevents the Lumen Beacon from interfering with itself
  - Enable Lumen Alveary Humidity and Temperature controls when the Princess is unable to work (as these are designed to allow the Princess to work in the first place)
  - Prevents crashes caused by Adjacency Cores on neighbor state updates
- Satisforestry
  - Allow Pressurizer multiblock to receive RotaryCraft power via Power Hub
- DragonRealmCore
  - Allows disabling the Nether shader
  - Prevents NullPointerExceptions caused by Hex Generators
  - Prevents crashes in `EnergizationManager#getEnergizationLevel` (however, the chosen fix prevents playing with the "Atmospheric Permeability Mediation" mechanic - thus it is configurable, but enabled by default)
