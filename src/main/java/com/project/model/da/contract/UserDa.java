package com.project.model.da.contract;

import com.project.model.entity.Book;
import com.project.model.entity.User;

import java.util.List;

public interface UserDa {

    public boolean insertUser(User user);
    public boolean insertbook(Book book);
    public User getUserByID(int id);
    public List<Book> getBookByID(int id);
    public User getuser();
    public List<User> getall();
    public Boolean delete(int id);
}
