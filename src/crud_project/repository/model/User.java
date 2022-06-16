package crud_project.repository.model;

public class User {
    private String name;
    private Gender gender;
    private int age;
    private String phoneNumber;

    public User() {
    }

    public User(String name, Gender gender, int age, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                name : %s
                age : %d
                gender : %s
                phone-number : %s""", name, age, gender, phoneNumber);
    }

}
