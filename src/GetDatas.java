/*
* File: GetDatas.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: szit
* Date: 2025-01-08
* Github: https://github.com/BenceRitzl99
* Licenc: MIT
*/


import java.util.Scanner;

public class GetDatas {
     public static Store getUserDatas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();

        System.out.print("Jelszó: ");
        String password = scanner.nextLine();

        System.out.print("Lakhely: ");
        String address = scanner.nextLine();

        scanner.close();

        return new Store(username, password, address);
    }
}
