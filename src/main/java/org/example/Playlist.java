package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Playlist {

    public static void displayPlaylist(ArrayList<String> playlist) {

        System.out.println("\n===== YOUR PLAYLIST =====");

        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }

        System.out.println("Total songs: " + playlist.size());
    }

    public static void shufflePlaylist(ArrayList<String> playlist) {

        Collections.shuffle(playlist);
    }

    public static void addSong(ArrayList<String> playlist, Scanner input) {

        System.out.print("Enter song name: ");
        String song = input.nextLine();

        playlist.add(song);

        System.out.println("Song added!");
    }

    public static void removeSong(ArrayList<String> playlist, Scanner input) {

        System.out.print("Enter song name to remove: ");
        String song = input.nextLine();

        if (playlist.remove(song)) {
            System.out.println("Song removed!");
        } else {
            System.out.println("Song not found!");
        }
    }

    public static void searchSong(ArrayList<String> playlist, Scanner input) {

        System.out.print("Enter song name: ");
        String song = input.nextLine();

        int index = playlist.indexOf(song);

        if (index != -1) {
            System.out.println(song + " found at position " + (index + 1));
        } else {
            System.out.println("Song not found!");
        }
    }

    public static void swapSongs(ArrayList<String> playlist, Scanner input) {

        System.out.print("First song: ");
        String first = input.nextLine();

        System.out.print("Second song: ");
        String second = input.nextLine();

        int firstIndex = playlist.indexOf(first);
        int secondIndex = playlist.indexOf(second);

        if (firstIndex != -1 && secondIndex != -1) {

            String temp = playlist.get(firstIndex);

            playlist.set(firstIndex, playlist.get(secondIndex));
            playlist.set(secondIndex, temp);

            System.out.println("Songs swapped!");
        } else {
            System.out.println("One or both songs were not found!");
        }
    }
}