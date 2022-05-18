import java.awt.*;

public class Man implements Person{
    Thread runningon;
    peopleIcon meetingtile;
    boolean[] parents={true,true};
    String gender="male";
    boolean single=true;
    boolean fast;
    Main frame;
    boolean running=true;
    int[] tempodifermo=new int[2];
    int counter=0;
    boolean val=true;
    boolean  cooldown=true;
    int moved=0;
    int birthday;



    Man(int x, int y, Main m){
        Color c=new Color(0xFFFFFF);
        peopleIcon n=new peopleIcon(x,y, c);
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
    public int getage(){
        return Main.timepassed - birthday;
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
             //System.out.println(f+" "+CurrentTime);
            if (f < CurrentTime) {
                //System.out.println("yes");
                cooldown = false;
                running = true;
                val = true;
                frame.Court(false,this);
            }
            //System.out.println(CurrentTime);
            //System.out.println(f);
            return true;
        }
        return false;
    }

    @Override
    public Main getFrame() {
        return frame;
    }

    @Override
    public void fenotipo() {
        if(fast) meetingtile.setBackground(new Color(0x7DC0A0));
        else  meetingtile.setBackground(new Color(0xBFFFF2));

    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }
    public void turntrue(Boolean b){
        b=true;
    }

    @Override
    public void run() {
        while (true) {
            frame.slowdown();
            //System.out.println("4");
            if (running){
                int[][] on = frame.move(this);
                if (cooldown) {
                    if(frame.Forbidden.contains(frame.getcoor(on[0][0],on[0][1]))==false){
                    frame.localmeet(on);}
                    //System.out.println(this);
                }
                else {
                    moved++;
                    if(moved==4){
                        moved=0;
                        cooldown = true;
                        //System.out.println("triggered by man");
                        }
                }
            }
        }
    }
}
