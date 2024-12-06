import java.util.*;
//import java.io.*;



public class H-index_Counting_Sorting {

    public int hIndex(int[] citations) {
        // code here
          int n = citations.length;
        int[] freq = new int[n + 1];

        // Count the frequency of citations
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n)
                freq[n] += 1;
            else
                freq[citations[i]] += 1;
        }

        int idx = n;
        
        // Variable to keep track of the count of papers
        // having at least idx citations
        int s = freq[n]; 
        while (s < idx) {
            idx--;
            s += freq[idx];
        }
        
        // Return the largest index for which the count of 
        // papers with at least idx citations becomes >= idx
        return idx;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}