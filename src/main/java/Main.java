import Frontend.Parser;
import Model.AST.*;
import Model.Flowgraph.FlowNode;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Node root = createTestNode();
//        System.out.println(root.toString());
//        traverse(root);
//        List<FlowNode> flowNodeList = root.convertToFlowNodes();
//        for (FlowNode flowNode : flowNodeList) {
//            System.out.println(flowNode.toString());
//        }

//        Parser parser = new Parser(testProgram());
//        parser.parse();
        String filename = System.getProperty("user.dir") + "/src/main/resources/exampleProgram1.txt";
        try {
            Parser.parse(filename);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void traverse(Node node) {
        System.out.println(node.getType());
        for (Node edge : node.getEdges()) {
            traverse(edge);
        }
    }

    private static String testProgram() {
        return "{\n" +
                "  read x;\n" +
                "  int y := 0;\n" +
                "  while(x != 0)\n" +
                "  {\n" +
                "      y:= y + x;\n" +
                "      x:= x -1;\n" +
                "  }\n" +
                "  write y;\n" +
                "}";
    }

    private static Node createTestNode() {
        Node root = new Node();

        Statement read = new Statement(Statement.StatementType.READ);
        Variable x = new Variable("x");
        read.addEdge(x);
        root.addEdge(read);

        Statement assign = new Statement(Statement.StatementType.ASSIGN);
        Statement init = new Statement(Statement.StatementType.DECLARATION);
        Declaration declaration = new Declaration(Declaration.DeclarationType.INT);
        Variable y = new Variable("y");
        init.addEdge(declaration);
        init.addEdge(y);
        Variable zero = new Variable("0");
        assign.addEdge(init);
        assign.addEdge(zero);
        root.addEdge(assign);

        Statement whiles = new Statement(Statement.StatementType.WHILE);
        BinaryOp cond = new BinaryOp(BinaryOp.BinaryOperator.NOTEQUAL);
        Variable x2 = new Variable("x");
        Variable zero2 = new Variable("0");
        cond.addEdge(x2);
        cond.addEdge(zero2);
        whiles.addEdge(cond);

        Statement branch = new Statement(Statement.StatementType.BRANCH);

        Statement assign2 = new Statement(Statement.StatementType.ASSIGN);
        Variable y2 = new Variable("y");
        BinaryOp plus = new BinaryOp(BinaryOp.BinaryOperator.PLUS);
        Variable y3 = new Variable("y");
        Variable x3 = new Variable("x");
        plus.addEdge(y3);
        plus.addEdge(x3);
        assign2.addEdge(y2);
        assign2.addEdge(plus);

        Statement assign3 = new Statement(Statement.StatementType.ASSIGN);
        Variable x4 = new Variable("x");
        BinaryOp minus = new BinaryOp(BinaryOp.BinaryOperator.MINUS);
        Variable x5 = new Variable("x");
        Variable one = new Variable("1");
        minus.addEdge(x5);
        minus.addEdge(one);
        assign3.addEdge(x4);
        assign3.addEdge(minus);

        branch.addEdge(assign2);
        branch.addEdge(assign3);

        whiles.addEdge(branch);

        root.addEdge(whiles);

        Statement write = new Statement(Statement.StatementType.WRITE);
        Variable y6 = new Variable("y");
        write.addEdge(y6);
        root.addEdge(write);

        return root;
    }
}
