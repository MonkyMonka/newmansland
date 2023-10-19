package com.monka.newmansland.data.server;

import com.monka.newmansland.core.registry.NMLBlockRegistry;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashSet;
import java.util.Set;

public class NMLBlockLootTables extends BlockLootSubProvider {

    private final Set<Block> generatedLootTables = new HashSet<>();
    public NMLBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }

}