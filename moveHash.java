package capgimini;
import java.util.*;
public class moveHash {
    static String hash(String str){
        int n = str.length();

        String s1 = "";
        String s2 = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='#'){
                s1 = s1+str.charAt(i);
            }
            else{
                s2 = s2 + str.charAt(i);
            }
            
        }
        String res = s1.concat(s2);
        return res;
    }    
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        String a = sc.nextLine();
        System.out.println(hash(a));
    }
}
