public class SuperThisKeyword {
    public static void main(String[] args) {

    }
}

class Car {
    int totalGear;
}

class Mercedez extends Car {
    int extraTq;
    double totalGear;

    void printDetail(){
        System.out.println(extraTq);
        System.out.println(totalGear);//Mercedez 
        System.out.println(super.totalGear);//Car 
        System.out.println(this.totalGear);//Mercedez 
        }
}

class Dzire extends Car {
    int bootSpace;

    void printDetail() {
        System.out.println(bootSpace);
        System.out.println(totalGear);//Car 
    }
}