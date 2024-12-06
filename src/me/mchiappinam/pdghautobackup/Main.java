package me.mchiappinam.pdghautobackup;

import java.util.Calendar;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	public boolean jaFoi = false;
	
	  public void onEnable() {
		startScheduler();
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2Acesse: http://pdgh.com.br/");
	  }

	  public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2Acesse: http://pdgh.com.br/");
	  }

		public void startScheduler() {
			getServer().getScheduler().runTaskTimer(this, new Runnable() {
				public void run() {
						if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==02) {
							if(Calendar.getInstance().get(Calendar.MINUTE)==00) {
								if(jaFoi) {
									jaFoi = true;
									getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2Digitando o comando para iniciar o backup - Plugin by: mchiappinam");
									getServer().dispatchCommand(getServer().getConsoleSender(), "pdghfbackup");
									getServer().getConsoleSender().sendMessage("§3[PDGHAutoBackup] §2Comando digitado com sucesso - Plugin by: mchiappinam");
								}
							}
						}
				}
			}, 0, 25*20);
		}
		
		
		
		
}