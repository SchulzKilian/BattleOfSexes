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

    public static int timepassed;
    public static int cicles= 5000;
    public static int population=2;
    public static int movements;

    public static boolean dominantgene=true;
    public static boolean rand=false;
    int width= 30;
    int height = 30;
    int amountmen = 10;
    int amountwomen = 10;
    ArrayList<Tile> Tlist= new ArrayList<Tile>();
    ArrayList<Person> Alive=new ArrayList<Person>();
    ArrayList<Person> Moving=new ArrayList<Person>();



    MyFrame frame = new MyFrame();
    JPanel map = new JPanel();
    JLabel city = new JLabel();
    ImageIcon mapCity = new ImageIcon("ProjectX/ProjectX/src/cityImage.jpg");
    PieChart pieChart = new PieChart(30,140,90,100);
    GridLayout grid = new GridLayout(height, width);


    public Main() {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(map);
        frame.add(pieChart);
        pieChart.setBounds(920,10,500,300);
        pieChart.setBackground(new Color(0x3C593A));
        city.setIcon(mapCity);
        city.setBounds(10,10,880,880);
        frame.add(city);
        map.setBounds(10,10,880,880);
        map.setOpaque(false);
        map.setLayout(grid);
        //GridLayout g=new GridLayout(10,10);
        for (int i=1; i<=width; i++){
            for (int z=1; z<=height; z++){
                Tile p = new Tile(i, z, BLACK);
                map.add(p);
                //p.setLayout(g);
                Tlist.add(p);

            }
        }
        Man Ancestor =new Man(0,0,this);
        Woman Ancestor2= new Woman(7,7,this);
        for (int m = 0; m < population; m++) {
            Person r=God(Ancestor,Ancestor2);
            Thread provvisorio=r.getRunningon();
            provvisorio.start();
        }


        }











    public int[] move(Man t){
        movements++;
        if(movements%10==0){
            timepassed++;
            movements=0;
        }

        int x= t.meetingtile.coor_x;
        int y= t.meetingtile.coor_y;
        int[][] pos={{x+1,y+0},{x+(-1),y+0},{x+0,y+1},{x+0,y+(-1)},{x+1,y+1},{x+1,y+(-1)},{x+(-1),y+1},{x+(-1),y+(-1)}};
        int ind= (int) (Math.random()* pos.length);

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
            }
        return pos[ind];
    }
    public int[] move(Woman t){
        movements++;
        if(movements%10==0){
            timepassed++;
            movements=0;
        }

        int x= t.meetingtile.coor_x;
        int y= t.meetingtile.coor_y;
        int[][] pos={{x+1,y+0},{x+(-1),y+0},{x+0,y+1},{x+0,y+(-1)},{x+1,y+1},{x+1,y+(-1)},{x+(-1),y+1},{x+(-1),y+(-1)}};
        int ind= (int) (Math.random()* pos.length);

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
            }
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
    public void gettogether(Man m, Woman w){
        if(m.single && w.single){
            m.Pause(timepassed,cicles);
            w.Pause(timepassed,cicles);
            //System.out.println("io");
            UpdateMoving(false,m);
            UpdateMoving(false,w);
        }
    }
    public boolean inheritance(Man m, Woman w){
        boolean[] disp={m.fast,w.fast};
        int x= (int) (Math.random()*2);
        return disp[x];

    }
    public Person God(Man parent1, Woman parent2){
        String[] gender={"male","female"};
        int y=(int)(Math.random()*2);
        if(gender[y].equals("male")){
            Man m=new Man(0,0,this);
            m.fast=inheritance(parent1,parent2);
            m.age=20;
            Thread thread=new Thread(m);
            m.runningon=thread;
            Alive.add(m);
            return m;
        }
        else {
            Woman w=new Woman(29,29,this);
            w.fast=inheritance(parent1,parent2);
            w.age=20;
            Thread thread=new Thread(w);
            w.runningon=thread;
            Alive.add(w);
            return w;

        }

    }
    public void GrimReaper(Man p){
        Alive.remove(p);
        p.runningon.stop();
        this.remove(p);
    }
    public void GrimReaper(Woman p){
        Alive.remove(p);
        p.runningon.stop();
        this.remove(p);
    }
    public void remove(Man p){
        p.meetingtile.color= lightGray;
        p.meetingtile.tileon.remove(p.meetingtile);

    }
    public void remove(Woman p){
        p.meetingtile.color= lightGray;
        p.meetingtile.tileon.remove(p.meetingtile);

    }
    public  void UpdateMoving(Boolean v,Person p){
        if(v){
            Moving.add(p);

        }
        else {
            Moving.remove(p);

        }
    }


    public static void main(String[] args) throws InterruptedException {
        Main timer = new Main();
        int[] f= new int[2];
        while(true){
            for (Person p:timer.Alive) {
                p.Startagain(timer.timepassed);
                //System.out.println(timepassed);

            }

    }}


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