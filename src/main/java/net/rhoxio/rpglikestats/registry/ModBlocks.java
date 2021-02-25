package net.rhoxio.rpglikestats.registry;

import net.rhoxio.rpglikestats.Initialize;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.sound.BlockSoundGroup.METAL;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 3)
        .requiresTool()
        .strength(6.0f, 10.0f)
        .sounds(METAL)
    );

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Initialize.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
    
}
