package in.strikes.service;

import in.strikes.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    private Map<Integer, User> userDB;

    public UserService() {
        userDB = new HashMap<>();
    }

    public User createUser(User userReq) {
        userDB.put(userReq.getId(), userReq);
        return userReq;
    }

    public List<User> getAllUsers() {

        List<User> usersResp = new ArrayList<>();

        for(User user : userDB.values())  {
            usersResp.add(user);
        }

        return usersResp;
    }

    public User getUserById(Integer id) {
        return userDB.getOrDefault(id, null);
    }


}
