package squeek.applecore.mixins.early.minecraft.accessors;

import net.minecraft.util.FoodStats;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FoodStats.class)
public interface FoodStatsAccessor {

    @Accessor
    void setFoodlevel(int foodlevel);

    @Accessor
    void setFoodSaturationLevel(float foodSaturationLevel);

    @Accessor
    void setFoodExhaustionLevel(float foodExhaustionLevel);

    @Accessor
    float getFoodExhaustionLevel();

    @Accessor
    void setFoodTimer(int foodTimer);
}
