import java.awt.*;

public class Woman implements Person {
    Thread runningon;
    Man spouse;
    peopleIcon meetingtile;
    String gender="female";
    boolean single=true;
    int age=20;
    boolean fast=false;
    Main frame;
    Woman(int x, int y, Main m){
        peopleIcon w =new peopleIcon(x,y, Color.cyan);
        meetingtile = w;
        frame=m;
    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public boolean type() {
        return fast;
    }

    @Override
    public String getgender() {
        return gender;
    }

    @Override
    public void run() {

    }


}
