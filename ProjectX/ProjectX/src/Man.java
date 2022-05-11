import java.awt.*;

public class Man implements Person{
    Thread runningon;
    peopleIcon meetingtile;
    boolean[] parents={true,true};
    String gender="male";
    boolean single=true;
    int age=20;
    boolean fast=true;
    Main frame;
    boolean running=true;
    int[] tempodifermo=new int[2];
    int counter=0;
    boolean val=true;
    boolean cooldown=true;
    long birthday;
    int behindbarsuntil;



    Man(int x, int y, Main m){
        peopleIcon n=new peopleIcon(x,y, new Color(0x327067));
        meetingtile=n;
        meetingtile.setSize(7,7);
        frame=m;
        //tempodifermo[0]=1;
        //tempodifermo[1]=9;
    }
    @Override
    public boolean amifree(){
        if (Main.timepassed>=behindbarsuntil){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean type(){
        return fast;
    }
    @Override
    public long getAge(){
        return Main.timepassed-birthday;

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
        if(val){
        tempodifermo[0]=CurrentTime;
        tempodifermo[1]=pausingtime;
        counter++;
        cooldown=false;
        //System.out.println("word");
        running=false;
        val=false;

        }

    }
    @Override
    public boolean Startagain(int CurrentTime) {
        if (counter >= 1) {
            int f = tempodifermo[0] + tempodifermo[1];
            //f=2600;
            // System.out.println(f+" "+CurrentTime);
            if (f < CurrentTime) {
                //System.out.println("yes");
                cooldown = false;

                running = true;

                val = true;
            }
            //System.out.println(CurrentTime);
            //System.out.println(f);
            return true;
        }
        return false;
    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("eo");
            if (running){
                int[][] on = frame.move(this);
                if (cooldown) {
                    // System.out.println("2");
                    frame.localmeet(on);
                }
            }
        }
    }
}
