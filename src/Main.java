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
        if (node instanceof Statement) {
            System.out.println(((Statement)node).getStatementType().toString());
        } else if (node instanceof BinaryOp) {
            System.out.println(((BinaryOp)node).getBinaryOperator().toString());
        } else if (node instanceof Variable) {
            System.out.println(((Variable)node).getVariable());
        } else {
            System.out.println("ROOT");
        }
        for (Node edge : node.getEdges()) {
            traverse(edge);
        }
    }
}
