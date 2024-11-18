package net.anoltongi.bakedncaked.item;

import net.anoltongi.bakedncaked.BakedNCakedMod;
import net.anoltongi.bakedncaked.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BakedNCakedMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_MODE_TAB = CREATIVE_MODE_TABS.register("bakedncaked_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOAST.get()))
                    .title(Component.translatable("creativetab.bakedncaked_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.BREAD_SLICE.get());
                        output.accept(ModItems.CHOCOLATE_PASTE.get());
                        output.accept(ModItems.CHOCOLATE_PASTE_BREAD_SLICE.get());
                        output.accept(ModItems.GLOW_BERRY_JAM.get());
                        output.accept(ModItems.GLOW_BERRY_JAM_BREAD_SLICE.get());
                        output.accept(ModItems.SWEET_BERRY_JAM.get());
                        output.accept(ModItems.SWEET_BERRY_JAM_BREAD_SLICE.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}