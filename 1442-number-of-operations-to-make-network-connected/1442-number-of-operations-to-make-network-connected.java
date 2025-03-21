
class Solution {
    // Parent array for Union-Find
    private int[] parent;
    
    // Find function with path compression
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    // Union function
    private void union(int x, int y) {
        parent[find(x)] = find(y);
    }
    
    public int makeConnected(int n, int[][] connections) {
        // Initialize parent array
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        // Process all connections
        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];
            union(a, b);
        }
        
        // Count number of components
        Set<Integer> components = new HashSet<>();
        for (int i = 0; i < n; i++) {
            components.add(find(i));
        }
        int numComponents = components.size();
        
        // Calculate minimum replacements needed
        int totalEdges = connections.length;
        int edgesNeeded = n - 1;  // For a fully connected graph
        int currentMinEdges = n - numComponents;  // Minimum edges currently used
        int extraEdges = totalEdges - currentMinEdges;  // Edges that can be replaced
        
        // Check if we have enough edges to connect all components
        int replacementsNeeded = numComponents - 1;
        if (extraEdges >= replacementsNeeded) {
            return replacementsNeeded;
        } else {
            return -1;
        }
    }
}