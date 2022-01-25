package entities.Location;

import entities.Player.Player;

public class Cave extends BattleLoc{


    public Cave(Player player) {
        super(1, player, "Mağara", Monster.monsters()[0], "Food", 3);
    }
}
