package com.github.finnt730.showfps;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("show_fps")
public class ShowFpsMod {
	public static final Logger LOGGER = LogManager.getLogger(ShowFpsMod.class);
	public static final String MODID = "show_fps";
//	private static final String PROTOCOL_VERSION = "1";
//	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
//			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
//	private static int messageID = 0;
//
//	public ShowFpsMod() {
//
//		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//
//	}
//
//	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
//			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
//		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
//		messageID++;
//	}
}
