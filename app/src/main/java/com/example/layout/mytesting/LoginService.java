package com.example.layout.mytesting;

/**
 * Created by User on 19-02-2018.
 */

//created class LoginService
class LoginService {
    public boolean login(String username, String password) {
        /*boolean returns true or false
        taking username and password by using string
        * string is a sequence of characters  */
        return "TharaniChelumalla".equals(username) && "1234".equals(password);
        //here returns true if username and password is equal as given above or else gets error message
    }
}