import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
     public static void main(String[] args) {
        LinkedList<Integer>  lq = new LinkedList<>(); 
        

        Queue<Integer>  q = new LinkedList<>(); 
        
        q.add(10);
        q.add(20);
        q.add(15);
        q.add(-5);
        q.add(30);
        q.add(10);
        q.add(100); // if it fails throw an exception 
        q.offer(200);// return boolean -> true / false 

        System.out.println(q);//print all 
        System.out.println(q.size());//total count - size 
        System.out.println(q);//check duplicate is present 
        System.out.println(q.peek());//top element-> first 
        System.out.println("size => "+q.size());//same size 
        System.out.println(q.poll());//top element-> first -> remove 
        System.out.println("size => "+q.size());//size--  

        System.out.println(q.remove());//if queue is empty and you call remove you will get runtime error : exception 
        System.out.println("size => "+q.size());

        System.out.println(q.element());//same as peek -> if queue is empty throw an exception 

        
        System.out.println(q.contains(1000));//false 
        System.out.println(q.contains(100));//true 
        
     }
}
