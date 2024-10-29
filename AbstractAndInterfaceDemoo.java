public class AbstractAndInterfaceDemoo {
    public static void main(String[] args) {
        // TRAI t = new TRAI();
        TRAI t = new Jio();
        TRAI a = new Jio();

        t.call();
        t.recharge();
        t.port();

        a.call();

        t = new Airtel();
        t.call();
        t.recharge();
        t.port();

    }
}

interface GOI{

} 

interface DOT {

    void internet3gPlan();
   public abstract void internet5gPlan();
    public static final int a = 10;
}

class BSNL implements DOT , GOI  {
   public void internet3gPlan(){

    }
   public void internet5gPlan(){

    }
}

abstract class TRAI {
    void call() {

    }

    abstract void recharge();// declaration - no logic

    abstract void port();
}

class Jio extends TRAI {
    void internetCall() {

    }

    void recharge() {

    }

    void port() {

    }
}

class Airtel extends TRAI {
    void recharge() {

    }

    void port() {

    }
}

class IDEA extends TRAI implements DOT {

     public void internet3gPlan() {
     }

     public void internet5gPlan() {
    }

     void recharge() {
    }

     void port() {
      }

}