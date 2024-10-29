public class ObjectClassExistance {
    public static void main(String[] args) {
        NoMethod obj = new NoMethod(); 
        System.out.println(obj.toString()); 
        System.out.println(obj.hashCode());

        //from where we get this toString and hashCode -> Object class 
        

    }
}

class NoMethod {

}
