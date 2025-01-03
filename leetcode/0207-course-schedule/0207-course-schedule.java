import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 선수과목 관련 ref 테이블 생성 (ref[i]=i의 선수과목 집합)
        List<List<Integer>> ref = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            ref.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            ref.get(prerequisite[0]).add(prerequisite[1]);
        }

        int[] visited = new int[numCourses];

        // 노드 돌며 사이클 생성 확인
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(ref, visited, i)) // 사이클 생성
                return false;
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> ref, int[] visited, int i) {
        if (visited[i] == 1) { // 이미 방문한 노드
            return true;
        } else if (visited[i] == -1) { // 방문중인 노드
            return false;
        }
        visited[i] = -1;

        for (int j : ref.get(i)) {
            if (!dfs(ref, visited, j))
                return false;
        }
        visited[i] = 1;
        
        return true;
    }
}
