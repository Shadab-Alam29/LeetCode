import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        int size = s.length();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < size; j++) {
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' ||
                s.charAt(j) == 'i' || s.charAt(j) == 'o' ||
                s.charAt(j) == 'u' || s.charAt(j) == 'A' ||
                s.charAt(j) == 'E' || s.charAt(j) == 'I' ||
                s.charAt(j) == 'O' || s.charAt(j) == 'U') {
                ans.add(j);
            }
        }
        char[] arr = s.toCharArray();
        int i = 0;
        int j = ans.size() - 1;
        while (i < j) {
            char temp = arr[ans.get(i)];
            arr[ans.get(i)] = arr[ans.get(j)];
            arr[ans.get(j)] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}