package com.project.model.service.contract;

import com.project.model.entity.Book;
import com.project.model.entity.User;

import java.util.List;

public interface UserService {

    public boolean insertUser(User user);
    public boolean insertbook(Book book);
    public User getUserById(int id);
    public List<Book> getBookById(int id);
    public User get();
    public List<User> getall();
    public Boolean delete(int id);

}
