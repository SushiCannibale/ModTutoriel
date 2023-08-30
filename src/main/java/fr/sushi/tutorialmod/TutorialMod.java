package fr.sushi.tutorialmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TutorialMod.MODID)
public class TutorialMod
{
    public static final String MODID = "tutorialmod";

    public TutorialMod() {
        ModRegistry.registerAll(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
