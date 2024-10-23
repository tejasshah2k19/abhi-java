public class InheritanceDemo {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
        c.mul();
        c.sub(); 

        SciCalc sc = new SciCalc(); 
        sc.sin();
        sc.cos();

        sc.add();
        sc.mul();
        sc.sub();
    }
}


class Calc{
    void add(){
        System.out.println("Calc::add()");
    }
    
    void sub(){
        System.out.println("Calc::sub()");
    }

    void mul(){
        System.out.println("Calc::mul()");
    }
}

class SciCalc extends Calc{
    void sin(){
        System.out.println("SciCalc::sin()");
    }
    void cos(){
        System.out.println("SciCalc::cos()");
    }
    //add() sub() mul() 
}