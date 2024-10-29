public class EncapsulationDemo {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("royal");
        System.out.println(p.getName());   
    }
}

class Person {
    private String name; 
    private int age; 
    private boolean active; 

    public String getName(){
        return name; 
    }
    public int getAge(){
        return age; 
    }
    public void setAge(int age){
        this.age = age; 
    }
    public void setName(String name){
        this.name = name;
    }
    // public boolean getActive(){
    //     return active; 
    // }
    public boolean isActive(){
        return active; 
    }
    public void setActive(boolean active){
        this.active = active;
    }

}