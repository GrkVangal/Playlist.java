package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void start(ArrayList<String> playlist) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {

            showMenu();

            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    Playlist.displayPlaylist(playlist);
                    break;

                case 2:
                    Playlist.shufflePlaylist(playlist);
                    System.out.println("Playlist shuffled!");
                    break;

                case 3:
                    Playlist.addSong(playlist, input);
                    break;

                case 4:
                    Playlist.removeSong(playlist, input);
                    break;

                case 5:
                    Playlist.searchSong(playlist, input);
                    break;

                case 6:
                    Playlist.swapSongs(playlist, input);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 7);

        input.close();
    }

    private static void showMenu() {

        System.out.println("\n===== MUSIC PLAYLIST MENU =====");
        System.out.println("1. Display Playlist");
        System.out.println("2. Shuffle Playlist");
        System.out.println("3. Add Song");
        System.out.println("4. Remove Song");
        System.out.println("5. Search Song");
        System.out.println("6. Swap Songs");
        System.out.println("7. Exit");
    }
}