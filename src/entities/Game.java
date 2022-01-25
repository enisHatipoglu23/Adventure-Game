package entities;

import entities.Location.*;
import entities.Player.Player;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);


    public void start() {
        System.out.println("The Adventure Game Has Been Started! ");
        System.out.println("Please input your username down there: ");
        String userName = input.nextLine();

        Player player = new Player(userName);


        System.out.println("Welcome to the Adventure Game " + userName);

        player.selectChar();
        Location location = null;
        while (true) {

            Location[] normalLocs = {new SafeHouse(player), new ToolStore(player) {
            }};
            System.out.println("Locations: ");
            int count = 1;
            for (Location locChar : normalLocs) {
                System.out.println(count + "- " + locChar.getLocationName());
                count++;
            }
            BattleLoc[] battleLocs = {new Cave(player), new Woods(player), new River(player), new Maden(player)};
            int count2 = 3;
            for (BattleLoc battleChar : battleLocs) {
                System.out.println(count2 + "- " + battleChar.getLocationName() + " Ödül= " + battleChar.getAward());
                count2++;
            }
            System.out.println("Çıkış yapmak için ==> 0");
            System.out.println("Choose  location => ");

            int locChoose = input.nextInt();
            while (locChoose < 0 || locChoose > (normalLocs.length + battleLocs.length)) {
                System.out.println("Invalid Value. ");
                locChoose = input.nextInt();
            }


            switch (locChoose) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Woods(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Maden(player);
                    break;
                default:
                    System.out.println("Choose one of our sections. ");


            }


            if (location == null) {
                System.out.println("Oyundan çıkış yapıldı. ");
                break;
            }
            if (location.onLocation() == false) {
                System.out.println("***");
                break;

            }
        }


    }
}



