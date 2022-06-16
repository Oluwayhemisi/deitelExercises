package crud_project.repository;

import crud_project.repository.model.Gender;
import crud_project.repository.model.User;
import crud_project.repository.repository.UserRepository;
import crud_project.repository.repository.UserRepositoryImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class UserRepositoryImpTest {
    private UserRepository userRepository;
    @BeforeEach
    void setUp(){
        userRepository = new UserRepositoryImp();
    }

    @Test
    public void userRepositoryCanBeCreated(){
     assertNotNull(userRepository);

        }
        @Test
    public void userCanBeCreated(){
        userRepository.createUser("Yemisi",18, Gender.FEMALE,"08088818629");
        assertEquals(1,userRepository.size());
        }
        @Test
    public void userDetailsCanBeRetrieved(){
        userRepository.createUser("Yemisi",18, Gender.FEMALE,"08088818629");
        userRepository.createUser("Simisola",25,Gender.FEMALE,"08136460991");
        userRepository.createUser("Sharon",15,Gender.FEMALE,"09052396366");
        userRepository.createUser("Hafeez",28,Gender.MALE,"08132789495");
        User user = userRepository.get("09052396366");
        assertEquals("""
                name : Sharon
                age : 15
                gender : FEMALE
                phone-number : 09052396366""",user.toString());
        }
        @Test
    public void userGenderCanBeUpdated(){
            User user2 = userRepository.createUser("Simisola",25,Gender.FEMALE,"08136460991");
            assertTrue(userRepository.updateGender(user2, Gender.MALE));
            assertEquals(Gender.MALE,user2.getGender());
        }
        @Test
        public void userPhoneDetailsCanBeUpdated(){
            User user1 = userRepository.createUser("Yemisi",18, Gender.FEMALE,"08088818629");
            User user2 = userRepository.createUser("Simisola",25,Gender.FEMALE,"08136460991");
            User user3 = userRepository.createUser("Sharon",15,Gender.FEMALE,"09052396366");
            User user4 = userRepository.createUser("Hafeez",28,Gender.MALE,"08132789495");
            userRepository.updatePhoneNumber(user2,"09075586677");
            assertEquals("09075586677",user2.getPhoneNumber());
        }
        @Test
        public void userDetailsCanBeDeleted(){
            User user1 = userRepository.createUser("Yemisi",18, Gender.FEMALE,"08088818629");
            User user2 = userRepository.createUser("Simisola",25,Gender.FEMALE,"08136460991");
            User user3 = userRepository.createUser("Sharon",15,Gender.FEMALE,"09052396366");
            User user4 = userRepository.createUser("Hafeez",28,Gender.MALE,"08132789495");
            assertTrue(userRepository.removeUser(user3));
            assertEquals(3,userRepository.size());
        }
    }

