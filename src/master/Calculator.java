package master;

public class Calculator {
    public static int multiplication(int a, int b){
        return a * b;
    }
    
    public static float division(int a, int b){
        return a / (float)b;
    }
    
    public static int addition(int a, int b){
        return a + b;
    }
    
    public static int subtraction(int a, int b){
        return a - b;
    }
    
    public static int power(int a, int b){
        if(b == 0)
            return 1;
        for(int i = 1; i < b; i++){
            a*=a;
        }
        return a;
    }
    
}
