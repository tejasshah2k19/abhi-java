public class MethodOrverrideDemo {
    public static void main(String[] args) {
        
    }
}

class RBI{
    void wid(){
        //25000 wid-> 
    }
    void dep(){

    }
    void dep(int amt){
        //overloading 
    }
    void checkBal(){

    }
}

class ICICI extends RBI{
    void wid(){ //parent exact signature 
        //dynamic 
    }
    void checkBal(int acctNum){
        
    }
}
