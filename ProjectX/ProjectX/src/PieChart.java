import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class PieChart extends Canvas implements Runnable{
    public static final long serialVersionUID= 1L;
    public Thread thread;
    public JFrame frame;
    public static  String title="PieChart";
    public static final int Width= 400;
    public static final int Height= 400;
    public static  boolean running= false;
    public PieChart(){
        this.frame = new JFrame();
        Dimension size = new Dimension(Width,Height);
        this.setPreferredSize(size);
    }
    public static void main(String[] args) {
        PieChart display = new PieChart();
        display.frame.setTitle(title);
        display.frame.add(display);
        display.frame.pack();
        display.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.frame.setLocationRelativeTo(null);
        display.frame.setResizable(false);
        display.frame.setVisible(true);
        display.start();
    }
    public synchronized void start() {
        running = true;
        this.thread = new Thread(this, "Display");
        this.thread.start();
    }
    public synchronized void stop(){
        running =false;
        try {
            this.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        long lastTime =System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns=1000000000.0/60;
        double delta=0;
        int frames=0;
        while(running){
            long now = System.nanoTime();
            delta+= (now-lastTime)/ns;
            lastTime=now;
            while (delta>=1){
                update();
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis()-timer>1000){
                timer =+1000;
                this.frame.setTitle((title+" | "+frames+" fps"));
                frames=0;
            }
        }
        stop();

    }
    private void render(){
        BufferStrategy bs= this.getBufferStrategy();
        if (bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g= bs.getDrawGraphics();
        g.setColor(Color.black);
        g.fillRect(0,0,Width*2,Height*2);
        g.setColor(Color.white);

        g.fillRect(78,200,90,400);

        g.dispose();
        ((BufferStrategy) bs).show();

    }
    private void update(){}
}