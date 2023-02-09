import java.util.*;

public class checkForAnagram {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int n1 = a.length();
        int n2 = b.length();
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        
        if(n1!=n2){
            return false;
        }
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0;i<n1;i++){
            if(str1[i] != str2[i]){return false;}
        }
        return true;
    }
}


