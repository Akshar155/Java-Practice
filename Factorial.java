public class Factorial{
    public static void main(String[] args) {
        int n = 5 , i = 1 , fact = 1;
        for(i = 1 ; i < n + 1 ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial is :- " + fact);
    }
}