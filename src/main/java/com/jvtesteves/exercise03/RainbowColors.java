package com.jvtesteves.exercise03;

import java.util.*;

/*
Create a set containing the colors of the rainbow and:

- Display all the colors one below the other
- Display the number of colors in the rainbow
- Display the colors in alphabetical order
- Display the colors in reverse order of how they were informed
- Display all colors that start with the letter "v"
- Remove all colors that do not start with the letter "v"
- Clear the set
- Check if the set is empty
*/

public class RainbowColors {

    public static void main(String[] args) {

        // Initialize the set of rainbow colors
        Set<String> rainbowColors = new LinkedHashSet<>();
        rainbowColors.add("Red");
        rainbowColors.add("Orange");
        rainbowColors.add("Yellow");
        rainbowColors.add("Green");
        rainbowColors.add("Blue");
        rainbowColors.add("Indigo");
        rainbowColors.add("Violet");

        // Display all the colors one below the other
        System.out.println("Rainbow colors:");
        for (String color : rainbowColors) {
            System.out.println(color);
        }

        // Display the number of colors in the rainbow
        System.out.println("\nNumber of colors in the rainbow: " + rainbowColors.size());

        // Display the colors in alphabetical order
        Set<String> sortedColors = new TreeSet<>(rainbowColors);
        System.out.println("\nColors in alphabetical order:");
        for (String color : sortedColors) {
            System.out.println(color);
        }

        // Display the colors in reverse order of how they were informed
        System.out.println("\nColors in reverse order of insertion:");
        Iterator<String> iterator = rainbowColors.iterator();
        Set<String> reverseColors = new LinkedHashSet<>();
        while (iterator.hasNext()) {
            reverseColors.add(iterator.next());
        }
        reverseColors = new LinkedHashSet<>(reverseColors);
        Collections.reverse((new ArrayList<>(reverseColors)));
        for (String color : reverseColors) {
            System.out.println(color);
        }

        // Display all colors that start with the letter "v"
        System.out.println("\nColors that start with the letter 'v':");
        for (String color : rainbowColors) {
            if (color.toLowerCase().startsWith("v")) {
                System.out.println(color);
            }
        }

        // Remove all colors that do not start with the letter "v"
        Iterator<String> iterator2 = rainbowColors.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().toLowerCase().startsWith("v")) {
                iterator2.remove();
            }
        }
        System.out.println("\nColors after removing those that do not start with 'v':");
        for (String color : rainbowColors) {
            System.out.println(color);
        }

        // Clear the set
        rainbowColors.clear();

        // Check if the set is empty
        System.out.println("\nIs the set empty? " + rainbowColors.isEmpty());
    }
}

