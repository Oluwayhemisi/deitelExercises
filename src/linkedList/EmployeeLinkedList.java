package linkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
       EmployeeNode node = new EmployeeNode(employee);
       node.setNext(head);
       head = node;
       
       size++;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(Employee employee){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        return removeNode;
    }



//    public String getByFirstName(String firstName) {
////        Employee employee = new EmployeeNode()
////        return employee.getFirstName();
//
//return firstName;
//
//
//    }
}
