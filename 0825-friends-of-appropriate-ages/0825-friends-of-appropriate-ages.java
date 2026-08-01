class Solution {
    public int numFriendRequests(int[] ages) {
        int[] users = new int[121];
        for (int i : ages) {
            users[i]++;
        }
        int req = 0;
        for (int i = 1; i < users.length; i++) {
              if (users[i] == 0) continue;
            for (int j = 1; j < users.length; j++) {
                if (users[j] == 0) continue;
                if (j <= 0.5 * i + 7) continue;
                if (j > i) continue;
                if (j > 100 && i < 100 ) continue;
                req += users[i] * users[j];
                if (i == j) req -= users[i];
            }
        }
        return req;
    }
}