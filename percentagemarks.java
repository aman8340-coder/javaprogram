import java.util.Scanner;
public class percentagemarks {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        System.out.println("Enter the marks of power1");
        float power1 = sc.nextInt();
        System.out.println("Enter the marks of power2");
         float power2 = sc.nextInt();
         System.out.println("Enter the marks of power3");
         float power3 = sc.nextInt();
         float totalmarks = power1+power2+power3;
         System.out.println("the total marks is;"+totalmarks);
         float percentagemarks = (totalmarks/3000)*100;
         System.out.print("the percentage marks is;"+percentagemarks);



    }
    
}
