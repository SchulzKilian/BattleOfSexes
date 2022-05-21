import java.util.ConcurrentModificationException;

public class ItsTime extends Thread {
    Main m;
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
        if (this.check) {
            //this is the method for everything you want to check without moving threads interfering
            //System.out.println(Thread.activeCount());

            try {
                m.checker();
                for (Person i : Main.Alive) {
                    if (i.getage() > Main.lifeexpectancy && i.getgender().equals("male")) {
                        m.GrimReaper((Man) i);
                        //System.out.println("dead");
                    }
                    if (i.getage() > Main.lifeexpectancy && i.getgender().equals("female")) {
                        m.GrimReaper((Woman) i);
                        //System.out.println("dead");
                    }

                }


            } catch (ConcurrentModificationException e) {
                System.out.println("ConcurrentModification");
                Main.allowed = true;
                return;
            }
            Main.allowed = true;

        }
        else{
            while (!Main.allowed){
                System.out.println("it works");
            }
            Main.allowed = true;
        }
    }

}


