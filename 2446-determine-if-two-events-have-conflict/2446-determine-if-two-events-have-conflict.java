class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int e1_start = toMinutes(event1[0]);
        int e1_end   = toMinutes(event1[1]);
        int e2_start = toMinutes(event2[0]);
        int e2_end   = toMinutes(event2[1]);
        return e1_start <= e2_end && e2_start <= e1_end;
    }

    int toMinutes(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60
             + Integer.parseInt(s.substring(3, 5));
    }
}