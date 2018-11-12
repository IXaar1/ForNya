package ru.hipster57.nyaadditions.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.hipster57.nyaadditions.items.ItemsInit;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        ItemsInit.register();
    }

    public void init(FMLInitializationEvent e){

    }

    public void postinit(FMLPostInitializationEvent e){

    }

}
