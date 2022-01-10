package easy;

/*
1791. Find Center of Star Graph
https://leetcode.com/problems/find-center-of-star-graph/
 */
public class Solution1791 {
    public int findCenter(int[][] edges) {
        int temp = edges[0][0];
        if (temp == edges[1][0] || temp == edges[1][1]) {
            return temp;

        } 
        
        return edges[0][1];

    }
}