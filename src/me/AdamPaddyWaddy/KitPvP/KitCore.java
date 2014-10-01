package me.AdamPaddyWaddy.KitPvP;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;




public class KitCore extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getLogger().info(ChatColor.GOLD + "KitPvP version 1.0 has been enabled!");
		}
	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.GOLD + "KitPvP v1.0 has been disabled!");
		
		
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("PvP"));
		ItemStack IHelmet = new ItemStack(Material.IRON_HELMET);
		if (sender instanceof Player){
			Player p = (Player) sender;
			p.getInventory().setHelmet(IHelmet);
			ItemStack IChestPlate = new ItemStack(Material.IRON_CHESTPLATE);
			p.getInventory().setChestplate(IChestPlate);
			ItemStack ILeggings = new ItemStack(Material.IRON_LEGGINGS);
			p.getInventory().setLeggings(ILeggings);
			ItemStack IBoots = new ItemStack(Material.IRON_BOOTS);
			p.getInventory().setBoots(IBoots);
			ItemStack soup = new ItemStack(Material.MUSHROOM_SOUP);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			p.getInventory().addItem(soup);
			
		}
		else{
			if(label.equalsIgnoreCase("soup")){
				if (sender instanceof Player){
					Player p = (Player) sender;
					ItemStack soup = new ItemStack(Material.MUSHROOM_SOUP);
					p.getInventory().remove(Material.BOWL);
					p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
					p.getInventory().addItem(soup);
				}
				else if (label.equalsIgnoreCase("diamond")){
					if (sender instanceof Player) {
						Player p = (Player) sender;
						if(p.hasPermission("KitPvP.KitDiamond")){
							p.getInventory().clear();
							ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
							diamondSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
							diamondSword.addUnsafeEnchantment(Enchantment.DURABILITY, 10000);
							p.getInventory().addItem(diamondSword);
							ItemStack DHelmet = new ItemStack(Material.DIAMOND_HELMET);
							DHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
							DHelmet.addUnsafeEnchantment(Enchantment.DURABILITY, 10000);
							ItemStack DChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
							}
						}
				}
				
				
			}
		}
		
		return true;
	}

	}
		


