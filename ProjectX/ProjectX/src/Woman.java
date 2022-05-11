import java.awt.*;

public class Woman implements Person {
    Thread runningon;
    Man spouse;
    peopleIcon meetingtile;
    String gender = "female";
    boolean single = true;
    int age = 20;
    boolean fast = false;
    Main frame;
    boolean running = true;
    int[] tempodifermo = new int[2];
    boolean cooldown = true;
    int counter;
    boolean val = true;
    long birthday;

    Woman(int x, int y, Main m) {
        peopleIcon w = new peopleIcon(x, y, new Color(0x554AC2));
        meetingtile = w;
        meetingtile.setSize(7, 7);
        frame = m;
        //tempodifermo[0]=1;
        //tempodifermo[1]=9;
    }
    @Override
    public long getAge(){
        return Main.timepassed-birthday;

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
            }
            //System.out.println(CurrentTime);
            //System.out.println(f);
            return true;
        }
        return false;
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
