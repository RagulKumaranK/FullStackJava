package OOPS.OOPS_PROJECTS.P1_BankAccountSystem;
public class BankAccount implements Transaction{
    private String name;
    private double balance;

    public void setterName(String name){
        this.name =name;
    }
    public double getterBalance(){
        return balance;
    }
    public void balanceCheck(){
        System.out.println("Name :"+name +" || balance :"+balance);
    }
    public void deposit(double amount){
        double temp =balance;
        balance+=amount;
        System.out.println("Previous balance : "+temp+"  current balance :"+balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount withdraw successfully : " +amount);
            System.out.printf("Current Balance :%.2f\n",balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}