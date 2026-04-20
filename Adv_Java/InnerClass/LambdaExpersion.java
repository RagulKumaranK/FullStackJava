interface example {
    void Display(int x);
}


public class LambdaExpersion {
    public static void main(String[] args) {
    
        example obj = (x) ->{
                System.out.println("Hello : "+x);     
    };
    obj.Display(8);
}
}
