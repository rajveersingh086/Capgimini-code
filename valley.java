package capgimini;
import java.util.*;
public class valley {
    static int vall(int step , String path){
        
        int valley = 0;
        int elevation =0;

        for(char steps : path.toCharArray()){
            if(steps == 'U'){
                elevation++;
                if(elevation == 0){
                    valley++;
                }
            }
            else{
                elevation--;
            }
        }
        return valley;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in );
        System.out.println("enthe the steps");
        int n = sc.nextInt();
        System.out.println("enter the path");
        String s = sc.next();

        int res = vall(n,s);
        System.out.println(res);
    }
}
