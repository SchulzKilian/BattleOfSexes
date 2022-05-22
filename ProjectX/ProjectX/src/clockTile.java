import java.awt.*;

public class clockTile implements Person{

    peopleIcon meetingtile;
    Main frame;
    clockTile(int x, int y, Main m){
        Color c=new Color(0xFF000000, true);
        peopleIcon n=new peopleIcon(x,y, c);
        meetingtile=n;
        frame=m;
    }
    @Override
    public int[] moverand(int x, int y) {
        return new int[0];
    }

    @Override
    public boolean type() {
        return false;
    }

    @Override
    public String getgender() {
        return null;
    }

    @Override
    public Thread getRunningon() {
        return null;
    }

    @Override
    public void Pause(int CurrentTime, int pausingtime) {

    }

    @Override
    public boolean Startagain(int CurrentTime) {
        return false;
    }

    @Override
    public Main getFrame() {
        return null;
    }

    @Override
    public void fenotipo() {

    }

    @Override
    public int getage() {
        return 0;
    }

    @Override
    public void run() {
        while (true) {
            if (!Main.allowed) {
                try {
                    Main.timelord.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //frame.slowdown();
            frame.timemove(this);


        }

    }
}
