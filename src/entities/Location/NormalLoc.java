package entities.Location;

import entities.Player.Player;

public abstract class NormalLoc extends Location{

    public NormalLoc(int id, Player player, String locationName){
        super(id, player, locationName);
    }



    @Override
    public boolean onLocation() {
        return true;
    }
}
