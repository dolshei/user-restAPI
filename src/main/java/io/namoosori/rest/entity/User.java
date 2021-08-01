package io.namoosori.rest.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    private String id;
    private String name;
    private String email;

    public User(){
        this.id = UUID.randomUUID().toString();
    }

    public User(String name, String email){
        this();
        this.name = name;
        this.email = email;
    }

    public static User sample(){
        return new User("LEE", "dolshei@namoosori.io");
    }

    public static void main(String[] args) {
        User user = new User("kim", "kim@namoosori.io");
        System.out.println(new Gson().toJson(user));
    }
}
