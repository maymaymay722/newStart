package Dynamic;

import java.util.List;

public class Word {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length=s.length();
        boolean[] canBreak=new boolean[s.length()+1];
        canBreak[0]=true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if(canBreak[j] && wordDict.contains(s.substring(j,i))){
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[length];
    }
}
