package com.speakerhornet.spcomponents.tabs;

import com.speakerhornet.spcomponents.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ComponentsTab extends CreativeTabs {

	public ComponentsTab(String label) {
		
		super("spcomponents_tab");
		
	}
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.ITEM_FRAME);
		}
	
	
}
