package com.monka.newmansland.core.registry;

import com.monka.newmansland.common.block.PebbleBlock;
import com.monka.newmansland.common.block.ShortGrassBlock;
import com.monka.newmansland.core.NewMansLand;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NMLBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NewMansLand.MODID);

    public static final RegistryObject<Block> WHITE_MUSHROOM = BLOCKS.register("white_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS).lightLevel((p_50892_) -> {return 1;
                    }).pushReaction(PushReaction.DESTROY), TreeFeatures.HUGE_BROWN_MUSHROOM));

    public static final RegistryObject<Block> PEBBLES = BLOCKS.register("pebbles",
            () -> new PebbleBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.STONE).instabreak().noCollission()));

    public static final RegistryObject<Block> SHORT_GRASS = BLOCKS.register("short_grass",
            () -> new ShortGrassBlock(Block.Properties.copy(Blocks.FERN).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
