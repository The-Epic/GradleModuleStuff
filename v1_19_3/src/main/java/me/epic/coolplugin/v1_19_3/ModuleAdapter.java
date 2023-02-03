package me.epic.coolplugin.v1_19_3;

import me.epic.spigotlib.Version;

public class ModuleAdapter implements me.epic.coolplugin.ModuleAdapter {
    @Override
    public String serverVersion() {
        return Version.getServerVersion();
    }
}