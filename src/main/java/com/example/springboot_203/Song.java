package com.example.springboot_203;

public class Song {
   // private ;
    private String first_name;
    private String last_name;
  //  private String album;
    private int social_security_number;
    private int date_of_birth;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

//    public String getAlbum() {
//        return album;
//    }
//
//    public void setAlbum(String album) {
//        this.album = album;
//    }

    public int getSocial_security_number() {
        return social_security_number;
    }

    public void setSocial_security_number(int social_security_number) {
        this.social_security_number = social_security_number;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
