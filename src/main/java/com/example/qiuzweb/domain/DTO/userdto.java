package com.example.qiuzweb.domain.DTO;

public class userdto {
    private String username;
    private String passwordHash;
    private String email;
    private String Confirmpassword;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getConfirmpassword() {
        return Confirmpassword;
    }
    public void setConfirmpassword(String confirmpassword) {
        Confirmpassword = confirmpassword;
    }
    
}
