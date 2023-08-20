/*You're given strings jewels representing the types of
stones that are jewels, and stones representing the stones
 you have. Each character in stones is a type of stone you have.
 You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
/*Solution*/
public class Solution {
    public int numJewelsInStones(String jewels, String stones){
        int sol=0;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            list.add(jewels.charAt(i));
        }
        for(int j= 0;j<stones.length();j++){
            if(list.contains(stones.charAt(j))){
                sol++;
            }
        }
        return sol;
    }
}
