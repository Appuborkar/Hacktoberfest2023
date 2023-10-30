import java.util.Scanner;
class Calculator{
    int num1;
    int num2;
    void getData(){
        System.out.println("Enter two number:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    void add(){
        int a=num1+num2;
        System.out.println("Addition is:"+a);

    }
    void sub(){
        int b=num1-num2;
        System.out.println("Subtraction is:"+b);

    }
    void mul(){
        int c =num1*num2;
        System.out.println("Multiplication is:"+c);

    }
    void div(){
        int d=num1/num2;
        System.out.println("Division is:"+d);

    }
    public static void main(String args []){
        Calculator c1=new Calculator();
        c1.getData();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
}
}
