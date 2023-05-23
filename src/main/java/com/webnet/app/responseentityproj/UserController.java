package com.webnet.app.responseentityproj;

import main.Book;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements CoreController {

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Response<UserResponse>> getUser() {
        UserResponse userResponse = new UserResponse();
        User user = new User();
        user.setUsername("olawale");
        user.setFirstName("James");
        user.setLastName("Ogunde");
        user.setAddress("14 North Troy Street");
        user.setAuthorized(true);
        user.setEmail("olawale@yahoo.com");
        user.setPhone("319-825-700");
        List<User> u = new ArrayList<>();
        u.add(user);
        u.add(user);
        u.add(user);
        userResponse.setUser(u);
        return invokeService(() -> {
            return userResponse;
        });
    }

    @GetMapping("/books")
    public ResponseEntity<Response<UserResponse>> getBook() {
        UserResponse userResponse = new UserResponse();
        userResponse.setBooks(Book.getBooks());
        return invokeService(() -> userResponse);
    }

    @GetMapping("/books/1")
    public ResponseEntity<Response<UserResponse>> getBookOne() {
        UserResponse userResponse = new UserResponse();
        userResponse.setBooks(Book.getBooks());
        return invokeService(() -> userResponse);
    }

    @GetMapping("/books/2")
    public ResponseEntity<Response<UserResponse>> getBookDoSomething() {
        //What is this method doing ?
        UserResponse userResponse = new UserResponse();
        userResponse.setBooks(Book.getBooks());
        return invokeService(() -> userResponse);
    }

    @GetMapping("/books/4")
    public ResponseEntity<Response<UserResponse>> getBookFour(){
        UserResponse userResponse = new UserResponse();;
        userResponse.setBooks(Book.getBooks());
        return invokeService( () -> {

            return userResponse;
        });
    }
}
