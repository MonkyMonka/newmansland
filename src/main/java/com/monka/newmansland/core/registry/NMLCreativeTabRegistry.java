package com.monka.newmansland.core.registry;

import com.monka.newmansland.core.NewMansLand;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = NewMansLand.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NMLCreativeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMansLand.MODID);

    public static final RegistryObject<CreativeModeTab> NEWMANSLAND_TAB = CREATIVE_TABS.register("newmansland_tab", () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("itemGroup.newmansland"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(NMLItemRegistry.PEBBLES.get()))
            // Add default items to tab
            .displayItems((displayParams, output) ->
                    NMLItemRegistry.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
            .withSearchBar()
            .build()
    );
}
