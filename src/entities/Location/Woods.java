package entities.Location;

import entities.Player.Player;

public  class Woods extends BattleLoc{

    public Woods(Player player) {
        super(2, player, "Orman", Monster.monsters()[1], "Odun", 3);
    }
}
