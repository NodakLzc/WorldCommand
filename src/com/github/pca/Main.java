package com.github.pca;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	 public void onLoad() {
		    this.saveDefaultConfig();
		    System.out.println("[" + getName() + "]" + " " + "加载成功");
		  }

		  public void onEnable() {
		    getServer().getPluginManager().registerEvents(this, this);
		    System.out.println("[" + getName() + "]" + " " + "开启成功");
		  }

		  public void onDisable() {
		    System.out.println("[" + getName() + "]" + " " + "关闭成功");
		  }
		  
	 @EventHandler(priority = EventPriority.LOWEST)
	  public void blockcmd(PlayerCommandPreprocessEvent event)
	  {
	    Player p = event.getPlayer();
	    if(p.getWorld().getName().toString().equalsIgnoreCase("world")){
	    	event.setCancelled(true);
	    	p.sendMessage("§6[提示]§c命令:  "+event.getMessage()+"  不能在这个世界使用");
	    	p.sendMessage("§6[提示]§c您不能在这里使用这个命令");
	    	return;
	    }
	  
	  }


	
}