package capgimini;
import java.util.*;
public class countfreq {
    static int countfre(int []arr){
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num ,0) + 1);
        }
        return freq;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
    }
}
