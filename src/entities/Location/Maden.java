package entities.Location;

import entities.Player.Player;

import java.util.Random;

public class Maden extends BattleLoc{
    static int maxDamage = 6;
    public Maden(Player player) {
        super(5,player, "Maden", Monster.monsters()[3], "!Random Eşya!", 5);
    }

}
