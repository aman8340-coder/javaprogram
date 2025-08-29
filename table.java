import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no which table you want");
        n = sc.nextInt();
        System.out.println("The Table of"+n+"is --");
        for(int i =1 ; i<=10 ; i++){
            System.out.println(n+"X"+i +"="+i*n);
        }
    }
}
