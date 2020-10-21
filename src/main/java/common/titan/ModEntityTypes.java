package common.titan;

import client.titan.ExampleMod;
import entities.PikachuEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MODID);

    public static final RegistryObject<EntityType<PikachuEntity>> PIKACHU = ENTITY_TYPES.register("pikachu",
            () -> EntityType.Builder.create(PikachuEntity::new, EntityClassification.CREATURE)
            .size(1.0f,1.0f)
                    .build(new ResourceLocation(ExampleMod.MODID, "pikachu").toString()));

}
