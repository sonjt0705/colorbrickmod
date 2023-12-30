package sonjt.cbmod;

import net.minecraft.block.*;
import net.minecraft.item.*;
import org.apache.logging.log4j.*;
import java.util.stream.Collectors;
import static sonjt.cbmod.item.Items.*;
import static sonjt.cbmod.block.Blocks.*;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorBrickMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger();
	@Override
	public void onInitialize() {
		LOGGER.info("Client Initialization");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}
}
