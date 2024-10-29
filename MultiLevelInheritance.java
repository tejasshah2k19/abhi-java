public class MultiLevelInheritance {
    public static void main(String[] args) {
        SantaBanta sb = new SantaBanta();
        sb.santaAdd();
        sb.bantaAdd();
        sb.santaBantaAdd(); 
        sb.commonAdd(); 
    }
}

// multilevel
class Santa {
    void santaAdd() {
        System.out.println("santaAdd");
    }

    void commonAdd(){
        System.out.println("CommonAdd from Santa class");
    }
}

class Banta extends Santa {
    void bantaAdd() {
        System.out.println("bantaAdd");

    }
    
    void commonAdd(){
        System.out.println("CommonAdd from Banta class");
    }
}

class SantaBanta extends Banta {
    void santaBantaAdd() {
        System.out.println("santaBantaAdd");
    }

    //SantaBanta -> search in inside own class 
    //Banta      -> direct parent 
    //Santa      -> indirect parent  
}
