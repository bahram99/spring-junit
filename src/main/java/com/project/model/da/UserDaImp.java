package com.project.model.da;

import com.project.model.da.contract.UserDa;
import com.project.model.entity.Book;
import com.project.model.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional
public class UserDaImp implements UserDa {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getuser(){
        return entityManager.find(User.class,1);
    }

    @Override
    @Transactional
    public boolean insertUser(User user) {
        try {
            entityManager.persist(user);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    @Override
    @Transactional
    public boolean insertbook(Book book) {
        try {
            entityManager.persist(book);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public User getUserByID(int id) {
        return entityManager.find(User.class , id);
    }

    @Override
    public List<Book> getBookByID(int id) {
        Query q = entityManager.createNativeQuery("SELECT * FROM spring.book where user_id =?",Book.class);
        q.setParameter(1,id);
        return (List<Book>) q.getResultList();
    }

    @Override
    public List<User> getall(){
        Query query = entityManager.createQuery("select e from User e");
        return (List<User>) query.getResultList();
    }

    @Override
    public Boolean delete(int id){
        Query q = entityManager.createNativeQuery("SELECT * FROM spring.book where user_id =?",Book.class);
        q.setParameter(1,id);
        List<Book> li =  q.getResultList();
        for (Book item : li) {
            entityManager.remove(item);
        }
        User u = entityManager.find(User.class , id);
        try {
            entityManager.remove(u);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

























}
