import java.awt.*;

public class Man implements Person {
    peopleIcon meetingtile;
    String gender="male";
    boolean single=true;
    int age=20;
    boolean fast=true;

    Man(int x, int y){
        peopleIcon n=new peopleIcon(x,y, Color.red);
        meetingtile=n;
    }
    public boolean type(){
        return fast;
    }

    @Override
    public String getgender() {
        return gender;
    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public void run() {

    }
}
