import java.awt.*;

public class Woman implements Person{
    Tile meetingtile;
    String gender="female";
    boolean single=true;
    int age=20;
    boolean fast=false;
    Woman(int x, int y){
        Tile w=new Tile(x,y, Color.CYAN);
        meetingtile=w;
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
