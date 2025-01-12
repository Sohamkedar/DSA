package ADT;

public class Main {
    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        InfixToPrefix converter = new InfixToPrefix(infix);
        String prefix = converter.convert();
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + prefix);

        String infixEval = "3*(2+1)-9/(5-4)";
        InfixToPrefix converterEval = new InfixToPrefix(infixEval);
        String prefixEval = converterEval.convert();
        System.out.println("Infix: " + infixEval);
        System.out.println("Prefix: " + prefixEval);

        PrefixEvaluator evaluator = new PrefixEvaluator(prefixEval);
        int result = evaluator.evaluate();
        System.out.println("Result: " + result);
    }
}
