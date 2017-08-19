package unwantedmc.UnwantedMCChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public void onEnable()
	{
		saveDefaultConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[])
	{
		if (cmd.getName().equalsIgnoreCase("discord"))
		{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("discord")));
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("twitter"))
		{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("twitter")));
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("instagram"))
		{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("instagram")));
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("website"))
		{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("website")));
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("clearchat"))
		{
			if (!sender.hasPermission("unwantedmc.cc"))
			{
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("no-perms")));
				return true;
			}
			
			for (int i = 0; i < 200; i++)
			{
				Bukkit.broadcastMessage("");
			}
			
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("chat-cleared")));
			return true;
		}
		
		return true;
	}
}
