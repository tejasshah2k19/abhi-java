public class PolymorphicObject {
    public static void main(String[] args) {
        // Bike b = new Bike(); 
        // b.start();
        // b.stop();
        
        // Pulser p = new Pulser(); 
        // p.start();//pulser
        // p.stop(); //bike
    
        
        Bike b = new Pulser();//polymorphic object 
        b.start();  //compiletime:Parent class -> Bike  runtime:child -> Pulser  
        b.stop();
        //b.disc();
    }
}
//javac XXX.java -> compile -> .class ->Bike 

//java XXX -> runtime -> .class -> run -> memory -> Pulser   
class Bike{
    void start(){
        System.out.println("start::bike");
    }

    void stop(){
        System.out.println("stop::bike");
    }
}

class Pulser extends Bike{
    void start(){
        System.out.println("Pluser::start");
    }
    void disc(){
        System.out.println("Pulser::disc");
    }
}


//                  Bike 
    //              1  3 4 
//  Pulsar      Yuzdi       Boxer       Bullet 
//   1  2 3     1 5 4 3     1 2 3 6    1 2 5 9 7 

//Bike b = new Pulsar() 
//1 3 4 

//Bike b =new Boxer()
//1 3 4  

//Bike y = new Yuzdi()
//1 3 4  

//Boxer b = new Pulsar();

//Parent p = new Child();

//Pular p = new Bike();  