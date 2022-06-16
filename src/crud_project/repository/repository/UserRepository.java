package crud_project.repository.repository;

import crud_project.repository.model.Gender;
import crud_project.repository.model.User;

public interface UserRepository {
    User createUser(String name, int age, Gender gender, String phoneNumber);

    int size();

    User get(String phoneNumber);
    boolean updateGender(User user, Gender gender);

     boolean removeUser(User user);

    boolean updatePhoneNumber(User user, String phoneNumber);
}

