import java.awt.*;

public class Man implements Person{
    peopleIcon meetingtile;
    boolean[][] granparents={{true,true},{true,true}};
    boolean[] parents={true,true};
    String gender="male";
    boolean single=true;
    int age=20;
    boolean fast=true;
    Main frame;

    Man(int x, int y, Main m){
        peopleIcon n=new peopleIcon(x,y, Color.red);
        meetingtile=n;
        frame=m;
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