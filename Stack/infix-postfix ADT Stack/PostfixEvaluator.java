package ADT;

class PostfixEvaluator {
    private Stack theStack;
    private String input;

    public PostfixEvaluator(String in) {
        input = in;
        theStack = new Stack(input.length());
    }

    public int evaluate() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            if (ch >= '0' && ch <= '9') {
                theStack.push((char) (ch - '0'));
            } else {
                int num2 = theStack.pop();
                int num1 = theStack.pop();
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
