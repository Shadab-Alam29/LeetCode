class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int [] ans = new int [temp.length];
        Stack<Integer> st = new Stack<>();
         for (int i = 0 ; i< temp.length ; i++){
          while(!st.isEmpty() && temp[st.peek()]<temp[i]){
            int in = st.pop();
            ans[in]= i - in;
          }
          st.push(i);
          }
        return ans ;


    // the TLE approch BRUTE FORCE 
    //     int [] ans = new int[temp.length];
    //     int sum = 0 ;
    //     for(int i =0 ; i< temp.length ;i++){
    //         for (int j=i+1 ; j< temp.length ; j++ ){
    //         if(temp[i]<temp[j]){
    //             ans[i]=j-i;
    //             break;
    //         }
    //     }
    // }
    //     return ans ;

    }
}