package net.anoltongi.bakedncaked.item;

import net.anoltongi.bakedncaked.BakedNCakedMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BakedNCakedMod.MOD_ID);

    //public static final RegistryObject<Item> TEMP = ITEMS.register("alexandrite",
            //() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice",
        () -> new Item(new Item.Properties().food(ModFoodProperties.BREAD_SLICE)));

    public static final RegistryObject<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));

    public static final RegistryObject<Item> CHOCOLATE_PASTE = ITEMS.register("chocolate_paste",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_PASTE)));

    public static final RegistryObject<Item> CHOCOLATE_PASTE_BREAD_SLICE = ITEMS.register("chocolate_paste_bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_PASTE_BREAD_SLICE)));

    public static final RegistryObject<Item> GLOW_BERRY_JAM = ITEMS.register("glow_berry_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_JAM)));

    public static final RegistryObject<Item> GLOW_BERRY_JAM_BREAD_SLICE = ITEMS.register("glow_berry_jam_bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_JAM_BREAD_SLICE)));

    public static final RegistryObject<Item> SWEET_BERRY_JAM = ITEMS.register("sweet_berry_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_JAM)));

    public static final RegistryObject<Item> SWEET_BERRY_JAM_BREAD_SLICE = ITEMS.register("sweet_berry_jam_bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_JAM_BREAD_SLICE)));

    //public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            //() -> new FuelItem(new Item.Properties(), 200));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}