package sonjt.cbmod.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import static sonjt.cbmod.ColorBrickMod.MODID;
import static sonjt.cbmod.block.Blocks.blueBricks;

public class Items {
    public static final Item blueBricksItem = new BlockItem(
        blueBricks,
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(blueBricks.getRegistryName());

    public static final Item blueBrick = new Item(
        new Item.Properties().group(ItemGroups.colorBrickItems)
    ).setRegistryName(MODID, "blue_brick");
}
