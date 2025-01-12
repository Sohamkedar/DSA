package ADT;

class PrefixEvaluator {
    private Stack theStack;
    private String input;

    public PrefixEvaluator(String in) {
        input = in;
        theStack = new Stack(input.length());
    }

    public int evaluate() {
        for (int j = input.length() - 1; j >= 0; j--) {
            char ch = input.charAt(j);
            if (Character.isDigit(ch)) {
                theStack.push((char) (ch - '0'));
            } else {
                int num1 = theStack.pop();
                int num2 = theStack.pop();
                int result = 0;
                switch (ch) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                theStack.push((char) result);
            }
        }
        return theStack.pop();
    }
}
