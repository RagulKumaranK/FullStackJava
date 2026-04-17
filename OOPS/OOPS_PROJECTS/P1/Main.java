public class Main {
    public static void main(String[] args) {
        //ankAccount BA = new BankAccount();
        SavingAccount SA = new SavingAccount();
        SA.setterName("Ragul Kumaran K");
        SA.deposit(10000);
        SA.balanceCheck();
        SA.deposit(200);
        SA.withdraw(1200);
        SA.accountType();
        
    }
    
}
