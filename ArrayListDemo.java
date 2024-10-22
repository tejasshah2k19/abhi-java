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


        //add get size 

        //remove item from list
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1);

        l1.remove("laxman");//boolean 
        System.out.println(l1);

        //search ->item -> sita is present 
        System.out.println(l1.contains("sita"));//boolean : true 
        System.out.println(l1.contains("ram"));//boolean  : false 
        

       // l1.clear(); //remove all the items from list 

        l1.add("joker");//when we say add it will add at the last 
        System.out.println(l1);

        l1.addFirst("race");
        System.out.println(l1);

        l1.addLast("car-race");
        System.out.println(l1);


       System.out.println(l1); 
       l1.add(0,"zero");//add->index-> index add -> rest are shift right 
       
       System.out.println(l1);
       l1.set(0, "FIRST");
       System.out.println(l1);

    }
}