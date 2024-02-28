package net.twinkletoes.miningtools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.twinkletoes.miningtools.Miningtools;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HARDHAT = registerItem("hardhat", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemsGroup(FabricItemGroupEntries entries){
        entries.add(HARDHAT);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Miningtools.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Miningtools.LOGGER.info("Registering Mod Items for " + Miningtools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemsGroup);
    }

}
