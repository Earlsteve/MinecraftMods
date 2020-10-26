package client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import entities.PikachuEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PikachuModel <T extends PikachuEntity>extends EntityModel<T>
{
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer legFrontRight;
    private final ModelRenderer legBackRight;
    private final ModelRenderer legFrontLeft;
    private final ModelRenderer legBackLeft;

    public PikachuModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 9.0F, -3.0F);
        head.setTextureOffset(0, 20).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 7).addBox(-3.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(6, 0).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -5.0F, 8.0F, 10.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(8, 26).addBox(-1.0F, -10.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        legFrontRight = new ModelRenderer(this);
        legFrontRight.setRotationPoint(-3.0F, 19.0F, -4.0F);
        legFrontRight.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        legBackRight = new ModelRenderer(this);
        legBackRight.setRotationPoint(3.0F, 19.0F, -4.0F);
        legBackRight.setTextureOffset(18, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        legFrontLeft = new ModelRenderer(this);
        legFrontLeft.setRotationPoint(3.0F, 19.0F, 4.0F);
        legFrontLeft.setTextureOffset(24, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        legBackLeft = new ModelRenderer(this);
        legBackLeft.setRotationPoint(-3.0F, 19.0F, 4.0F);
        legBackLeft.setTextureOffset(0, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T t, float v, float v1, float v2, float v3, float v4) {

    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        legFrontRight.render(matrixStack, buffer, packedLight, packedOverlay);
        legBackRight.render(matrixStack, buffer, packedLight, packedOverlay);
        legFrontLeft.render(matrixStack, buffer, packedLight, packedOverlay);
        legBackLeft.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
