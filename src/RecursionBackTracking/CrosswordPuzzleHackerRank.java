package RecursionBackTracking;

public class CrosswordPuzzleHackerRank {
    static void solve(String[] crossword,String[] words,int i ,int j,int[] visited){
        if(i== crossword.length || j== crossword.length){
            return;
        }
        if(j== crossword[0].length()){
            solve(crossword,words,i+1,0,visited);
        }
        if(crossword[i].charAt(j)=='-') {
            int horizontalLen = 0;
            int veticalLen=0;
            for(int k=j;k< crossword[0].length();k++){
                if(crossword[i].charAt(k)=='+'){
                    break;
                }
                horizontalLen++;
            }
            for(int k=i;k< crossword[0].length();k++){
                if(crossword[k].charAt(j)=='+'){
                    break;
                }
                veticalLen++;
            }
            if(veticalLen==1){
                for(int k=0;k< words.length;k++){
                    if(visited[i]==0 && words[k].length()<horizontalLen){

                    }
                }
            }
        }
    }
//    static String[] crosswordPuzzle(String[] crossword, String words) {
//
//    }

    public static void main(String[] args) {

    }
}
