package com.company.neibulei.NeiBuLei03;

public class User {
    // 属性：⽤⼾类型，⽤⼾id
    private String userType;
    private int userId;

    //提供基本的构造⽅法和get⽅法，set⽅法
    public User() {
    }

    public User(String userType, int userId) {
        this.userType = userType;
        this.userId = userId;
    }

    public User(int i) {
    }

    // get⽅法，set⽅法
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return userId + "-" + userType;
    }
}
