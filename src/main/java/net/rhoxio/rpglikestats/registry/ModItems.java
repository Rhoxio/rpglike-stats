package net.rhoxio.rpglikestats.registry;

import net.rhoxio.rpglikestats.Initialize;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items
    public static final Item DOT = new Item(new Item.Settings().group(Initialize.ITEM_GROUP));

    // Blocks
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(Initialize.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Initialize.MOD_ID, "dot"), DOT);
        Registry.register(Registry.ITEM, new Identifier(Initialize.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }

}
