public class Negative{
    public static void main (String[]args){
    int a = (int)(7*Math.random())-3;
    int b = (int)(7*Math.random())-3;
    int c = (int)(7*Math.random())-3;
    int d = (int)(7*Math.random())-3;
    int x = a + b + c + d;
    System.out.println("num1 =" + a);
    System.out.println("num2 =" + b);
    System.out.println("num3 =" + c);
    System.out.println("num4 =" + d);
    System.out.println("Together =" + x);
    if (x < 0){
        System.out.println("Negative");
    }
    else{ 
    System.out.println("Not Negative");
    }
    }
}