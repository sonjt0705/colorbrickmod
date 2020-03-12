package sonjt.cbmod.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import static sonjt.cbmod.ColorBrickMod.MODID;

public class Blocks {
    public static final Block blueBricks = new Block(
        Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 30.0f)
    ) {
        @Override
        public ToolType getHarvestTool(BlockState state) {
            return net.minecraft.block.Blocks.BRICKS.getHarvestTool(state);
        }

        @Override
        public int getHarvestLevel(BlockState state) {
            return net.minecraft.block.Blocks.BRICKS.getHarvestLevel(state);
        }
    }.setRegistryName(MODID, "blue_bricks");
}
