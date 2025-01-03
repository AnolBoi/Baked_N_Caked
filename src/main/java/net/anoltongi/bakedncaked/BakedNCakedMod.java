package net.anoltongi.bakedncaked;

import com.mojang.logging.LogUtils;
import net.anoltongi.bakedncaked.block.ModBlocks;
import net.anoltongi.bakedncaked.item.ModCreativeModeTabs;
import net.anoltongi.bakedncaked.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BakedNCakedMod.MOD_ID)
public class BakedNCakedMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bakedncaked";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BakedNCakedMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //event.accept(ModItems.temp);

        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
                //event.accept(ModBlocks.ALEXANDRITE_BLOCK);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.BREAD_SLICE);
            event.accept(ModItems.TOAST);
            event.accept(ModItems.CHOCOLATE_PASTE);
            event.accept(ModItems.CHOCOLATE_PASTE_BREAD_SLICE);
            event.accept(ModItems.SWEET_BERRY_JAM);
            event.accept(ModItems.SWEET_BERRY_JAM_BREAD_SLICE);
            event.accept(ModItems.GLOW_BERRY_JAM);
            event.accept(ModItems.GLOW_BERRY_JAM_BREAD_SLICE);
        }
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
