package net.anoltongi.bakedncaked.datagen.loot;

import net.anoltongi.bakedncaked.item.ModItems;
import net.anoltongi.bakedncaked.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //this.dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        this.dropWhenSilkTouch(ModBlocks.APPLE_PIE.get());
        this.dropWhenSilkTouch(ModBlocks.SWEET_BERRY_PIE.get());
        this.dropWhenSilkTouch(ModBlocks.GLOW_BERRY_PIE.get());
        this.dropWhenSilkTouch(ModBlocks.BLUE_BERRY_PIE.get());
        this.dropWhenSilkTouch(ModBlocks.CHOCOLATE_CAKE.get());
        this.dropWhenSilkTouch(ModBlocks.CARROT_CAKE.get());

        //this.add(ModBlocks.ALEXANDRITE_ORE.get(),
                //block -> createOreDrop(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
