package Titan;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> TITAN = ITEMS.register("titan", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.MATERIALS)
            )
    );

    public static final RegistryObject<SwordItem> TITAN_SwORD = ITEMS.register("titan_sword", () -> new SwordItem(3, 2,-2.4F, new Item.Properties().group(ExampleMod.MODID)));
}
