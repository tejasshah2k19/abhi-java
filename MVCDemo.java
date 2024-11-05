import java.util.Scanner;

public class MVCDemo {
    public static void main(String[] args) {
        Controller  c=  new Controller();
        c.add(); 
    }
}

class View {
    void input(Model m) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = scr.nextInt();
        int y = scr.nextInt();
        m.setN1(x);
        m.setN2(y);
    }

    void output(Model m){
        System.out.println(m.getAns());

    }
}

class Controller {

    void add() {
        Model m = new Model();
        View v = new View();
        v.input(m);
        m.setAns(m.getN1()+m.getN2());
        v.output(m);
    }
}

class Model {
    private int n1;
    private int n2;
    private int ans;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

}
