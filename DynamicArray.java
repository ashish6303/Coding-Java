import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {

//        Dynamic array creation
        ArrayList<Integer> array = new ArrayList<>();

//        Print the size of ArrayList
        System.out.println(array.size());

        array.add(1);
        array.add(2);
        array.add(3);

        System.out.println(array.size());
        System.out.println(array);
        array.remove(0);
        System.out.println(array.size());
        System.out.println(array);
    }

}
