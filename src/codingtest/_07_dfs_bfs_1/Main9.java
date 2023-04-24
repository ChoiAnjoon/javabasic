package codingtest._07_dfs_bfs_1;

// Tree 말단 노드까지의 가장 짧은 경로 (DFS로 풀어보기)
// DFS로 풀시 노드의 자식들이 왼쪽,오른쪽 둘다 있거나 없어야 됨을 가정한다.
// 원래 이 문제는 BFS가 정답

class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data=val;
        lt=rt=null;
    }
}
public class Main9 {
    Node3 root;
    public int DFS(int L, Node3 root) {
        if (root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }
    public static void main(String[] args) {
        Main9 tree = new Main9();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
