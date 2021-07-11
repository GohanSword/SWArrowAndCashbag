package fr.gohansword.detectionarrow;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileLaunchEvent implements Listener {

    String blankline = "&c";
    private Detectionarrow plugin;

    @EventHandler
    public void arrowEvent(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getEntity();
            Player player = (Player) arrow.getShooter();
            String name = player.getName();
            if (!(player instanceof Player)) {
                return;
            }
            if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                if (player.hasPermission("quetes.anniv.2021.fleche.1")) {
                    if (arrow.getLocation().getBlockX() == 465) {
                        if (arrow.getLocation().getBlockY() == 73) {
                            if (arrow.getLocation().getBlockZ() == 423) {
                                player.sendMessage("§8[§cArmurier§8] >> §a§lDans le mille, Émile !");
                                arrow.remove();
                                String permission = "quetes.anniv.2021.fleche.1 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                            } else if (arrow.getLocation().getBlockZ() == 424) {
                                player.sendMessage("§8[§cArmurier§8] >> §a§lDans le mille, Émile !");
                                arrow.remove();
                                String permission = "quetes.anniv.2021.fleche.1 false";
                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                            } else
                                arrow.remove();

                        } else
                            arrow.remove();
                    } else
                        arrow.remove();
                }
                if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                    if (player.hasPermission("quetes.anniv.2021.fleche.2")) {
                        if (arrow.getLocation().getBlockX() == 464) {
                            if (arrow.getLocation().getBlockY() == 74) {
                                if (arrow.getLocation().getBlockZ() == 431) {
                                    player.sendMessage("§8[§cArmurier§8] >> §a§lTu as un l’oeil aussi perçant que tes flèches !");
                                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                    arrow.remove();
                                    String permission = "quetes.anniv.2021.fleche.2 false";
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                } else
                                    arrow.remove();
                            } else
                                arrow.remove();

                        } else
                            arrow.remove();
                    }
                    if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                        if (player.hasPermission("quetes.anniv.2021.fleche.3")) {
                            if (arrow.getLocation().getBlockX() == 460) {
                                if (arrow.getLocation().getBlockY() == 76) {
                                    if (arrow.getLocation().getBlockZ() == 430) {
                                        player.sendMessage("§8[§cArmurier§8] >> §a§lEt BAM ! Il ne l’a pas volée celle la !");
                                        player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                        arrow.remove();
                                        String permission = "quetes.anniv.2021.fleche.3 false";
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                    } else
                                        arrow.remove();
                                } else
                                    arrow.remove();

                            } else
                                arrow.remove();
                        }
                        if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                            if (player.hasPermission("quetes.anniv.2021.fleche.4")) {
                                if (arrow.getLocation().getBlockX() == 460) {
                                    if (arrow.getLocation().getBlockY() == 72) {
                                        if (arrow.getLocation().getBlockZ() == 430) {
                                            player.sendMessage("§8[§cArmurier§8] >> §a§lL’élève dépasserait-il le maître ? ");
                                            player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                            arrow.remove();
                                            String permission = "quetes.anniv.2021.fleche.4 false";
                                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                        } else
                                            arrow.remove();
                                    } else
                                        arrow.remove();

                                } else
                                    arrow.remove();
                            }
                            if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                                if (player.hasPermission("quetes.anniv.2021.fleche.5")) {
                                    if (arrow.getLocation().getBlockX() == 458) {
                                        if (arrow.getLocation().getBlockY() == 72) {
                                            if (arrow.getLocation().getBlockZ() == 427) {
                                                player.sendMessage("§8[§cArmurier§8] >> §a§lTranspercée en plein dans le coeur ! ");
                                                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                                arrow.remove();
                                                String permission = "quetes.anniv.2021.fleche.5 false";
                                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                            } else
                                                arrow.remove();
                                        } else
                                            arrow.remove();

                                    } else
                                        arrow.remove();
                                }
                                if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                                    if (player.hasPermission("quetes.anniv.2021.fleche.6")) {
                                        if (arrow.getLocation().getBlockX() == 453) {
                                            if (arrow.getLocation().getBlockY() == 72) {
                                                if (arrow.getLocation().getBlockZ() == 426) {
                                                    player.sendMessage("§8[§cArmurier§8] >> §a§lA ce niveau là, tu vas apprendre à lire à travers les murs ! ");
                                                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                                    arrow.remove();
                                                    String permission = "quetes.anniv.2021.fleche.6 false";
                                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                                } else if (arrow.getLocation().getBlockZ() == 424) {
                                                    player.sendMessage("§8[§cArmurier§8] >> §a§lA ce niveau là, tu vas apprendre à lire à travers les murs !");
                                                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                                    arrow.remove();
                                                    String permission = "quetes.anniv.2021.fleche.6 false";
                                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                                } else
                                                    arrow.remove();

                                            } else
                                                arrow.remove();
                                        } else
                                            arrow.remove();
                                    }
                                    if (player.getWorld().getName().equalsIgnoreCase("KIKO")) {
                                        if (player.hasPermission("quetes.anniv.2021.fleche.7")) {
                                            if (arrow.getLocation().getBlockX() == 456) {
                                                if (arrow.getLocation().getBlockY() == 73) {
                                                    if (arrow.getLocation().getBlockZ() == 429) {
                                                        player.sendMessage("§8[§cArmurier§8] >> §a§lOh Daaaaamnnn Daniel !");
                                                        player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                                        arrow.remove();
                                                        String permission = "quetes.anniv.2021.fleche.7 false";
                                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                                    } else if (arrow.getLocation().getBlockZ() == 424) {
                                                        player.sendMessage("§8[§cArmurier§8] >> §a§lOh Daaaaamnnn Daniel !");
                                                        player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                                                        arrow.remove();
                                                        String permission = "quetes.anniv.2021.fleche.7 false";
                                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + name + " permission set " + permission);
                                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mycmd-playerdata add " + name + " flechetoucher2021 1");
                                                    } else
                                                        arrow.remove();

                                                } else
                                                    arrow.remove();
                                            } else
                                                arrow.remove();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}