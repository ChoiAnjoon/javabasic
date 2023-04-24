package codingtest._07_dfs_bfs_1;

import java.util.*;
// Tree 말단 노드까지의 가장 짧은 경로 (BFS) -> 최단거리는 BFS가 정답

class Node4 {
    int data;
    Node4 lt, rt;
    public Node4(int val) {
        data=val;
        lt=rt=null;
    }
}
public class Main10 {
    Node4 root;
    public int BFS(Node4 root) {
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()) {
            int len=Q.size();
            for (int i=0; i<len; i++) {
                Node4 x=Q.poll();
                if (x.lt==null && x.rt==null) return L;
                if (x.lt!=null) Q.offer(x.lt);
                if (x.rt!=null) Q.offer(x.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Main10 tree = new Main10();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        System.out.println(tree.BFS(tree.root));
    }
}
