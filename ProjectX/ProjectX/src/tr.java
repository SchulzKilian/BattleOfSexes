import java.util.Arrays;

public class tr {
    public static void main(String[] args) {
        int ind=0;
        int [] stablist= new int[5];
        for (int i = 0; i < 50; i++) {
            if(ind<5){
                stablist[ind]=ind;
            }
            else{
                stablist[0]=stablist[1];
                stablist[1]=stablist[2];
                stablist[2]=stablist[3];
                stablist[3]=stablist[4];
                stablist[4]=ind;
                /*int max= getbiggest(stablist);
                int stab = 0;
                for (int i = 0; i < 5; i++) {
                    if(!(max/stablist[i] <= 0.2)){
                        stab++;

                    }


                }
                if (stab== 0){
                    end();
                }*/

            }
            ind++;
            System.out.println(Arrays.deepToString(new int[][]{stablist}));




        }
    }
}
