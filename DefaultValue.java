public class DefaultValue {
    public static void main(String[] args) {
        LegionLaptop l  = new LegionLaptop(); 
        l.display();
    }
}//

class LegionLaptop{
    double price;
    float discount;
    int ram; 
    long hdd;
    short speaker;
    byte usb; 
    char category; //G S B C 
    boolean active; 
    String laptopCode; 
    
    //number -> 0  , real 0.0 
    //char -> null character '\0'
    //boolean -> false 
    //non primitive class -> null
    
    LegionLaptop(){
        price = 200000;
        discount=5.5f;//F f => float 
        laptopCode = "24E2";
        System.out.println("Constructor call done..");
    }
    void display(){
        System.out.println(active);
        System.out.println(usb);
        System.out.println(speaker);
        System.out.println(category);
        System.out.println(ram);
        System.out.println(hdd);
        System.out.println(discount);
        System.out.println(price);
        System.out.println(laptopCode);
    }

}

class LegionMouse{

}
