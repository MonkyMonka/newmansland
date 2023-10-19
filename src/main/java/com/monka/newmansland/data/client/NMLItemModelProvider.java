package com.monka.newmansland.data.client;

import com.monka.newmansland.core.NewMansLand;
import com.monka.newmansland.core.registry.NMLItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NMLItemModelProvider extends ItemModelProvider {
    public NMLItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NewMansLand.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(NMLItemRegistry.PEBBLES);
        simpleBlockItem(NMLItemRegistry.WHITE_MUSHROOM);
        simpleBlockItem(NMLItemRegistry.SHORT_GRASS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NewMansLand.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NewMansLand.MODID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder spawnEggItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("minecraft:item/template_spawn_egg"));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(NewMansLand.MODID, "item/" + item.getId().getPath()));
    }

}