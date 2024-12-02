package net.anoltongi.bakedncaked.datagen;

import net.anoltongi.bakedncaked.BakedNCakedMod;
import net.anoltongi.bakedncaked.block.ModBlocks;
import net.anoltongi.bakedncaked.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BakedNCakedMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BREAD_SLICE);
        simpleItem(ModItems.TOAST);
        simpleItem(ModItems.CHOCOLATE_PASTE);
        simpleItem(ModItems.CHOCOLATE_PASTE_BREAD_SLICE);
        simpleItem(ModItems.SWEET_BERRY_JAM);
        simpleItem(ModItems.SWEET_BERRY_JAM_BREAD_SLICE);
        simpleItem(ModItems.GLOW_BERRY_JAM);
        simpleItem(ModItems.GLOW_BERRY_JAM_BREAD_SLICE);

        simpleBlockItem(ModBlocks.APPLE_PIE);
        simpleBlockItem(ModBlocks.SWEET_BERRY_PIE);
        simpleBlockItem(ModBlocks.GLOW_BERRY_PIE);
        simpleBlockItem(ModBlocks.BLUE_BERRY_PIE);
        simpleBlockItem(ModBlocks.CHOCOLATE_CAKE);
        simpleBlockItem(ModBlocks.CARROT_CAKE);

        handheldItem(ModItems.KNIFE);

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BakedNCakedMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BakedNCakedMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BakedNCakedMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
