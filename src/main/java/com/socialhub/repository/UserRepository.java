package com.socialhub.repository;

import com.socialhub.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> findAll() {
        return users;
    }
}
