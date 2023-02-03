package me.epic.coolplugin;

import me.epic.spigotlib.Version;

import java.lang.reflect.InvocationTargetException;

public class ModuleManager {

    private static ModuleAdapter adapter;

    public static void init(Coolplugin coolplugin) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String version = Version.getServerVersion();
        adapter = (ModuleAdapter) Class.forName("me.epic.coolplugin.v" + version.replace(".", "_") + ".ModuleAdapter").getDeclaredConstructor().newInstance();

    }

    public static ModuleAdapter getAdapter() {
        return adapter;
    }
}
