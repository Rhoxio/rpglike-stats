package net.rhoxio.rpglikestats;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.rhoxio.rpglikestats.registry.ModBlocks;
import net.rhoxio.rpglikestats.registry.ModItems;
import net.minecraft.util.Identifier;

public class Initialize implements ModInitializer   {

    public static final String MOD_ID = "rpglikestats";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"), 
        () -> new ItemStack(ModItems.DOT)
    );

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
        new Identifier(MOD_ID, "advanced"))
        .icon(() -> new ItemStack(Items.EXPERIENCE_BOTTLE))
        .appendItems(stacks -> {
            stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
            stacks.add(new ItemStack(Blocks.LAPIS_BLOCK));
            stacks.add(new ItemStack(Items.EXPERIENCE_BOTTLE));
        }).build();
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
    
}
