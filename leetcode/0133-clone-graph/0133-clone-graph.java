/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

//DFS
class Solution {
    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        map.put(node, new Node(node.val, new ArrayList<>()));
 
        for(Node next: node.neighbors){
            if(map.containsKey(next)) //이미 복제한 그래프
                map.get(node).neighbors.add(map.get(next)); //맵에서 해당 인접 노드 해당하는 복제 노드를 가져옴 -> 복제 노드의 인접 노드 리스트에 추가
            else
                map.get(node).neighbors.add(cloneGraph(next)); //cloneGraph 호출해서 복사 -> 복제노드의 인접 노드 리스트에 추가
        }
        return map.get(node); //복제된 그래프의 시작노드 반환
    }
}


/*BFS
class Solution{
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> que = new ArrayDeque<>(); //for BFS
 
        que.offer(node); //node를 큐에 추가
        map.put(node, new Node(node.val, new ArrayList<>()));

        while (!que.isEmpty()) {
            Node cur = que.poll(); //현재 탐색하는 노드 cur

            for (Node next : cur.neighbors) { 
                if (!map.containsKey(next)) { //복제하지 않은 그래프
                    map.put(next, new Node(next.val, new ArrayList<>())); //next 복제 새로운 노드 생성 -> 맵 추가
                    que.offer(next); //큐에 생성한 노드 추가
                }
                map.get(cur).neighbors.add(map.get(next)); //cur의 복제노드에 next의 복제노드 추가
            }
        }
 
        return map.get(node);
    }
}*/