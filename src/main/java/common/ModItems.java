package common;

import client.titan.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final RegistryObject<Item> TITAN_INGOT = Registration.ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    

}
