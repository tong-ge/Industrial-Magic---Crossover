package com.rumaruka.emt.tile.solar.fire;

import com.rumaruka.emt.init.EMTBlocks;
import com.rumaruka.emt.util.EMTConfigHandler;
import ic2.api.energy.prefab.BasicSource;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scala.actors.threadpool.Arrays;

import java.util.List;

public class TileEntityDoubleFireSolar extends TileEntityFireSolar {
    public TileEntityDoubleFireSolar(){
        super();
        energy = new BasicSource(this, 10000, 4);
        output = EMTConfigHandler.doubleCompressedSolarOutput;

    }


    @Override
    public List<ItemStack> getWrenchDrops(World world, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity, EntityPlayer entityPlayer, int i) {
        return Arrays.asList(new ItemStack[]{new ItemStack(EMTBlocks.solar_firedoublecompressed)});
    }
}
