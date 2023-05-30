package com.example.formulario_johan_varon.model.beans;

public class User {
   private Integer user_id;
   private String user_firstname;

   private String user_lastname;

   private String user_email;

   private String user_pssword;

    public User() {
        this.user_id = user_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_pssword = user_pssword;
    }



    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(int i) {
        this.user_id = user_id;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pssword() {
        return user_pssword;
    }

    public void setUser_pssword(String user_pssword) {
        this.user_pssword = user_pssword;
    }


    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_pssword='" + user_pssword + '\'' +
                '}';
    }
}