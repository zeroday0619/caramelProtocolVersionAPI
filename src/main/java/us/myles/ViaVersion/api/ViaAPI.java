package us.myles.ViaVersion.api;

import io.netty.buffer.ByteBuf;

import java.util.SortedSet;
import java.util.UUID;

public interface ViaAPI<T> {

    int getPlayerVersion(T player);

    int getPlayerVersion(UUID uuid);

    @Deprecated
    default boolean isPorted(UUID uuid) {
        return isInjected(uuid);
    }

    boolean isInjected(UUID uuid);

    String getVersion();

    void sendRawPacket(T player, ByteBuf packet);

    void sendRawPacket(UUID uuid, ByteBuf packet);

    SortedSet<Integer> getSupportedVersions();

}
