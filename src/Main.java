public class Main {
    public static void main(String[] args)
    {
        int someValue=4;
        int factorial =1;

        while(someValue>1){
            factorial*=someValue;
            someValue=someValue-1;
        }
        System.out.println("El factorial de 4 es "+factorial);
    }
}