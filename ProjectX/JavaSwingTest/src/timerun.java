import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.awt.Color.*;

public class timerun implements MouseListener {

    //runnable r;

    public static int timepassed = 0;
    public static int cicles= 200;
    Tile p1 = new Tile(0, 0, BLACK);
    Tile p2 = new Tile(0, 1, BLACK);
    Tile p3 = new Tile(0, 2, BLACK);
    Tile p4 = new Tile(0, 3, BLACK);
    Tile p5 = new Tile(0, 4, BLACK);
    Tile p6 = new Tile(0, 5, BLACK);
    Tile p7 = new Tile(0, 6, BLACK);
    Tile p8 = new Tile(0, 7, BLACK);
    Tile p9 = new Tile(0, 8, BLACK);
    Tile p10 = new Tile(0, 9, BLACK);
    Tile p11 = new Tile(0, 10, BLACK);
    Tile p12 = new Tile(0, 11, BLACK);
    Tile p13 = new Tile(0, 12, BLACK);
    Tile p14 = new Tile(0, 13, BLACK);
    Tile p15 = new Tile(0, 14, BLACK);
    Tile p16 = new Tile(0, 15, BLACK);
    Tile p17 = new Tile(0, 16, BLACK);
    Tile p18 = new Tile(0, 17, BLACK);
    Tile p19 = new Tile(0, 18, BLACK);
    Tile p20 = new Tile(0, 19, BLACK);
    Tile p21 = new Tile(0, 20, BLACK);
    Tile p22 = new Tile(0, 21, BLACK);
    Tile p23 = new Tile(0, 22, BLACK);
    Tile p24 = new Tile(1, 0, BLACK);
    Tile p25 = new Tile(1, 1, BLACK);
    Tile p26 = new Tile(1, 2, BLACK);
    Tile p27 = new Tile(1, 3, BLACK);
    Tile p28 = new Tile(1, 4, BLACK);
    Tile p29 = new Tile(1, 5, BLACK);
    Tile p30 = new Tile(1, 6, BLACK);
    Tile p31 = new Tile(1, 7, BLACK);
    Tile p32 = new Tile(1, 8, BLACK);
    Tile p33 = new Tile(1, 9, BLACK);
    Tile p34 = new Tile(1, 10, BLACK);
    Tile p35 = new Tile(1, 11, BLACK);
    Tile p36 = new Tile(1, 12, BLACK);
    Tile p37 = new Tile(1, 13, BLACK);
    Tile p38 = new Tile(1, 14, BLACK);
    Tile p39 = new Tile(1, 15, BLACK);
    Tile p40 = new Tile(1, 16, BLACK);
    Tile p41 = new Tile(1, 17, BLACK);
    Tile p42 = new Tile(1, 18, BLACK);
    Tile p43 = new Tile(1, 19, BLACK);
    Tile p44 = new Tile(1, 20, BLACK);
    Tile p45 = new Tile(1, 21, BLACK);
    Tile p46 = new Tile(1, 22, BLACK);
    Tile p47 = new Tile(2, 0, BLACK);
    Tile p48 = new Tile(2, 1, BLACK);
    Tile p49 = new Tile(2, 2, BLACK);
    Tile p50 = new Tile(2, 3, BLACK);
    Tile p51 = new Tile(2, 4, BLACK);
    Tile p52 = new Tile(2, 5, BLACK);
    Tile p53 = new Tile(2, 6, BLACK);
    Tile p54 = new Tile(2, 7, BLACK);
    Tile p55 = new Tile(2, 8, BLACK);
    Tile p56 = new Tile(2, 9, BLACK);
    Tile p57 = new Tile(2, 10, BLACK);
    Tile p58 = new Tile(2, 11, BLACK);
    Tile p59 = new Tile(2, 12, BLACK);
    Tile p60 = new Tile(2, 13, BLACK);
    Tile p61 = new Tile(2, 14, BLACK);
    Tile p62 = new Tile(2, 15, BLACK);
    Tile p63 = new Tile(2, 16, BLACK);
    Tile p64 = new Tile(2, 17, BLACK);
    Tile p65 = new Tile(2, 18, BLACK);
    Tile p66 = new Tile(2, 19, BLACK);
    Tile p67 = new Tile(2, 20, BLACK);
    Tile p68 = new Tile(2, 21, BLACK);
    Tile p69 = new Tile(2, 22, BLACK);
    Tile p70 = new Tile(3, 0, BLACK);
    Tile p71 = new Tile(3, 1, BLACK);
    Tile p72 = new Tile(3, 2, BLACK);
    Tile p73 = new Tile(3, 3, BLACK);
    Tile p74 = new Tile(3, 4, BLACK);
    Tile p75 = new Tile(3, 5, BLACK);
    Tile p76 = new Tile(3, 6, BLACK);
    Tile p77 = new Tile(3, 7, BLACK);
    Tile p78 = new Tile(3, 8, BLACK);
    Tile p79 = new Tile(3, 9, BLACK);
    Tile p80 = new Tile(3, 10, BLACK);
    Tile p81 = new Tile(3, 11, BLACK);
    Tile p82 = new Tile(3, 12, BLACK);
    Tile p83 = new Tile(3, 13, BLACK);
    Tile p84 = new Tile(3, 14, BLACK);
    Tile p85 = new Tile(3, 15, BLACK);
    Tile p86 = new Tile(3, 16, BLACK);
    Tile p87 = new Tile(3, 17, BLACK);
    Tile p88 = new Tile(3, 18, BLACK);
    Tile p89 = new Tile(3, 19, BLACK);
    Tile p90 = new Tile(3, 20, BLACK);
    Tile p91 = new Tile(3, 21, BLACK);
    Tile p92 = new Tile(3, 22, BLACK);
    Tile p93 = new Tile(4, 0, BLACK);
    Tile p94 = new Tile(4, 1, BLACK);
    Tile p95 = new Tile(4, 2, BLACK);
    Tile p96 = new Tile(4, 3, BLACK);
    Tile p97 = new Tile(4, 4, BLACK);
    Tile p98 = new Tile(4, 5, BLACK);
    Tile p99 = new Tile(4, 6, BLACK);
    Tile p100 = new Tile(4, 7, BLACK);
    Tile p101 = new Tile(4, 8, BLACK);
    Tile p102 = new Tile(4, 9, BLACK);
    Tile p103 = new Tile(4, 10, BLACK);
    Tile p104 = new Tile(4, 11, BLACK);
    Tile p105 = new Tile(4, 12, BLACK);
    Tile p106 = new Tile(4, 13, BLACK);
    Tile p107 = new Tile(4, 14, BLACK);
    Tile p108 = new Tile(4, 15, BLACK);
    Tile p109 = new Tile(4, 16, BLACK);
    Tile p110 = new Tile(4, 17, BLACK);
    Tile p111 = new Tile(4, 18, BLACK);
    Tile p112 = new Tile(4, 19, BLACK);
    Tile p113 = new Tile(4, 20, BLACK);
    Tile p114 = new Tile(4, 21, BLACK);
    Tile p115 = new Tile(4, 22, BLACK);
    Tile p116 = new Tile(5, 0, BLACK);
    Tile p117 = new Tile(5, 1, BLACK);
    Tile p118 = new Tile(5, 2, BLACK);
    Tile p119 = new Tile(5, 3, BLACK);
    Tile p120 = new Tile(5, 4, BLACK);
    Tile p121 = new Tile(5, 5, BLACK);
    Tile p122 = new Tile(5, 6, BLACK);
    Tile p123 = new Tile(5, 7, BLACK);
    Tile p124 = new Tile(5, 8, BLACK);
    Tile p125 = new Tile(5, 9, BLACK);
    Tile p126 = new Tile(5, 10, BLACK);
    Tile p127 = new Tile(5, 11, BLACK);
    Tile p128 = new Tile(5, 12, BLACK);
    Tile p129 = new Tile(5, 13, BLACK);
    Tile p130 = new Tile(5, 14, BLACK);
    Tile p131 = new Tile(5, 15, BLACK);
    Tile p132 = new Tile(5, 16, BLACK);
    Tile p133 = new Tile(5, 17, BLACK);
    Tile p134 = new Tile(5, 18, BLACK);
    Tile p135 = new Tile(5, 19, BLACK);
    Tile p136 = new Tile(5, 20, BLACK);
    Tile p137 = new Tile(5, 21, BLACK);
    Tile p138 = new Tile(5, 22, BLACK);
    Tile p139 = new Tile(6, 0, BLACK);
    Tile p140 = new Tile(6, 1, BLACK);
    Tile p141 = new Tile(6, 2, BLACK);
    Tile p142 = new Tile(6, 3, BLACK);
    Tile p143 = new Tile(6, 4, BLACK);
    Tile p144 = new Tile(6, 5, BLACK);
    Tile p145 = new Tile(6, 6, BLACK);
    Tile p146 = new Tile(6, 7, BLACK);
    Tile p147 = new Tile(6, 8, BLACK);
    Tile p148 = new Tile(6, 9, BLACK);
    Tile p149 = new Tile(6, 10, BLACK);
    Tile p150 = new Tile(6, 11, BLACK);
    Tile p151 = new Tile(6, 12, BLACK);
    Tile p152 = new Tile(6, 13, BLACK);
    Tile p153 = new Tile(6, 14, BLACK);
    Tile p154 = new Tile(6, 15, BLACK);
    Tile p155 = new Tile(6, 16, GREEN);
    Tile p156 = new Tile(6, 17, BLACK);
    Tile p157 = new Tile(6, 18, BLACK);
    Tile p158 = new Tile(6, 19, BLACK);
    Tile p159 = new Tile(6, 20, BLACK);
    Tile p160 = new Tile(6, 21, BLACK);
    Tile p161 = new Tile(6, 22, BLACK);
    Tile p162 = new Tile(7, 0, BLACK);
    Tile p163 = new Tile(7, 1, BLACK);
    Tile p164 = new Tile(7, 2, BLACK);
    Tile p165 = new Tile(7, 3, BLACK);
    Tile p166 = new Tile(7, 4, BLACK);
    Tile p167 = new Tile(7, 5, BLACK);
    Tile p168 = new Tile(7, 6, BLACK);
    Tile p169 = new Tile(7, 7, BLACK);
    Tile p170 = new Tile(7, 8, BLACK);
    Tile p171 = new Tile(7, 9, BLACK);
    Tile p172 = new Tile(7, 10, BLACK);
    Tile p173 = new Tile(7, 11, BLACK);
    Tile p174 = new Tile(7, 12, BLACK);
    Tile p175 = new Tile(7, 13, BLACK);
    Tile p176 = new Tile(7, 14, BLACK);
    Tile p177 = new Tile(7, 15, BLACK);
    Tile p178 = new Tile(7, 16, BLACK);
    Tile p179 = new Tile(7, 17, BLACK);
    Tile p180 = new Tile(7, 18, BLACK);
    Tile p181 = new Tile(7, 19, GREEN);
    Tile p182 = new Tile(7, 20, BLACK);
    Tile p183 = new Tile(7, 21, BLACK);
    Tile p184 = new Tile(7, 22, BLACK);
    Tile start = new Tile(5, 12, WHITE);
    Man start1 = new Man(0,0);
    Woman start2 = new Woman(7,7);
    Man start3 = new Man(0,1);
    Woman start4 = new Woman(7,7);
    Man start5 = new Man(0,2);
    Woman start6 = new Woman(7,7);
    /*Man start7 = new Man(0,3);
    Woman start8 =new Woman(7,7);
    Man start9 =new Man(0,4);
    Woman start10 = new Woman(7,7);
    Man start11 = new Man(0,5);
    Woman start12 = new Woman(7,7);
    Man start15 = new Man(0,6);
    Woman start16 = new Woman(7,7);
    Man start17 = new Man(0,7);
    Woman start18 = new Woman(7,7);
    Man start19=new Man(0,8);
    Woman start20 = new Woman(7,7);*/
    Tile start21 = new Tile(5, 17, GRAY);
    Tile start22 = new Tile(5, 18, BLUE);
    Tile start23 = new Tile(5, 12, WHITE);
    Tile start24 = new Tile(5, 13, RED);
    Tile start25 = new Tile(5, 14, CYAN);
    Tile start26 = new Tile(5, 15, YELLOW);
    Tile start27 = new Tile(5, 16, GREEN);
    Tile start28 = new Tile(5, 17, GRAY);
    Tile start29= new Tile(5, 18, BLUE);
    Tile start30 = new Tile(5, 12, WHITE);
    Tile start31 = new Tile(5, 13, RED);
    Tile start32 = new Tile(5, 14, CYAN);
    Tile start33 = new Tile(5, 15, YELLOW);
    Tile start34 = new Tile(5, 16, GREEN);
    Tile start35 = new Tile(5, 17, GRAY);
    Tile start36 = new Tile(5, 18, BLUE);
    Tile stop = new Tile(0, 0, RED);
    MyFrame frame = new MyFrame();
    JPanel map = new JPanel();
    JLabel city = new JLabel();
    ImageIcon mapCity = new ImageIcon("/Users/zoe/IdeaProjects/JavaSwingTest/src/logoJavaSwingTest.jpg");
    GridLayout grid = new GridLayout(8, 23);


    public timerun() {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(map);
        city.setIcon(mapCity);
        city.setBounds(10,10,880,880);
        frame.add(city);
        map.setBounds(10,10,880,880);
        map.setOpaque(false);
        map.setLayout(grid);

        /*frame.setSize(1000, 1000);
        frame.setLayout(grid);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        map.add(p1);
        map.add(p2);
        map.add(p3);
        map.add(p4);
        map.add(p5);
        map.add(p6);
        map.add(p7);
        map.add(p8);
        map.add(p9);
        map.add(p10);
        map.add(p11);
        map.add(p12);
        map.add(p13);
        map.add(p14);
        map.add(p15);
        map.add(p16);
        map.add(p17);
        map.add(p18);
        map.add(p19);
        map.add(p20);
        map.add(p21);
        map.add(p22);
        map.add(p23);
        map.add(p24);
        map.add(p25);
        map.add(p26);
        map.add(p27);
        map.add(p28);
        map.add(p29);
        map.add(p30);
        map.add(p31);
        map.add(p32);
        map.add(p33);
        map.add(p34);
        map.add(p35);
        map.add(p36);
        map.add(p37);
        map.add(p38);
        map.add(p39);
        map.add(p40);
        map.add(p41);
        map.add(p42);
        map.add(p43);
        map.add(p44);
        map.add(p45);
        map.add(p46);
        map.add(p47);
        map.add(p48);
        map.add(p49);
        map.add(p50);
        map.add(p51);
        map.add(p52);
        map.add(p53);
        map.add(p54);
        map.add(p55);
        map.add(p56);
        map.add(p57);
        map.add(p58);
        map.add(p59);
        map.add(p60);
        map.add(p61);
        map.add(p62);
        map.add(p63);
        map.add(p64);
        map.add(p65);
        map.add(p66);
        map.add(p67);
        map.add(p68);
        map.add(p69);
        map.add(p70);
        map.add(p71);
        map.add(p72);
        map.add(p73);
        map.add(p74);
        map.add(p75);
        map.add(p76);
        map.add(p77);
        map.add(p78);
        map.add(p79);
        map.add(p80);
        map.add(p81);
        map.add(p82);
        map.add(p83);
        map.add(p84);
        map.add(p85);
        map.add(p86);
        map.add(p87);
        map.add(p88);
        map.add(p89);
        map.add(p90);
        map.add(p91);
        map.add(p92);
        map.add(p93);
        map.add(p94);
        map.add(p95);
        map.add(p96);
        map.add(p97);
        map.add(p98);
        map.add(p99);
        map.add(p100);
        map.add(p101);
        map.add(p102);
        map.add(p103);
        map.add(p104);
        map.add(p105);
        map.add(p106);
        map.add(p107);
        map.add(p108);
        map.add(p109);
        map.add(p110);
        map.add(p111);
        map.add(p112);
        map.add(p113);
        map.add(p114);
        map.add(p115);
        map.add(p116);
        map.add(p117);
        map.add(p118);
        map.add(p119);
        map.add(p120);
        map.add(p121);
        map.add(p122);
        map.add(p123);
        map.add(p124);
        map.add(p125);
        map.add(p126);
        map.add(p127);
        map.add(p128);
        map.add(p129);
        map.add(p130);
        map.add(p131);
        map.add(p132);
        map.add(p133);
        map.add(p134);
        map.add(p135);
        map.add(p136);
        map.add(p137);
        map.add(p138);
        map.add(p139);
        map.add(p140);
        map.add(p141);
        map.add(p142);
        map.add(p143);
        map.add(p144);
        map.add(p145);
        map.add(p146);
        map.add(p147);
        map.add(p148);
        map.add(p149);
        map.add(p150);
        map.add(p151);
        map.add(p152);
        map.add(p153);
        map.add(p154);
        map.add(p155);
        map.add(p156);
        map.add(p157);
        map.add(p158);
        map.add(p159);
        map.add(p160);
        map.add(p161);
        map.add(p162);
        map.add(p163);
        map.add(p164);
        map.add(p165);
        map.add(p166);
        map.add(p167);
        map.add(p168);
        map.add(p169);
        map.add(p170);
        map.add(p171);
        map.add(p172);
        map.add(p173);
        map.add(p174);
        map.add(p175);
        map.add(p176);
        map.add(p177);
        map.add(p178);
        map.add(p179);
        map.add(p180);
        map.add(p181);
        map.add(p182);
        map.add(p183);
        map.add(p184);
        p80.add(start);
       // p184.add(stop);
        start.addMouseListener(this);
       // stop.addMouseListener(this);
    }

    Tile[] Tlist = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78, p79, p80, p81, p82, p83, p84, p85, p86, p87, p88, p89, p90, p91, p92, p93, p94, p95, p96, p97, p98, p99, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111, p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127, p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143, p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159, p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175, p176, p177, p178, p179, p180, p181, p182, p183, p184};





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
                map.repaint(); map.revalidate();
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
                map.repaint(); map.revalidate();
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
       // }
        gettogether(first, second);}
    }
    public static void gettogether(Man m, Woman w){
        if(m.single==true&& w.single==true){
            m.meetingtile.paused=true;
            w.meetingtile.paused=true;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        timerun timer = new timerun();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                timepassed++;
                timer.move(timer.start1);
                timer.move(timer.start2);

                for (Tile tile: timer.Tlist) {
                    timer.meet(tile);
                }
               timer.move(timer.start3);timer.move(timer.start4);timer.move(timer.start5);timer.move(timer.start6);//timer.move(timer.start7);timer.move(timer.start8);timer.move(timer.start9);timer.move(timer.start10);timer.move(timer.start11);timer.move(timer.start12);timer.move(timer.start15);timer.move(timer.start16);timer.move(timer.start17);timer.move(timer.start18);timer.move(timer.start19);
                // timer.move(timer.start20);timer.move(timer.start21);timer.move(timer.start22);timer.move(timer.start23);timer.move(timer.start24);timer.move(timer.start25);timer.move(timer.start26);timer.move(timer.start27);timer.move(timer.start28);timer.move(timer.start29);timer.move(timer.start30);timer.move(timer.start31);timer.move(timer.start32);timer.move(timer.start33);timer.move(timer.start34);timer.move(timer.start35);timer.move(timer.start36);
                //System.out.println("dgfdgfdgf");
                //timer.move(timer.stop);
                timer.map.revalidate(); timer.map.repaint();
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