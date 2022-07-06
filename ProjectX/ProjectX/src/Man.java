import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;

public class Man implements Person {
    int px;
    int py;
    Thread runningon;
    peopleIcon meetingtile;
    boolean[] parents = {true, true};
    String gender = "male";
    boolean single = true;
    //boolean fast;
    Main frame;
    Woman Partner = null;
    boolean running = true;
    int[] tempodifermo = new int[2];
    int counter = 0;
    boolean val = true;
    boolean cooldown = true;
    int moved = 0;
    int birthday;
    boolean stop = false;
    ArrayList<Boolean> genes;
    boolean dead=false;
    public void paint(Graphics g) {
        Graphics2D gD2 = (Graphics2D) g;
        gD2.fillRect(px,py, 2,2);



    }



    Man(int x, int y, Main m) {
        px=x;
        py=y;

        Color c = new Color(0xFFFFFF);
        peopleIcon n = new peopleIcon(x, y, c);
        meetingtile = n;
        meetingtile.setSize(7, 7);
        frame = m;
        //tempodifermo[0]=1;
        //tempodifermo[1]=9;
    }

    public boolean type() {
        return genes.get(0);

    }

    @Override
    public String getgender() {
        //System.out.println("triggered");
        return gender;
    }

    @Override
    public int getage() {
        return (Main.timepassed - birthday)/4 ;
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
            cooldown = false;
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
            //System.out.println(f+" "+CurrentTime);
            if (f < CurrentTime) {
                //System.out.println("yes");
                cooldown = false;
                running = true;
                val = true;
                //frame.Court(false, this);
                if (!(Partner == null)) {
                    frame.makebabies(this, Partner);
                }
                return true;
            }
            else return false;
            //System.out.println(CurrentTime);
            //System.out.println(f);
            //return true;
        }
        return false;
    }

    @Override
    public Main getFrame() {
        return frame;
    }


    @Override
    public void fenotipo() {
        if (genes.get(0)) meetingtile.setBackground(new Color(0x7DC0A0));
        else meetingtile.setBackground(new Color(0xBFFFF2));

    }

    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }



    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(Main.speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //frame.slowdown();
            //System.out.println("4");
            if (running) {
                if (!Main.allowed) {
                    ;
                    //    try {
                    //        Main.timelord.join();
                    //    } catch (InterruptedException e) {
                    //        e.printStackTrace();
                    //    }
                }
                else {
                    if(this.getage() > frame.lifeexpectancy){

                        frame.GrimReaper(this);
                        //System.out.println("he dead");

                        return;
                    }
                    int[][] on = frame.move(this);
                    if (cooldown) {
                        if (!frame.Forbidden.contains(frame.getcoor(on[0][0], on[0][1]))) {
                            frame.localmeet(on);

                        }
                        //System.out.println(this);
                    } else {
                        moved++;
                        if (moved == 4) {
                            moved = 0;
                            cooldown = true;
                            //System.out.println("triggered by man");
                        }
                    }
                }
            }
            if (dead) break;
        }
    }

}