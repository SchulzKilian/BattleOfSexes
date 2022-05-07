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
        peopleIcon w =new peopleIcon(x,y, new Color(0x554AC2));
        meetingtile = w;
        meetingtile.setSize(7,7);
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
    public Thread getRunningon() {
        return runningon;
    }

    @Override
    public void run() {
        while (true){
        frame.move(this);
        for (Tile tile: frame.Tlist) {
            frame.meet(tile);

        }}

    }


}
