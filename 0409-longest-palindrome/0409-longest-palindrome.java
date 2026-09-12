class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int evensum = 0;
        boolean odd = false;
        for (int value : map.values()) {
            if (value % 2 == 0) {
                evensum += value;
            } else {
                evensum += value - 1;
                odd = true;
            }
        }
        if (odd) {
            evensum++;
        }
        return evensum;
    }
}




        // only work if thre is only one odd freq element 
//        HashMap<Character , Integer> map = new HashMap<>();
//        for( char ch : s.toCharArray()){
//         if ( map.containsKey(ch)){
//             map.put(ch,map.get(ch)+1);
//         }
//         else map.put(ch,1);
//        }
//        int oddMax = 0 ;
//        int evensum = 0 ; 

//        for( int value : map.values()){
//             if ( value % 2 == 0) evensum += value ;
//             else {
//                 oddMax = Math.max(oddMax,value);
//             }
//        } 
//         return evensum+oddMax;

//     }
// }
        // Giving TLE

        // int[] freq = new int[52];
        // for (char ch : s.toCharArray()) {
        //     if (ch >= 'A' && ch <= 'Z') {
        //         freq[ch - 'A']++;
        //     } else if (ch >= 'a' && ch <= 'z') {
        //         freq[26 + (ch - 'a')]++;
        //     }
        // }
        // int max = 0;
        // int sum = 0 ;
        // for ( int  i : freq){
        //     if ( i%2 == 0 ) sum+=i;
        //     else max = Math.max(max,i);
        // }
        // return sum+max;