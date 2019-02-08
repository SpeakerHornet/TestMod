package com.speakerhornet.spcomponents.items.tools;

import com.speakerhornet.spcomponents.Main;
import com.speakerhornet.spcomponents.init.ModItems;
import com.speakerhornet.spcomponents.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{

	public ToolPickaxe(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
	
	
}
