
package net.hailey.haileymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.hailey.haileymod.HaileymodModElements;

@HaileymodModElements.ModElement.Tag
public class HalistoneSwordItem extends HaileymodModElements.ModElement {
	@ObjectHolder("haileymod:halistone_sword")
	public static final Item block = null;
	public HalistoneSwordItem(HaileymodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HalistoneDustItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("halistone_sword"));
	}
}
