package com.webnet.app.responseentityproj;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import main.Book;

import java.io.Serializable;
import java.util.List;

@JsonAutoDetect
@Data
public class UserResponse implements Serializable {

 private List<User> user;

 private List<Book> books;
}
