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
		    System.out.println("[" + getName() + "]" + " " + "���سɹ�");
		  }

		  public void onEnable() {
		    getServer().getPluginManager().registerEvents(this, this);
		    System.out.println("[" + getName() + "]" + " " + "�����ɹ�");
		  }

		  public void onDisable() {
		    System.out.println("[" + getName() + "]" + " " + "�رճɹ�");
		  }
		  
	 @EventHandler(priority = EventPriority.LOWEST)
	  public void blockcmd(PlayerCommandPreprocessEvent event)
	  {
	    Player p = event.getPlayer();
	    if(p.getWorld().getName().toString().equalsIgnoreCase("world")){
	    	event.setCancelled(true);
	    	p.sendMessage("��6[��ʾ]��c����:  "+event.getMessage()+"  �������������ʹ��");
	    	p.sendMessage("��6[��ʾ]��c������������ʹ���������");
	    	return;
	    }
	  
	  }


	
}