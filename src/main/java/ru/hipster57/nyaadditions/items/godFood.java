package ru.hipster57.nyaadditions.items;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class godFood extends ItemFood {

    public godFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,999999999,250,true, false));
            player.addPotionEffect(new PotionEffect(MobEffects.SATURATION,999999999,250,true,false));
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,999999999,1,true,false));
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,999999999,250,true,false));

    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
