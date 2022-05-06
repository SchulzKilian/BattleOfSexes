import javax.swing.*;

public class Mbuttons extends JButton {
    int coorx;
    int coory;
    String name;
    Mbuttons(int x, int y){
        name="("+x+","+y+")";
        //JButton bt=new JButton(name);
        coorx=x;
        coory=y;

    }
    public int[] getcoor(){
        int[]coor=new int[2];
        coor[0]=coorx;
        coor[1]=coory;
        return coor;
    }
    public String getname(){
        return name;}
}
