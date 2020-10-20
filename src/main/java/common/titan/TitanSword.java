package common.titan;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class TitanSword extends SwordItem {

    public TitanSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
        this.setRegistryName("Titan Sword");
    }

}
