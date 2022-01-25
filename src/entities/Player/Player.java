package entities.Player;

import entities.Game;
import entities.Location.*;

import java.util.Scanner;

public class Player extends Game{

    private Inventory inventory;
    private String locationt;
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private int originalHealth;


    Scanner input = new Scanner(System.in);

    public Player(){

    }

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }



    public void selectChar(){
        GameChar[] charshars = {new Samuray(), new Sovalye(), new Okcu()};

        for (GameChar gameChar : charshars) {
            System.out.println(gameChar.getId() + "- " + "Character: " + gameChar.getName() + " " + "Damage: " + gameChar.getDamage() + " " +
                    "Health: " + gameChar.getHealth() + " " + "Money: " + gameChar.getMoney());

        }

        System.out.println("Please choose character ===> ");

        int character = input.nextInt();
        while(character < 1 || character > charshars.length){
            System.out.println("Invalid value. ");
            character = input.nextInt();
        }
        switch (character){
            case 1 :
                initPlayer(new Samuray());

                break;
            case 2 :
                initPlayer(new Sovalye());
                break;
            case 3 :
                initPlayer(new Okcu());
                break;
            default:
                initPlayer(new Samuray());
        }
        System.out.println("You choose: " + this.getName());
    }
    public void initPlayer(GameChar gameChar){
        this.setName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setOriginalHealth(gameChar.getHealth());
        this.setHealthy(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printPlayerInfo(){
        System.out.println("Silah: " + this.getInventory().getWeapon().getWeaponName() +
                ", Zırh: " + this.getInventory().getShield().getShieldName() +
                ", Hasar: " + this.getDamage() +
                ", Sağlık: " + this.getHealthy() +
                ", Para: " + this.getMoney());
    }

    public String getLocation() {
        return locationt;
    }

    public void setLocation(String locationt) {
        this.locationt = locationt;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

   public int getTotalDamage(){
       return damage + this.getInventory().getWeapon().getWeaponDamage();
   }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        if (healthy < 0){
            healthy = 0;
        }
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public Shield getShield(){
        return this.getInventory().getShield();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
