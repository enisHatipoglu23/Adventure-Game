package entities.Location;

import entities.Player.Player;

public class River extends BattleLoc{
    public River(Player player) {
        super(3, player, "Nehir", Monster.monsters()[2], "Su", 3);
    }
}
