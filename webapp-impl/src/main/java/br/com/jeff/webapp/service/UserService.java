package br.com.jeff.webapp.service;

import br.com.jeff.webapp.dao.UserDao;
import br.com.jeff.webapp.model.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {

    @Inject
    private UserDao userDao;

    public void addUser(User user) {
        userDao.insert(user);
    }

    public List<User> listAll() {
        return userDao.listAll();
    }
}
