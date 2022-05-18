import java.awt.*;

public class Woman implements Person {
    Thread runningon;
    Man spouse;
    peopleIcon meetingtile;
    String gender = "female";
    boolean single = true;
    boolean fast;
    Main frame;
    boolean running = true;
    int[] tempodifermo = new int[2];
    boolean cooldown = true;
    int counter;
    boolean val = true;
    int moved;
    int birthday;


    Woman(int x, int y, Main m) {
        Color c=new Color(0xFFFFFF);
        peopleIcon w=new peopleIcon(x,y, c);
        meetingtile = w;
        meetingtile.setSize(7, 7);
        frame = m;
        //tempodifermo[0]=1;
        //tempodifermo[1]=9;
    }


    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public boolean type() {
        return fast;
    }

    public int getage(){
        return Main.timepassed - birthday;
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
    public void Pause(int CurrentTime, int pausingtime) {
        if (val) {
            tempodifermo[0] = CurrentTime;
            tempodifermo[1] = pausingtime;
            counter++;
            //System.out.println("word");
            running = false;

            val = false;
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
        if(fast) meetingtile.setBackground(new Color(0x9D6363));
        else  meetingtile.setBackground(new Color(0xF6A6A6));

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
                }
                else {
                    moved++;
                    if(moved==4){moved=0; cooldown=true;//System.out.println(moved);
                         }

                }
            }
        }
    }
}
