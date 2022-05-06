import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;





public class peopleIcon extends JPanel {
    int coor_x;
    int coor_y;
    int[] coor=new int[2];
    Color color;
    ArrayList<Person> occupants= new ArrayList<Person>();
    Tile tileon;
    boolean paused= false;


    peopleIcon(int x,int y, Color c){
        color=c;
        coor_x=x;
        coor_y=y;
        coor[0]=x;
        coor[1]=y;
        this.setBackground(c);
    }

    public void back(){
        this.setBackground(color);
    }
    public ArrayList<Person> addoccupants(Person t){
        occupants.add(t);
        return occupants;
    }
    public ArrayList<Person> popoccupants(Person t){
        occupants.remove(t);
        return occupants;
    }

    public void highlight(){
        this.setBackground(Color.yellow);
    }
    public void setwhite(){
        this.setBackground(Color.white);
    }
    public void setblack(){
        this.setBackground(Color.black);
    }
    public int[] getCoor(){
        return coor;
    }
    public int[] addNret(Object p){
        this.add((Component) p);
        return coor;
    }

    /*public void add(ImageIcon f) {
        this.add(f);*/

}