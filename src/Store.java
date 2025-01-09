/*
* File: Store.java
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

//Itt következik a Store osztály
public class Store {
    String Username;
    String Password;
    String Address;
    
    public Store(String username, String password, String address) {
        this.Username = username;
        this.Password = password;
        this.Address = address;
    }
    
    public String getPassword() {
        return Password;
    }

    public boolean isPasswordEmpty() {
        if(this.Password == "") {
            return true;
        }else {
            return false;
        }
    }

    public String getUsername() {
        return Username;
    }

    public String getAddress() {
        return Address;
    }
    
}
