import java.awt.*;

public class Man implements Person{
    Thread runningon;
    peopleIcon meetingtile;
    boolean[][] granparents={{true,true},{true,true}};
    boolean[] parents={true,true};
    String gender="male";
    boolean single=true;
    int age=20;
    boolean fast=true;
    Main frame;
    boolean running=true;
    int[] tempodifermo=new int[2];
    int counter=0;



    Man(int x, int y, Main m){
        peopleIcon n=new peopleIcon(x,y, new Color(0x327067));
        meetingtile=n;
        meetingtile.setSize(7,7);
        frame=m;
        //tempodifermo[0]=1;
        //tempodifermo[1]=9;
    }
    public boolean type(){
        return fast;
    }

    @Override
    public String getgender() {
        //System.out.println("triggered");
        return gender;
    }

    @Override
    public Thread getRunningon() {
        return runningon;
    }


    @Override
    public void Pause(int CurrentTime, int pausingtime) {
        tempodifermo[0]=CurrentTime;
        tempodifermo[1]=pausingtime;
        counter++;
        //System.out.println("word");
        running=false;

    }

    @Override
    public synchronized boolean Startagain(int CurrentTime) {
        if(counter>=1){
        int f=tempodifermo[0]+tempodifermo[1];
        //f=2600;
        if(f<CurrentTime){
            System.out.println(f);
        running=true;}
        //System.out.println(CurrentTime);
            System.out.println(f);
        return true;}
        return false;
    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public void run() {
        while (running){
        frame.move(this);
        for (Tile tile: frame.Tlist) {
            frame.meet(tile);}
        }
    }
}
