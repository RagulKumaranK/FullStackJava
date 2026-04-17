package Adv_Java.Exception_Handling;

public class tryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr =new int[10];
        try{
            arr[200]=10;
             int c = a/b;
           
        }catch(ArithmeticException e){
            System.out.println(" "+e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println(" "+e.getMessage());
        }finally{
            System.out.println("Program Ends");
        }
    }
}
