package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] favouriteSongs = {
                "Jane!",
                "Children",
                "The Unknowing",
                "Wake up Sister",
                "Blue Monday",
                "Milla's Dream",
                "That's Life",
                "All Night",
                "What is Love",
                "This Game"
        };

        ArrayList<String> secondPlayList = new ArrayList<>();

        secondPlayList.add("The Princess");
        secondPlayList.add("New York");
        secondPlayList.add("Maniac");
        secondPlayList.add("HIGHSPEEDLOVE<333 !!!!!");
        secondPlayList.add("Jimmy's Gang");

        secondPlayList.addAll(Arrays.asList(favouriteSongs));

        Menu.start(secondPlayList);
    }
}