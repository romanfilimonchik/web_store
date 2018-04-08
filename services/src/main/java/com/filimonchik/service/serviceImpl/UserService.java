package com.filimonchik.service.serviceImpl;

import com.filimonchik.bean.User;
import com.filimonchik.dao.IUsersDAO;
import com.filimonchik.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Service for users.
 */
@Service("userService")
@Transactional
public class UserService implements IUserService {
    @Autowired
    private IUsersDAO usersDAO;

    @Override
    public void saveOrUpdate(User bean) {
        usersDAO.saveOrUpdate(bean);
    }

    @Override
    public User get(Serializable obj) {
        return usersDAO.get(obj);
    }

    @Override
    public User get(int id) {
        return usersDAO.get(id);
    }

    @Override
    public void delete(User user) {
        usersDAO.delete(user);
    }

    @Override
    public List<User> getAll() {
        return usersDAO.getAll();
    }

    public User get(String login) {
        return usersDAO.get(login);
    }

    public boolean isEmailExist(String email) {
        return usersDAO.isEmailExist(email);
    }

    public boolean isLoginExist(String login) {
        return usersDAO.isLoginExist(login);
    }

    @Override
    public void editProfile(int userId, String login, String password, String email) {
        User user = usersDAO.get(userId);
        if (!StringUtils.isEmpty(login)) {
            if (login.matches(User.LOGIN_REGEX)) {
                user.setLogin(login);
            }
        }
        if (!StringUtils.isEmpty(password)) {
            if (password.matches(User.PASSWORD_REGEX)) {
                user.setPassword(password);
            }
        }
        if (!StringUtils.isEmpty(email)) {
            if (email.matches(User.EMAIL_REGEX)) {
                user.setEmail(email);
            }
        }
        saveOrUpdate(user);
    }

    @Override
    public void signUpUser(String login, String password, String email) {
        User user = new User(login, password, email);
        saveOrUpdate(user);
    }
}
