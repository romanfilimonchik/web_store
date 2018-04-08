package com.filimonchik.service;


import com.filimonchik.bean.User;

public interface IUserService extends IBaseService<User> {
    /**
     * Save or update user in db
     *
     * @param bean - bean
     */
    void saveOrUpdate(User bean);

    /**
     * Get user by login
     *
     * @param login - login
     * @return user
     */
    User get(String login);

    /**
     * Check is email exist
     *
     * @param email - email for check
     * @return true if exist
     */
    boolean isEmailExist(String email);

    /**
     * Check is login exist
     *
     * @param login - email for check
     * @return true if exist
     */
    boolean isLoginExist(String login);

    /**
     * Update profile
     * @param userId - old userId(not change)
     * @param login - new login
     * @param password - new password
     * @param email - new email
     */
    void editProfile(int userId, String login, String password, String email);

    /**
     * SignUp user with parameter
     * @param login - login
     * @param password - password
     * @param email - email
     */
    void signUpUser(String login, String password, String email);
}

