public class SavingAccount extends BankAccount {
    public void accountType(){
        System.out.println("this is saving account");
    }
    @Override
    public void withdraw(double amount){
        int min =500;
        if(getterBalance()-amount>min){
            super.withdraw(amount);
            System.out.println("Amount withdraw successfully");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
