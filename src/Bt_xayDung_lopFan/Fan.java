package Bt_xayDung_lopFan;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    int speed = 1;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){}
    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }
    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (on){
            return "speed: "+this.speed + " color: "+this.color+" radius: "+this.radius+". Fan is on";
        }else {
            return "speed: "+this.speed + " color: "+this.color+" radius: "+this.radius+". Fan is off";
        }
    }

}

class Main{
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
