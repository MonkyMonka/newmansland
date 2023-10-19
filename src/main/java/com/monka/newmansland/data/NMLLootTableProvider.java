package com.monka.newmansland.data;

import com.monka.newmansland.data.server.NMLBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.Set;

public class NMLLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(),
                Collections.singletonList(new LootTableProvider.SubProviderEntry(NMLBlockLootTables::new, LootContextParamSets.BLOCK)));

    }
}