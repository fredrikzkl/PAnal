import Model.BinaryOp;
import Model.Node;
import Model.Statement;
import Model.Variable;

public class Main {

    public static void main(String[] args) {

        Node root = new Node();
        Statement read = new Statement(Statement.StatementType.READ);
        Variable x = new Variable("x");
        read.addEdge(x);
        root.addEdge(read);
        Statement assign = new Statement(Statement.StatementType.ASSIGN);
        
        traverse(root);
    }

    private static void traverse(Node node) {
        System.out.println(node.getType());
        for (Node edge : node.getEdges()) {
            traverse(edge);
        }
    }
}
