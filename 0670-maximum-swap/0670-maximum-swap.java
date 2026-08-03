class Solution {
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        char maxElem = numArr[n - 1];
        int maxInd = n - 1;
        int ind1 = -1, ind2 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (numArr[i] > maxElem) {
                maxElem = numArr[i];
                maxInd = i;
            } else if (numArr[i] < maxElem) {
                ind1 = i;
                ind2 = maxInd;
            }
        }
        if (ind1 != -1) {
            char temp = numArr[ind1];
            numArr[ind1] = numArr[ind2];
            numArr[ind2] = temp;
        }

        return Integer.parseInt(new String(numArr));
    }
}