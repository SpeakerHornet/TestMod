package com.speakerhornet.spcomponents.items;

import com.speakerhornet.spcomponents.Main;
import com.speakerhornet.spcomponents.init.ModItems;
import com.speakerhornet.spcomponents.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.COMPONENTS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
