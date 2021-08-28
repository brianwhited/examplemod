package net.dreadpiratebrian.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	
	// an instance of our new item
    public static final FabricItem FABRIC_ITEM = new FabricItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("examplemod", "fabric_item"), FABRIC_ITEM);
    } 
}
