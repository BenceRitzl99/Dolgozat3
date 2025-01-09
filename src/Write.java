/*
* File: Write.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: szit
* Date: 2025-01-08
* Github: https://github.com/BenceRitzl99
* Licenc: MIT
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Write {
    public static boolean writeToFile(String username, String password, String address) {
        try {
            PrintWriter printWriter = new PrintWriter(
                new OutputStreamWriter(
                    new FileOutputStream("passwords.txt"), "UTF-8"
                )
            );

            printWriter.println("Felhasználó: " + username);
            printWriter.println("Jelszó: " + password);
            printWriter.println("Lakhely: " + address);
            printWriter.close();

            System.out.println("A fájlbaírás sikeres.");
            return true;
            
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen.");
            System.err.println(e.getMessage());

            return false;
        }
    }
}
