import java.util.ConcurrentModificationException;

public class ItsTime extends Thread {
    Main m;

    ItsTime(Main m) {
        Main.timelord = this;
        Main.allowed = false;
        this.m = m;

    }

    public void run() {
        //this is the method for everything you want to check without moving threads interfering
        System.out.println(Thread.activeCount());

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
            m.allowed = true;
            return;
        }
    m.allowed = true;
        return;
    }

}


