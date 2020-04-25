public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        if(number<=1) return -1;
        //find all the factors of number except 1 since 1 is not prime
        for(int i=number; i>1; i--){
            if(number%i==0){
                boolean isPrime = true;
                //find the prime from the factors
                //Note that prime can only be divisible by 1 and itself
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) return i;
            }
        }
        //if no factors are found, the number itself is a prime
        return number;
    }
}