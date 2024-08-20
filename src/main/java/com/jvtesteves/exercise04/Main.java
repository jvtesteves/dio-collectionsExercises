package com.jvtesteves.exercise04;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Create a class LinguagemFavorita that has the attributes
name, yearOfCreation, and ide. Then, create a set with 3 languages
and make a program that sorts this set by:

- Insertion Order
- Natural Order (name)
- IDE
- Year of creation and name
- Name, year of creation, and IDE

Finally, display the languages in the console, one below the other.
*/

class LinguagemFavorita {
    private String name;
    private int yearOfCreation;
    private String ide;

    public LinguagemFavorita(String name, int yearOfCreation, String ide) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", ide='" + ide + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // Insertion Order
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));

        System.out.println("Languages in Insertion Order:");
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem);
        }

        // Natural Order (name)
        Set<LinguagemFavorita> linguagensPorNome = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getName));
        linguagensPorNome.addAll(linguagens);
        System.out.println("\nLanguages in Natural Order (Name):");
        for (LinguagemFavorita linguagem : linguagensPorNome) {
            System.out.println(linguagem);
        }

        // Order by IDE
        Set<LinguagemFavorita> linguagensPorIde = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getIde));
        linguagensPorIde.addAll(linguagens);
        System.out.println("\nLanguages Ordered by IDE:");
        for (LinguagemFavorita linguagem : linguagensPorIde) {
            System.out.println(linguagem);
        }

        // Order by Year of Creation and Name
        Set<LinguagemFavorita> linguagensPorAnoENome = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getYearOfCreation)
                .thenComparing(LinguagemFavorita::getName));
        linguagensPorAnoENome.addAll(linguagens);
        System.out.println("\nLanguages Ordered by Year of Creation and Name:");
        for (LinguagemFavorita linguagem : linguagensPorAnoENome) {
            System.out.println(linguagem);
        }

        // Order by Name, Year of Creation, and IDE
        Set<LinguagemFavorita> linguagensPorTudo = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getName)
                .thenComparing(LinguagemFavorita::getYearOfCreation)
                .thenComparing(LinguagemFavorita::getIde));
        linguagensPorTudo.addAll(linguagens);
        System.out.println("\nLanguages Ordered by Name, Year of Creation, and IDE:");
        for (LinguagemFavorita linguagem : linguagensPorTudo) {
            System.out.println(linguagem);
        }
    }
}

