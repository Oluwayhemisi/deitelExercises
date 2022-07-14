package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeLinkedListTest {
    private EmployeeLinkedList employeeLinkedList;

    @BeforeEach
    void setUp() {
        employeeLinkedList = new EmployeeLinkedList();
    }

    @Test
    public void createListOfEmployees() {
        Employee employee = new Employee("Sola", "Thompson", 000);
        employeeLinkedList.addToFront(employee);

        Employee employee1 = new Employee("Ismail", "Haleema", 111);
        employeeLinkedList.addToFront(employee1);

        Employee employee2 = new Employee("Bukola", "Donald", 222);
        employeeLinkedList.addToFront(employee2);

        Employee employee3 = new Employee("Yaro", "Juwairriya", 4333);
        employeeLinkedList.addToFront(employee3);
        assertEquals(4,employeeLinkedList.getSize());
    }

    @Test
    public void removeEmployee(){
        Employee employee = new Employee("Shola", "Thompson", 000);
        employeeLinkedList.addToFront(employee);

        Employee employee1 = new Employee("Ismail", "Haleema", 111);
        employeeLinkedList.addToFront(employee1);

        Employee employee2 = new Employee("Bukola", "Donald", 222);
        employeeLinkedList.addToFront(employee2);

        employeeLinkedList.removeFromFront(employee2);
        assertEquals(2,employeeLinkedList.getSize());
    }
    @Test
    public void getEmployeeByFirstName(){
        Employee employee = new Employee("Shola", "Thompson", 000);
        employeeLinkedList.addToFront(employee);

        Employee employee1 = new Employee("Ismail", "Haleema", 111);
        employeeLinkedList.addToFront(employee1);

//        assertEquals(employee,employeeLinkedList.getByFirstName("Shola"));
//        assertEquals(employee1);

    }
}