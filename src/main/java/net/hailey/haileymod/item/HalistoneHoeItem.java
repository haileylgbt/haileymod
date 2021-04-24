
package net.hailey.haileymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.hailey.haileymod.HaileymodModElements;

@HaileymodModElements.ModElement.Tag
public class HalistoneHoeItem extends HaileymodModElements.ModElement {
	@ObjectHolder("haileymod:halistone_hoe")
	public static final Item block = null;
	public HalistoneHoeItem(HaileymodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("halistone_hoe"));
	}
}
