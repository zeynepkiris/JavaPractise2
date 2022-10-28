package DonguOdevler;

public class PrimeNumbers {
    public static void main(String[] args) {
        int divide=0;
        for(int number =2; number<=100; number++){
            for (int i=2; i<number; i++){
                if (number%i==0){
                    divide++;
                }
            }

            if (divide==0) {
                System.out.print(" "+number);
            }
            divide = 0;
        }
    }
}
