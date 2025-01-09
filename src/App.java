/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT

* --- Refactorated ---
* Refactored: Ritzl Bence, II/1/N
* Date 2025-01-08
* Github: https://github.com/BenceRitzl99
*/



public class App {
    public static void main(String[] args) {

        Header.printHeader();
        Store userDatas = GetDatas.getUserDatas();
        Write.writeToFile(
            userDatas.getUsername(),
            userDatas.getPassword(),
            userDatas.getAddress()
        );
    }


}
