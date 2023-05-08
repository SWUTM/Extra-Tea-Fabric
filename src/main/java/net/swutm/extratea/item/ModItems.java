package net.swutm.extratea.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.extratea.extratea;

public class ModItems {

    public static final Item CUP = registerItem("cup",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BLACK_TEA_LEAF = registerItem("black_tea_leaf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item GREEN_TEA_LEAF = registerItem("green_tea_leaf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RED_TEA_LEAF = registerItem("red_tea_leaf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MINT = registerItem("mint",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BLACK_TEA = registerItem("black_tea",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BLACK_TEA)));

    public static final Item GREEN_TEA = registerItem("green_tea",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GREEN_TEA)));

    public static final Item KARKADE_TEA = registerItem("karkade_tea",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.KARKADE_TEA)));

    public static final Item MINT_TEA = registerItem("mint_tea",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.MINT_TEA)));

    public static final Item CHAMOMILE_TEA = registerItem("chamomile_tea",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CHAMOMILE_TEA)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(extratea.MOD_ID, name), item);
    }

    public static void registerModItems() {
        extratea.LOGGER.debug("Registering Mod Items for " + extratea.MOD_ID);
    }
}
