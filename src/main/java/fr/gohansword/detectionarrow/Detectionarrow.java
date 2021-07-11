package fr.gohansword.detectionarrow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Detectionarrow extends JavaPlugin {
    private static Detectionarrow instance;


    public static Detectionarrow getInstance() {
        return instance;
    }



    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ProjectileLaunchEvent(), this);
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §a________" + newLine + "                   §a| | -- | |" + newLine + "                   §a| |-DA-| |" + newLine + "                   §a| |-->-| |     §8§l[§b§lDetectionArrow§8§l] §8>> §aLoaded successfully ! V 1.0.0 :)" + newLine + "                   §a| |-DA-| |" + newLine + "                   §a| | -- | |" + newLine + "                 §a§m--------------§r");

    }

    public void onDisable() {
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §c________" + newLine + "                   §c| | -- | |" + newLine + "                   §c| |-DA-| |" + newLine + "                   §c| |-->-| |     §8§l[§b§lDetectionArrow§8§l] §8>> §cUnloaded successfully ! V 1.0.5 :)" + newLine + "                   §c| |-DA-| |" + newLine + "                   §c| | -- | |" + newLine + "                 §c§m--------------§r");

    }

}