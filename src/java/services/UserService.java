package services;

import dataaccess.UserDB;
import models.User;

/**
 *
 * @author admin
 */
public class UserService {
    private UserDB userDB = new UserDB();
    
    public User get(String email) throws Exception {
        User user = this.userDB.get(email);
        return user;
    }
}