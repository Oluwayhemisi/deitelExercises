package Diarypackage.repository;

import Diarypackage.model.User;

import java.util.ArrayList;

public class UserRepositoryImp implements UserRepository{
    ArrayList<User> users = new ArrayList<>();
    @Override
    public void createUser(User user) {
        users.add(user);
    }
}
