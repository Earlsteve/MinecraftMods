package common.titan;

import client.titan.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final RegistryObject<Block> TITAN_ORE =registerBlockAsItem("titan_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(33f, 454f).harvestLevel(3).sound(SoundType.CROP)));

    public static void register(){}

   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);

   }
    private static <T extends Block> RegistryObject<T> registerBlockAsItem(String name, Supplier<T> block){
        //register block as block
        RegistryObject<T> x = registerBlock(name, block);
        //change block to Item
        Registration.ITEMS.register(name, ()-> new BlockItem(x.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

        return x;
    }
}
