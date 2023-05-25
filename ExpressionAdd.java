https://practice.geeksforgeeks.org/problems/expression-add-operators/1
public class ExpressionAdd {
    static void help(String s,int target,int index,ArrayList<String> ans,int value,int pichla,String newString){
        if(index==s.length()){
            if(value==target){
                ans.add(newString);
            }
            return;
        }
        String temp= "";
        int n = 0;
        for(int i=index;i<s.length();i++){
            temp+=s.charAt(i);
            n=n*10+(s.charAt(i)-'0');
            if(index==0){
                help(s,target,i+1,ans,n,n,temp);
            }
            else{
                help(s,target,i+1,ans,value+n,n,newString+"+"+temp);
                help(s,target,i+1,ans,value-n,-n,newString+"-"+temp);
                help(s,target,i+1,ans,value-pichla+pichla*n,pichla*n,newString+"*"+temp);
            }
            if(s.charAt(index)=='0')break;
        }
    }
    public static ArrayList<String> addOperators(String S, int target) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        String newString = "";
        help(S,target,0,ans,0,0,newString);
        return ans;
    }
}
