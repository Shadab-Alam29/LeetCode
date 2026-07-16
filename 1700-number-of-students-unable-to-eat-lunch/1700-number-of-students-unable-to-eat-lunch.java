class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int len = students.length;

        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for (int x : students)
            q.offer(x);

        for (int i = len - 1; i >= 0; i--)
            st.push(sandwiches[i]);

        while (!q.isEmpty() && count < len) {
            if (st.peek().equals(q.peek())) {
                st.pop();
                q.poll();
                count = 0;
            } else {
                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }
}