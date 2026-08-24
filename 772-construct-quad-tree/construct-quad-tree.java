/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return dfs(0, 0, grid.length, grid);
    }

    private Node dfs(int r, int c, int length, int[][] grid) {
        // Base Case: 1x1 grid is always a leaf
        if (length == 1) {
            return new Node(grid[r][c] == 1, true, null, null, null, null);
        }

        // Recursive Step: Divide into 4 quadrants
        int half = length / 2;
        Node topLeft = dfs(r, c, half, grid);
        Node topRight = dfs(r, c + half, half, grid);
        Node bottomLeft = dfs(r + half, c, half, grid);
        Node bottomRight = dfs(r + half, c + half, half, grid);

        // Merge Step: If all 4 quadrants are leaves and have the same value
        if (topLeft.isLeaf && topRight.isLeaf && 
            bottomLeft.isLeaf && bottomRight.isLeaf &&
            topLeft.val == topRight.val && 
            topRight.val == bottomLeft.val && 
            bottomLeft.val == bottomRight.val) {
            
            // Merge into a single leaf node
            return new Node(topLeft.val, true, null, null, null, null);
        }

        // Otherwise, it's an internal node
        // The value of an internal node can be arbitrary (usually true)
        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}