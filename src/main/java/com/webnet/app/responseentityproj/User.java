package com.webnet.app.responseentityproj;

import com.google.gson.Gson;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    @Id
    private Long id;

    private String username;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private boolean isAuthorized;

    @Override
    public String toString(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
