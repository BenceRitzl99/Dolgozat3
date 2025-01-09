/*
* File: Header.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: szit
* Date: 2025-01-08
* Github: https://github.com/BenceRitzl99
* Licenc: MIT
*/

public class Header {
    public static void printHeader() {
        try {
            tryprintHeader();
        } catch (Exception e) {
            System.err.println("Hiba! A kiiratás sikertelen!");
            System.err.println(e.getMessage());
        }
    }

    public static void tryprintHeader() {
    System.out.println("Nagy János, refaktorálta: Ritzl Bence \nJelszavak");
    System.out.println("Írja le az alábbi adatokat:");
    }
}
