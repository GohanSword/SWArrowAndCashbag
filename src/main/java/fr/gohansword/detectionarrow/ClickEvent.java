package fr.gohansword.detectionarrow;

import org.bukkit.Bukkit;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickEvent implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();

        if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

                if (player.hasPermission("quetes.anniv.2021.sac.1")) {
                    if (event.getInteractionPoint().getBlockX() == 520) {
                        if (event.getInteractionPoint().getBlockY() == 52) {
                            if (event.getInteractionPoint().getBlockZ() == 460) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.1 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }

                if (player.hasPermission("quetes.anniv.2021.sac.2")) {
                    if (event.getInteractionPoint().getBlockX() == 519) {
                        if (event.getInteractionPoint().getBlockY() == 53) {
                            if (event.getInteractionPoint().getBlockZ() == 463) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.2 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
                if (player.hasPermission("quetes.anniv.2021.sac.3")) {
                    if (event.getInteractionPoint().getBlockX() == 518) {
                        if (event.getInteractionPoint().getBlockY() == 55) {
                            if (event.getInteractionPoint().getBlockZ() == 466) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.3 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
                if (player.hasPermission("quetes.anniv.2021.sac.4")) {
                    if (event.getInteractionPoint().getBlockX() == 515) {
                        if (event.getInteractionPoint().getBlockY() == 52) {
                            if (event.getInteractionPoint().getBlockZ() == 465) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.4 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
                if (player.hasPermission("quetes.anniv.2021.sac.5")) {
                    if (event.getInteractionPoint().getBlockX() == 521) {
                        if (event.getInteractionPoint().getBlockY() == 53) {
                            if (event.getInteractionPoint().getBlockZ() == 467) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.5 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
                if (player.hasPermission("quetes.anniv.2021.sac.6")) {
                    if (event.getInteractionPoint().getBlockX() == 518) {
                        if (event.getInteractionPoint().getBlockY() == 54) {
                            if (event.getInteractionPoint().getBlockZ() == 469) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.6 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
                if (player.hasPermission("quetes.anniv.2021.sac.7")) {
                    if (event.getInteractionPoint().getBlockX() == 517) {
                        if (event.getInteractionPoint().getBlockY() == 52) {
                            if (event.getInteractionPoint().getBlockZ() == 469) {
                                player.sendMessage("§aVous avez rammassé 500$");
                                String permission = "quetes.anniv.2021.sac.7 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                player.sendTitle("§a+ 500$", "§3Vous avez rammassé 500$");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " sacrammaser 1");
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + name + " 500");

                            }
                        }
                    }
                }
            } else return;
        }else return;
    }
}
