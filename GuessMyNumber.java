import java.util.*;
public class GuessMyNumber {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100);
        //System.out.println(num);
        Scanner sc = new Scanner(System.in);
        int guess;
        do{
            System.out.println("Guess the number");
            guess = sc.nextInt();
            if(guess>num){
                System.out.println("Too high");
            }
            else if(guess<num){
                System.out.println("Too low");
            }
            else{
                System.out.println("You guessed it!");
                break;
            }
        }
        while(guess>=0);
        sc.close();
    }
}

