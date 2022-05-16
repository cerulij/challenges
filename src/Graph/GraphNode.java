package Graph;

import java.util.List;

public class GraphNode {

  public int val;
  public List<GraphNode> neighbors;

  public GraphNode() {
  }

  public GraphNode(int val, List<GraphNode> neighbors) {
    val = val;
    neighbors = neighbors;
  }

}
