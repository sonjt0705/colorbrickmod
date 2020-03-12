package sonjt.cbmod.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import java.util.Objects;
import static sonjt.cbmod.ColorBrickMod.MODID;
import static sonjt.cbmod.block.Blocks.*;

public class Items {
    public static final Item blueBricksItem = new BlockItem(
        blueBricks,
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(Objects.requireNonNull(blueBricks.getRegistryName()));

    public static final Item blueBrick = new Item(
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(MODID, "blue_brick");

    public static final Item greenBricksItem = new BlockItem(
        greenBricks,
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(Objects.requireNonNull(greenBricks.getRegistryName()));

    public static final Item greenBrick = new Item(
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(MODID, "green_brick");
}
