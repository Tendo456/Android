package com.example.getpost;

public class UserRequest {

    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String date_joined = "2021-01-07T16:54:48.892Z";

    public String getUsename() {
        return username;
    }

    public void setUsername(String usename) {
        this.username = usename;
    }

    public String getFirstname() {
        return first_name;
    }

    public void setFirst_name(String firstname) {
        this.first_name = firstname;
    }

    public String getLastname() {
        return last_name;
    }

    public void setLast_name(String lastname) {
        this.last_name = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
