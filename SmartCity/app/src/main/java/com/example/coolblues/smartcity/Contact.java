package com.example.coolblues.smartcity;

/**
 * Created by coolBlues on 07-Apr-17.
 */

public class Contact {

    String email, username, phone, password;

    //Create method for each field you want to store in database
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(String email) {
        return this.email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

}
