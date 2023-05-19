package net.Rick.moreslabs;

import com.mojang.logging.LogUtils;
import net.Rick.moreslabs.block.ModBlocks;
import net.Rick.moreslabs.item.ModCreativeModeTabs;
import net.Rick.moreslabs.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreSlabs.MOD_ID)
public class MoreSlabs{
        public static final String MOD_ID = "moreslabs";
        private static final Logger LOGGER = LogUtils.getLogger();

        // Very Important Comment
        public MoreSlabs() {
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            ModItems.register(modEventBus);
            ModBlocks.register(modEventBus);

            modEventBus.addListener(this::commonSetup);
            MinecraftForge.EVENT_BUS.register(this);

            modEventBus.addListener(this::addCreative);
        }

        private void commonSetup(final FMLCommonSetupEvent event) {

        }

        private void addCreative(CreativeModeTabEvent.BuildContents event) {

            if(event.getTab() == ModCreativeModeTabs.MORESLABS_TAB) {
                event.accept(ModBlocks.DIRT_SLAB);
            }
        }


}





