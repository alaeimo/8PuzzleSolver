package EightPuzzleSolver;

import java.util.Comparator;
public class NodePriorityComparator implements Comparator<Node> {

    @Override
    public int compare(Node x, Node y) {
        if (x.getTotalCost() < y.getTotalCost()) {
            return -1;
        }
        if (x.getTotalCost() > y.getTotalCost()) {
            return 1;
        }
        return 0;
    }
}

