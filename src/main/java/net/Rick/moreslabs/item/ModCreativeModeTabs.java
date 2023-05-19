package net.Rick.moreslabs.item;

import net.Rick.moreslabs.MoreSlabs;
import net.Rick.moreslabs.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreSlabs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MORESLABS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MORESLABS_TAB = event.registerCreativeModeTab(new ResourceLocation(MoreSlabs.MOD_ID, "moreslabstab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.DIRT_SLAB.get()))
                        .title(Component.translatable("creativemodetab.moreslabstab")));
    }
}