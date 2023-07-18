import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])); //우선순위 큐: distance, x, y좌표

        for (int[] point : points) { //points 배열에서 x, y 추출 -> minHeap 저장
            minHeap.offer(point);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        int[][] res = new int[k][2]; //minHeap을 2차원 배열로 변환
        while (k > 0) {
            res[k - 1] = minHeap.poll();
            k--;
        }

        return res;
    }
}