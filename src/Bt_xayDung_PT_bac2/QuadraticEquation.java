package Bt_xayDung_PT_bac2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public double delta, x1, x2;
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void getabc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        this.a = scanner.nextDouble();
        System.out.print("Enter b: ");
        this.b = scanner.nextDouble();
        System.out.print("Enter c: ");
        this.c = scanner.nextDouble();
    }

    public double getDiscriminant(){
        delta = (Math.pow(this.b,2) - 4 * this.a * this.c);
        return delta;
    }
    public double getRoot1(){
            return (-this.b + Math.sqrt(Math.pow(this.b,2) - 4*this.a * this.c))/2;
    }
    public double getRoot2(){
            return (-this.b - Math.sqrt(Math.pow(this.b,2) - 4*this.a * this.c))/2;
        }
    }



class Main{
    public static void main(String[] args) {
        QuadraticEquation math = new QuadraticEquation();
        math.getabc();

        if (math.getDiscriminant() == 0){
            System.out.print("Phương trình có hai nghiệm trùng nhau là:\nx1 = x2 = " + math.getRoot1());
        } else if (math.getDiscriminant() > 0){
            System.out.print("Phương trình có 2 nghiệm khác biệt là:\nx1 = "+math.getRoot1()+"\nx2 = "+math.getRoot2());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}