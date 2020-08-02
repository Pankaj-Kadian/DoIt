package RecursionBackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyPadCombination {
    public static String decoding(int n){
        if(n==2) return "abc";
        if(n==3) return "def";
        if(n==4) return "ghi";
        if(n==5) return "jkl";
        if(n==6) return "mno";
        if(n==7) return  "pqrs";
        if(n==8) return "tuv";
        return "wxyz";
    }

    public static List<String> letterCombination(String digit){
        if(digit.length()==0){
            List<String> ans = new ArrayList<>();
            return ans;
        }
        if(digit.length()==1){
            List<String> ans = new ArrayList<>();
            String str = decoding(Integer.parseInt(digit.substring(0,1)));
            for(int i=0;i<str.length();i++){
                ans.add(str.charAt(i)+"");
            }
            return ans;
        }
        List<String> smallAns = letterCombination(digit.substring(1));
        List<String> ans = new ArrayList<>();
        String str = decoding(Integer.parseInt(digit.substring(0,1)));
        for(int i=0;i<str.length();i++){
            for(int j=0;j<smallAns.size();j++){
                String st = str.charAt(i)+""+smallAns.get(j);
            }
        }
        return ans;
    }
}
