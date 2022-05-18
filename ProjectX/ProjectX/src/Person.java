public interface Person extends Runnable {
    //Tile meetingtile=new Tile(0,0, Color.black);


    public int[] moverand(int x, int y);
    public  boolean type();
    public  String  getgender();
    public Thread getRunningon();
    public void Pause(int CurrentTime, int pausingtime);
    public boolean Startagain(int CurrentTime);
    public Main getFrame();
    public void fenotipo();
    public int getage();



}
