package com.project.model.service;

import com.project.model.da.contract.UserDa;
import com.project.model.entity.Book;
import com.project.model.entity.User;
import com.project.model.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDa userDa;


    public User get(){
        return userDa.getuser();
    }

    @Override
    public boolean insertUser(User user) {
        try {
            return userDa.insertUser(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    @Override
    public boolean insertbook(Book book) {
        return userDa.insertbook(book);
    }

    @Override
    public User getUserById(int id) {
        return userDa.getUserByID(id);
    }

    @Override
    public List<Book> getBookById(int id) {
        return userDa.getBookByID(id);
    }
    @Override
    public List<User> getall() {
        return userDa.getall();
    }

    @Override
    public Boolean delete(int id) {
        return userDa.delete(id);
    }























}
