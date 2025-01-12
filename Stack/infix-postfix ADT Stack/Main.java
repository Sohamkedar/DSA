package ADT;

public class Main {
    public static void main(String[] args) {
        String infix = "3+4*2/(1-5)";
        InfixToPostfix converter = new InfixToPostfix(infix);
        String postfix = converter.doTrans();
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);

        PostfixEvaluator evaluator = new PostfixEvaluator(postfix);
        int result = evaluator.evaluate();
        System.out.println("Result: " + result);
    }
}
