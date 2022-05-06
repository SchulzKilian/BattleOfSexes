import java.awt.*;

public class Woman implements Person {
    peopleIcon meetingtile;
    String gender="female";
    boolean single=true;
    int age=20;
    boolean fast=false;
    Woman(int x, int y){
        peopleIcon w =new peopleIcon(x,y, Color.cyan);
        meetingtile = w;
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
