package chapSixteen;




class Node<T>{
    private T data;
    private Node<T> next;

    public boolean addNext(Node<T> node){
        next = node;
        return true;
    }

    public  Node<T> next(){
        return next;
    }
}

public class SinglyList<T> {
    private  Node<T>
}
