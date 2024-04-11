import java.util.*;
public class Game21 {
    public static void main (String[]args){
int card1 = (int)(10*Math.random())+1;
int card2 = (int)(10*Math.random())+1;
int card3 = (int)(10*Math.random())+1;
int decision;
int sum = card1+card2;
int sum2=card1+card2+card3;

System.out.println("1 = " + card1);
System.out.println("2 = " + card2);
System.out.println("sum = 2" + sum);

Scanner input = new Scanner(System.in);

System.out.println("How bout another card 1 for yes 2 for no");
decision = input.nextInt();

    if (decision==2){
    System.out.println("Your sum is " + sum2);
}
    
    else if (decision==1){
    System.out.println("You choose " + card3);
    System.out.println("Now the sum is " + sum2);
}
    if(sum2 < 21){
    System.out.println("Winner");
}
    if(sum2 > 21){
    System.out.println("Too bad");
}
}
}