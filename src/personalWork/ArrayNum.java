package personalWork;

public class ArrayNum {
    public static void main(String[] args) {
        int [] arrays  = new int[300];
        for(int i = 0; i < 300; i++){
            arrays[i]= 1+i;
        }
        for(int i = 0; i < 300; i++)
        {
            System.out.print(arrays[i]+" ");
        }

    }
}
