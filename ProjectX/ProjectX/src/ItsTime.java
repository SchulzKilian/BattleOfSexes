import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ItsTime extends Thread {
    Main m;
    ArrayList<Man> doomlistm = new ArrayList<>();
    ArrayList<Woman> doomlistw = new ArrayList<>();
    boolean check;

    ItsTime(Main m, boolean check) {
        Main.timelord = this;
        Main.allowed = false;
        this.m = m;
        this.check = check;

    }

    ItsTime(boolean check) {
        Main.timelord = this;
        Main.allowed = false;
        this.check = check;
    }

    public void run() {
        //this is the method for everything you want to check without moving threads interfering
        //System.out.println(Thread.activeCount());
        if (this.check) {
            //this is the method for everything you want to check without moving threads interfering
            //System.out.println(Thread.activeCount());

            try {
                m.checker();
                for (Person i : Main.Alive) {
                    //System.out.println(i);
                    if (i.getage() > Main.lifeexpectancy && i.getgender().equals("male")) {
                        doomlistm.add((Man) i);
                        //m.GrimReaper((Man) i);
                        //System.out.println("dead");
                    }
                    if (i.getage() > Main.lifeexpectancy && i.getgender().equals("female")) {
                        doomlistw.add((Woman) i);
                        //m.GrimReaper((Woman) i);
                        //System.out.println("dead");
                    }

                }
                for (Man p : doomlistm) {
                    m.GrimReaper(p);

                }
                for (Woman p : doomlistw) {
                    m.GrimReaper(p);
                    System.out.println("d");

                }
                doomlistm.removeAll(doomlistm);
                doomlistw.removeAll(doomlistw);}
             catch (ConcurrentModificationException e) {
                System.out.println("ConcurrentModification");
                m.allowed = true;
                return;
            }}
        else{
            while (!Main.allowed){
                System.out.print("");
            }
            Main.allowed = true;
        }
    }


    }
}

