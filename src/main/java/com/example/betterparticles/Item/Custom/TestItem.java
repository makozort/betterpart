package com.example.betterparticles.Item.Custom;


import mod.chloeprime.aaaparticles.AAAParticles;
import mod.chloeprime.aaaparticles.api.common.AAALevel;
import mod.chloeprime.aaaparticles.api.common.ParticleEmitterInfo;
import net.minecraft.core.BlockPos;

import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.InteractionResult;

import net.minecraft.world.item.Item;

import net.minecraft.world.item.context.UseOnContext;

import net.minecraft.world.level.Level;


public class TestItem extends Item {

    private static final ParticleEmitterInfo HERALD = new ParticleEmitterInfo(ResourceLocation.fromNamespaceAndPath("betterparts","herald"));

    public TestItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        if (level.isClientSide) {
            AAALevel.addParticle(level,false ,HERALD.clone().position(pos.getX() + .5d,pos.getY()+.5d,pos.getZ()+.5d));
        }
        return super.useOn(context);
    }
}
