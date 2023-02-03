package me.epic.coolplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.InvocationTargetException;

public final class Coolplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        try {
            ModuleManager.init(this);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ModuleManager.getAdapter().serverVersion());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
