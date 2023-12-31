package com.monka.newmansland.data.server;

import com.monka.newmansland.core.NewMansLand;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NMLItemTagsProvider extends ItemTagsProvider {


    public NMLItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagsProvider blocks, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, blocks.contentsGetter(), NewMansLand.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        tag(Tags.Items.EGGS).add(ItemRegistry.UGG_EGG.get());
    }
}
