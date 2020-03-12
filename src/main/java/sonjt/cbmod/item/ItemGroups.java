package sonjt.cbmod.item;

import net.minecraft.item.*;
import static sonjt.cbmod.block.Blocks.blueBricks;

public class ItemGroups {
    public static final ItemGroup colorBrickItems = new ItemGroup("color_brick_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(blueBricks);
        }
    };
}
