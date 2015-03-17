package MrModas;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModasStartPoint.MODID, version = ModasStartPoint.VERSION)
public class ModasStartPoint
{
    public static final String MODID = "MrModas";
    public static final String VERSION = "1.7.10_1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
