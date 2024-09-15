package com.capitainfoxy.lagcleaner;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;

public class LagCleanerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        if (getConfig().getBoolean("enabled")) {
            long interval = getConfig().getInt("interval-minutes") * 60 * 20L;
            long warningTime = getConfig().getInt("warning-seconds") * 20L; 

            Bukkit.getScheduler().runTaskTimer(this, () -> {
                Bukkit.broadcastMessage(ChatColor.RED + "Warning: Items will be removed in " + getConfig().getInt("warning-seconds") + " seconds!");
                Bukkit.getScheduler().runTaskLater(this, this::cleanLag, warningTime);
            }, 0L, interval);
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("LagCleaner Plugin Disabled!");
    }

    private void cleanLag() {
        for (World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof Item) {
                    entity.remove();
                }
            }
        }
        getLogger().info("Lag cleaned up!");
    }
}
