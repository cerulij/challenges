// Given a node in a connected graph, return a clone of the graph

package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {

  Map<GraphNode, GraphNode> visited = new HashMap<>();

  public GraphNode cloneGraph(GraphNode node) {
    if (node == null) {
      return null;
    }

    // keep track of visited nodes so we don't get into a cycle
    if (visited.containsKey(node)) {
      return visited.get(node);
    }

    GraphNode clone = new GraphNode(node.val, new ArrayList<>());
    visited.put(node, clone);

    for (GraphNode n : node.neighbors) {
      clone.neighbors.add(cloneGraph(n));
    }

    return clone;
  }

}
