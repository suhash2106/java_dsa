package Arrays;
import java.util.*;

public class Loop {
    public static void main(String[] args) {
       // int i = 0;
       // int j = 0;
       // while(i<4){
           // i = i + 1;
            //j = j + i;
            //System.out.println(j+" ");
        //}
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int table = 0;
        while(i<=10){
            i = i + 1;
            table = (n*i);
            System.out.println(table);
        }


    }
}
