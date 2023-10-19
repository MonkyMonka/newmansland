package com.monka.newmansland.core.registry;

import com.google.common.collect.Sets;
import com.monka.newmansland.core.NewMansLand;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;
public class NMLItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NewMansLand.MODID);

    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    // Blocks
    public static final RegistryObject<Item> PEBBLES = registerWithTab("pebbles",
            () -> new BlockItem(NMLBlockRegistry.PEBBLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MUSHROOM = registerWithTab("white_mushroom",
            () -> new BlockItem(NMLBlockRegistry.WHITE_MUSHROOM.get(), new Item.Properties()));
    public static final RegistryObject<Item> SHORT_GRASS = registerWithTab("short_grass",
            () -> new BlockItem(NMLBlockRegistry.SHORT_GRASS.get(), new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}