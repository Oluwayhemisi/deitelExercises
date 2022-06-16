package crud_project.repository.repository;

import crud_project.repository.model.Gender;
import crud_project.repository.model.User;

import java.util.ArrayList;

public class UserRepositoryImp implements UserRepository {
    private ArrayList<User> users = new ArrayList<>();
    @Override
    public User createUser(String name, int age, Gender gender, String phoneNumber) {
     User user = new User(name, gender,age,phoneNumber);
     users.add(user);
     return user;
    }

    @Override
    public int size() {
        return users.size();

    }

    @Override
    public User get(String phoneNumber) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(phoneNumber.equals(user.getPhoneNumber())){
                return user;
            }

        }
       return null;
    }

    @Override
    public boolean updateGender(User user, Gender gender) {
        for (int i = 0; i < users.size(); i++) {
            User foundUser = users.get(i);
            if(user.equals(foundUser)){
                foundUser.setGender(gender);
                return  true;
            }
        }

       return false;
    }

    @Override
    public boolean removeUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            User foundUser = users.get(i);
            if(user.equals(foundUser)){
                users.remove(user);
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean updatePhoneNumber(User user, String phoneNumber) {
        for (int i = 0; i < users.size(); i++) {
           User foundUser = users.get(i);
           if(user.equals(foundUser)){
               foundUser.setPhoneNumber(phoneNumber);
               return true;
           }
        }
        return false;
    }


}
