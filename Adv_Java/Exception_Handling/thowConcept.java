package Adv_Java.Exception_Handling;

public class thowConcept {
    public static void main(String[] args) {
        SavingAcc SA = new SavingAcc(1500.23);
        SA.withdraw(500);
    }
}
class InsufficientBalance extends Exception{
        InsufficientBalance(){
        }
    }
class SavingAcc{
        private double balance;
        int min =1000;

        SavingAcc(double balance){
            this.balance= balance;
            
        }
        
        public void withdraw(double amt){
            try{
            if(balance-amt<min){
                throw new InsufficientBalance();
            }else{
                balance -= amt;
                System.out.println("Successful New Balance "+balance);
            }
            }catch(InsufficientBalance e){
                System.out.println("No Balance");
            }
        }
    }
