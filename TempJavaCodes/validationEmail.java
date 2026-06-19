package TempJavaCodes;

import java.util.Scanner;

public class validationEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email ;
        email = sc.nextLine();
        if(email.matches("^[a-zA-Z0-9_-]+@gmail.com")){
            System.out.println(email+ " is Valid");
        }else{
            System.out.println(email +" is Not Valid");
        }
        sc.close();
    }
}
