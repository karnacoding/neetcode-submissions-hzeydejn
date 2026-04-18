class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                int last = result.pop();
                int secondLast = result.peek();
                int sum = last + secondLast;
                result.push(last);
                result.push(sum);

            } else if (op.equals("C")) {
                result.pop();

            } else if (op.equals("D")) {
                result.push(result.peek() * 2);

            } else {
                result.push(Integer.parseInt(op));
            }
        }

        int resultSum = 0;
        for (int score : result) {
            resultSum += score;
        }

        return resultSum;
    }
}