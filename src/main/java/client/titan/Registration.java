package client.titan;

import common.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Item> ITEMS= DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static void register(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ModItems.register();
    }
}
