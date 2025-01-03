public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> result = new ArrayList<>();

        int curDir = 0, r = 0, c = 0;
        result.add(matrix[0][0]);
        matrix[0][0] = -101;

        while (result.size() != matrix.length * matrix[0].length) {
            int curR = r + directions[curDir][0];
            int curC = c + directions[curDir][1];

            if (curR < 0 || curR >= matrix.length || curC < 0 || curC >= matrix[0].length || matrix[curR][curC] == -101) {
                curDir = (curDir + 1) % 4;
            } else {
                result.add(matrix[curR][curC]);
                matrix[curR][curC] = -101;
                r = curR;
                c = curC;
            }
        }
        return result;
    }
}
