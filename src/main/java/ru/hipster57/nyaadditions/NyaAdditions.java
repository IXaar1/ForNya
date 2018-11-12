package ru.hipster57.nyaadditions;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.hipster57.nyaadditions.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class NyaAdditions {

    @SidedProxy(serverSide = Reference.SERVERSIDE, clientSide = Reference.CLIENTSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){

        proxy.preInit(e);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){

        proxy.init(e);

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent e){

        proxy.postinit(e);

    }
}
