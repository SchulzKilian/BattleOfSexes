import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.awt.Color.*;

public class Main implements MouseListener {

    public static long timepassed = 0;
    public static int cicles= 2;
    public static boolean dominantgene=true;
    public static boolean rand=false;
    int width= 30;
    int height = 30;
    int amountmen = 10;
    int amountwomen = 10;
    ArrayList<Tile> Tlist= new ArrayList<Tile>();

    Man start1 = new Man(0,0,this);
    Woman start2 = new Woman(7,7,this);
    Man start3 = new Man(0,1,this);
    Woman start4 = new Woman(7,7,this);
    Man start5 = new Man(0,2,this);
    Woman start6 = new Woman(7,7,this);
    Man start7 = new Man(0,3,this);
    Woman start8 =new Woman(7,7,this);
    Man start9 =new Man(0,4,this);
    Woman start10 = new Woman(7,7,this);
    Man start11 = new Man(0,5,this);
    Woman start12 = new Woman(7,7,this);
    Man start15 = new Man(0,6,this);
    Woman start16 = new Woman(7,7,this);
    Man start17 = new Man(0,7,this);
    Woman start18 = new Woman(7,7,this);
    Man start19=new Man(0,8,this);
    Woman start20 = new Woman(7,7,this);
    Man start21 = new Man(5, 17,this);
    Woman start22 = new Woman(5, 18,this);
    Man start23 = new Man(5, 12,this);
    Woman start24 = new Woman(5, 13,this);
    Man start25 = new Man(5, 14,this);
    Woman start26 = new Woman(5, 15,this);
    Man start27 = new Man(5, 16,this);
    Woman start28 = new Woman(5, 17,this);
    Man start29= new Man(5, 18,this);
    Woman start30 = new Woman(5, 12,this);
    Man start31 = new Man(5, 13,this);
    Woman start32 = new Woman(5, 14,this);
    Man start33 = new Man(5, 15,this);
    Woman start34 = new Woman(5, 16,this);
    Man start35 = new Man(5, 17,this);
    Woman start36 = new Woman(5, 18,this);

    MyFrame frame = new MyFrame();
    JPanel map = new JPanel();
    JLabel city = new JLabel();
    //ImageIcon mapCity = new ImageIcon("/Users/zoe/IdeaProjects/JavaSwingTest/src/logoJavaSwingTest.jpg");
    GridLayout grid = new GridLayout(30, 30);


    public Main() {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(map);
        //city.setIcon(mapCity);
        city.setBounds(10,10,880,880);
        frame.add(city);
        map.setBounds(10,10,880,880);
        map.setOpaque(false);
        map.setLayout(grid);
        for (int i=0; i<=width; i++){
            for (int z=0; z<=height; z++){
                Tile p = new Tile(i, z, BLACK);
                map.add(p);
                Tlist.add(p);

            }
        }


    }





    public int[] move(Man t){
        if (timepassed%cicles==0){
            System.out.println(timepassed);

            t.meetingtile.paused=false;
        }
        int x= t.meetingtile.coor_x;
        int y= t.meetingtile.coor_y;
        int[][] pos={{x+1,y+0},{x+(-1),y+0},{x+0,y+1},{x+0,y+(-1)},{x+1,y+1},{x+1,y+(-1)},{x+(-1),y+1},{x+(-1),y+(-1)}};
        int ind= (int) (Math.random()* pos.length);
        if(t.meetingtile.paused!=true){
            if (t.meetingtile.tileon!=null){
                t.meetingtile.tileon.popoccupants(t);}
            for (Tile tile: Tlist) {
                if (tile.coor_x == pos[ind][0] && tile.coor_y == pos[ind][1]){
                    //System.out.println("udfhdffdhdghdgifh");
                    t.meetingtile.tileon=tile;
                    tile.add(t.meetingtile);
                    //tile.setwhite();
                    tile.addoccupants(t);
                    int xt= tile.coor_x;
                    int yt =tile.coor_y;
                    t.meetingtile.coor_x=xt;
                    t.meetingtile.coor_y=yt;
                    frame.repaint(); frame.revalidate();
                }
            }}
        return pos[ind];
    }
    public int[] move(Woman t){
        if (timepassed%cicles==0){
            t.meetingtile.paused=false;
        }
        int x= t.meetingtile.coor_x;
        int y= t.meetingtile.coor_y;
        int[][] pos={{x+1,y+0},{x+(-1),y+0},{x+0,y+1},{x+0,y+(-1)},{x+1,y+1},{x+1,y+(-1)},{x+(-1),y+1},{x+(-1),y+(-1)}};
        int ind= (int) (Math.random()* pos.length);
        if(t.meetingtile.paused!=true){
            if (t.meetingtile.tileon!=null){
                t.meetingtile.tileon.popoccupants(t);}
            for (Tile tile: Tlist) {
                if (tile.coor_x == pos[ind][0] && tile.coor_y == pos[ind][1]){

                    //System.out.println("udfhdffdhdghdgifh");
                    t.meetingtile.tileon=tile;
                    tile.add(t.meetingtile);
                    tile.addoccupants(t);
                    int xt= tile.coor_x;
                    int yt =tile.coor_y;
                    t.meetingtile.coor_x=xt;
                    t.meetingtile.coor_y=yt;
                    frame.repaint(); frame.revalidate();
                }
            }}
        return pos[ind];
    }


    public void meet(Tile t){

        Man first;
        Woman second;
        if(t.occupants.size()>=2){
            if(t.occupants.get(1).getgender().equals("male") && t.occupants.get(0).getgender().equals("female")){
                first= (Man) t.occupants.get(1);
                second =(Woman) t.occupants.get(0);
            }
            else if(t.occupants.get(0).getgender().equals("male") && t.occupants.get(1).getgender().equals("female")){
                first= (Man) t.occupants.get(0);
                second =(Woman) t.occupants.get(1);
            }
            else return;

            if (!first.single || !second.single){
                return;
            }
            if ((55 > first.age && first.age < 12) || (55 > second.age && second.age<12)){
                return;
            }
            if(first.type()== second.type()){
                gettogether(first, second);
            }
            //if (first.gender.equals("male") && first.type() || second.gender.equals("male") && second.type()){
            //  return;
            //}
            gettogether(first, second);}
    }
    public static void gettogether(Man m, Woman w){
        if(m.single==true&& w.single==true){
            m.meetingtile.paused=true;
            w.meetingtile.paused=true;
        }
    }
    public boolean inheritance(Man m, Woman w){
        boolean[] disp={m.fast,w.fast};
        int x= (int) (Math.random()*2);
        return disp[x];



    }

    public static void main(String[] args) throws InterruptedException {

        Main timer = new Main();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                timepassed++;
                timer.move(timer.start1);
                timer.move(timer.start2);

                for (Tile tile: timer.Tlist) {
                    timer.meet(tile);
                }
                timer.move(timer.start3);timer.move(timer.start4);timer.move(timer.start5);timer.move(timer.start6); timer.move(timer.start7);timer.move(timer.start8);timer.move(timer.start9);timer.move(timer.start10);timer.move(timer.start11);timer.move(timer.start12);timer.move(timer.start15);timer.move(timer.start16);timer.move(timer.start17);timer.move(timer.start18);timer.move(timer.start19);
                timer.move(timer.start20);timer.move(timer.start21);timer.move(timer.start22);timer.move(timer.start23);timer.move(timer.start24);timer.move(timer.start25);timer.move(timer.start26);timer.move(timer.start27);timer.move(timer.start28);timer.move(timer.start29);timer.move(timer.start30);timer.move(timer.start31);timer.move(timer.start32);timer.move(timer.start33);timer.move(timer.start34);timer.move(timer.start35);timer.move(timer.start36);
                //System.out.println("dgfdgfdgf");
                //timer.move(timer.stop);
                timer.frame.revalidate(); timer.frame.repaint();


            }
        };
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(r, 0, 100, TimeUnit.MILLISECONDS);
        int[] f= new int[2];

    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}