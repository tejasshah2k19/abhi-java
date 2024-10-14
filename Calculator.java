public class Calculator {
    int n1 = 10;//instance variable 
    int n2 = 20;//instance variable 

    public static void main(String args[]) {

            //calling 
            Calculator obj = new Calculator();
            
            //using dot operator 
            obj.add();
            obj.sub();
            obj.mul();
            
    }

    //
    void add() {
        int ans = n1 + n2;//local variable
        System.out.println(ans);
    }

    void sub() {
        int ans = n1 - n2;//local variable 
        System.out.println(ans);
    }

    void mul() {
        int ans = n1 * n2;
        System.out.println(ans);
    }
}
