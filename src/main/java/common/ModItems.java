package common;

import client.titan.Registration;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final RegistryObject<Item> TITAN_INGOT = Registration.ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TITAN_SWORD = Registration.ITEMS.register("titan_sword",
            () -> new SwordItem();
  //nothing in it only for "classloading"
public static void register(){

}
}
