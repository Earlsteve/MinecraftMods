package common.titan;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.LootModifier;

import java.util.List;

public class TitanOreDrop extends LootModifier {
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected TitanOreDrop(ILootCondition[] conditionsIn) {
        super(conditionsIn);
    }

    //@org.jetbrains.annotations.NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        return null;
    }

}
