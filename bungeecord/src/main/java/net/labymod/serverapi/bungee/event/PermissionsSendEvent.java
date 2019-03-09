package net.labymod.serverapi.bungee.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.labymod.serverapi.Permission;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

import java.util.EnumMap;
import java.util.Map;

/**
 * Class created by qlow | Jan
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PermissionsSendEvent extends Event implements Cancellable {

    private ProxiedPlayer player;
    private Map<Permission, Boolean> permissions = new EnumMap<>( Permission.class );
    @Setter
    private boolean cancelled;

}
