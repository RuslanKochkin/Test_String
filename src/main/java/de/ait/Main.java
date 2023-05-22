package de.ait;

import static de.ait.StringTools.FirstToUpperCase;
import static de.ait.StringTools.isStartingFromCapital;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstToUpperCase("apple"));
        System.out.println(isStartingFromCapital("apple"));
    }

}