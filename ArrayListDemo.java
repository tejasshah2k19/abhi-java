import java.util.ArrayList;

class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        // how to add data in array list
        // we have multiple methods to deal with array list

        l1.add("ram");
        l1.add("ramayan");
        l1.add("ravan");
        l1.add("laxman");
        l1.add("sita");
        l1.add("shyam");
        l1.add("balram");
        // l1.add(212); //will not works

        System.out.println(l1);
        // we can access data from array list using index
        // System.out.println(l1[0]);//will not work

        System.out.println(l1.get(0));// ram
        System.out.println(l1.get(4));// sita

        // loop
        // start
        // condition
        // increment/decrement

        System.out.println("===================");
        for (int i = 0; i < l1.size(); i++) {// 0 1 2 3 4
            System.out.println(l1.get(i));//
        }

    }
}