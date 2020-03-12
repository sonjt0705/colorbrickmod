package sonjt.cbmod;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.*;
import java.util.stream.Collectors;
import static sonjt.cbmod.item.Items.*;
import static sonjt.cbmod.block.Blocks.blueBricks;

@Mod(ColorBrickMod.MODID)
public class ColorBrickMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "colorbrickmod";

    public ColorBrickMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Client Initialization");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got Game Settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo(MODID, "enqueue", () -> {
            LOGGER.info("MDK Enqueue IMC");
            return "Hello, world!";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        LOGGER.info(
            "Got Inter Mod Communication {}",
            event.getIMCStream().map(m->m.getMessageSupplier().get()).collect(Collectors.toList())
        );
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("Server Initialization");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            LOGGER.info("Item Registration");
            event.getRegistry().registerAll(
                blueBricksItem,
                blueBrick
            );
        }

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            LOGGER.info("Block Registration");
            event.getRegistry().registerAll(
                blueBricks
            );
        }
    }
}
