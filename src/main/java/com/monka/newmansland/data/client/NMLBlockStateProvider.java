package com.monka.newmansland.data.client;

import com.monka.newmansland.core.NewMansLand;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NMLBlockStateProvider extends BlockStateProvider {
    public NMLBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NewMansLand.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

//    private void crossModel(Block plant) {
//        simpleBlock(plant, models().cross(plant.getRegistryName().getPath(), modLoc("block/" + plant.getRegistryName().getPath())));
//    }
}