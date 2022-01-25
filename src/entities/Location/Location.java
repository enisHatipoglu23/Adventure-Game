package entities.Location;

import entities.Player.Player;

import java.util.Scanner;

public abstract class Location {

    public Player player;
    public String locationName;
    public int id;

    public Location(int id, Player player, String locationName) {
        this.player = player;
        this.locationName = locationName;
    }

    public static Scanner input = new Scanner(System.in);
    public abstract boolean onLocation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
