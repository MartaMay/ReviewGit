package leetcode.com.practise_tasks;
//my comment

public class LongestPrefix {
    public static void main(String[] args) {
        String[] sr = {"flower","flow","flight"};
        String[] sr2 = {"flower","flow","flowight"};
        System.out.println(longestCommonPrefix(sr2));
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i< strs.length; i++) {
            String current = strs[i];
            int minLength = Math.min(prefix.length(), current.length());
            int c = 0;
            while (c<minLength && prefix.charAt(c) == current.charAt(c)){
                c++;
                }
            prefix = prefix.substring(0,c);
            }
        if (prefix.isEmpty()){
            return "";




        }return prefix;

        }

}
