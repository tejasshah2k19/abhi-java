class BankAccount {
    int accountNumber;// account number
    String accountHolder;// account holder name
    double balance;// account balance

    BankAccount(){
        //noargument 
        accountNumber =171; 
        accountHolder="";
        balance = 10000;
        
    } 
    public static void main(String args[]) {
        BankAccount obj = new BankAccount();
        BankAccount obj1 = new BankAccount();
        
        obj.openAccount(12345, "Rock", 25000);
        obj1.openAccount(256522, "Sam", 50000);

        obj.deposit(50000);
        obj1.deposit(25000);

        obj.displayAccountInfo();
        obj1.displayAccountInfo();
    }

    void openAccount(int accNum,String name,double initBalance){
        accountNumber = accNum;
        accountHolder = name;
        balance = initBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient Balance....");
        } else {
            balance = balance - amount;
        }
    }

    void displayAccountInfo() {
        System.out.println("Account Num : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}