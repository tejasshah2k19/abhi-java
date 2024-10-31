public class FactoryDemoBankDemo {
    
    public static void main(String[] args) {
        
        // Saving s = new Saving();

        // Current c = new Current(); 

        // HDFCBank s = new Saving();  
        // s.wid();

        // HDFCBank c = new Current();
        // c.wid();

        HDFCBank s = AccountFactory.createAccount("saving");//saving 
        HDFCBank c = AccountFactory.createAccount("current");//saving 
        
    }
}

//interface 
abstract class HDFCBank{
    abstract void wid();
}

class Saving extends HDFCBank{
    void wid(){
        System.out.println("Saving::wid()");
    }
}

class Current extends HDFCBank{
    void wid(){
        System.out.println("Current::wid()");
    }
}

class AccountFactory{

    public static HDFCBank createAccount(String accountType){
        if(accountType.equals("saving")){ 
            return new Saving();
        }
        if(accountType.equals("current")){ 
            return new Current();
        }

        return null; 
    }
}