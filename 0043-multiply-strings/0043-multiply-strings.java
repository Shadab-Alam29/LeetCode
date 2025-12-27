class Solution {
    private char[] reverse (String num){
        char[] str=num.toCharArray();
        int start=0,end=num.length()-1;
        while(start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        return str;
    }
    public String multiply(String num1, String num2) {
        char[] str1=reverse(num1);
        char[] str2=reverse(num2);
        int[] ans=new int[str1.length+str2.length];
        for(int i=0;i<str1.length;i++){
            int cary =0;
            int start=i;
            for(int j=0;j<str2.length;j++){
                int n1=str1[i]-'0';
                int n2=str2[j]-'0';
                int sum=(n1*n2)+ans[start]+cary;
                int base=sum%10;
                cary=sum/10;
                ans[start++]=base;
            }
            if (cary!=0){
                ans[start]=cary;
            }
        }
            int i=ans.length-1;
            while(i>0&& ans[i]==0) i--;
            String answer= "";
            while(i>=0){
                answer+=ans[i];
                i--;
            }
            return answer;
        
    } 
}