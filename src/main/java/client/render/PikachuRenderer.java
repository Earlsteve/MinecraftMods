package client.render;

import client.model.PikachuModel;
import client.titan.ExampleMod;
import entities.PikachuEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PikachuRenderer extends MobRenderer<PikachuEntity, PikachuModel<PikachuEntity>> {


    protected static final ResourceLocation TEXTURE = new ResourceLocation(ExampleMod.MODID,"textures/entity/pikachu.png");

    public PikachuRenderer(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new PikachuModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(PikachuEntity entity) {
        return TEXTURE;
    }
}
