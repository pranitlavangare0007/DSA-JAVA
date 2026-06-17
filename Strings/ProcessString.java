package Strings;

public class ProcessString {
     public static String processStr(String s) {
        
        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(ch == '*'){
                if(!ans.isEmpty()){
                   ans.deleteCharAt(ans.length()-1);
                }
            }
            else if(ch == '#'){
                ans.append(ans);
            }

            else if(ch == '%'){
                ans=ans.reverse();
            }
            else{
                ans.append(ch);
            }
            
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String s = "z*#";
        System.out.println(processStr(s));
    }
}
