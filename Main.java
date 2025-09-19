// static variable in java 
class Thsdemo {
    static int num = 3;  

    public void set() {
        num++;
    }

    public void get() {
        System.out.println(num);
    }
}

class Main {
    public static void main(String[] args) {
        Thsdemo ob1 = new Thsdemo();
        Thsdemo ob2 = new Thsdemo();
        Thsdemo ob3 = new Thsdemo();

        ob1.set(); // num = 4
        ob1.set(); // num = 5
        ob2.set(); // num = 6
        ob3.set(); // num = 7
        ob3.set(); // num = 8
        ob3.set(); // num = 9

        ob1.get(); // prints 9
        ob2.get(); // prints 9
        ob3.get(); // prints 9
    }
}