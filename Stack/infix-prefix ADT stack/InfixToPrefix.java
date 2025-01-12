package ADT;

class InfixToPrefix {
    private Stack theStack;
    private String input;
    private String output = "";

    public InfixToPrefix(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    public String convert() {
        String reversedInput = reverseString(input);
        reversedInput = replaceParentheses(reversedInput);
        String postfix = infixToPostfix(reversedInput);
        return reverseString(postfix);
    }

    private String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    private String replaceParentheses(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                sb.append(')');
            } else if (ch == ')') {
                sb.append('(');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private String infixToPostfix(String infix) {
        for (int j = 0; j < infix.length(); j++) {
            char ch = infix.charAt(j);
            switch (ch) {
                case '+':  
                case '-': 
                    gotOperator(ch, 1);
                    break;
                case '*':  
                case '/': 
                    gotOperator(ch, 2);
                    break;
                case '(': 
                    theStack.push(ch);
                    break;
                case ')': 
                    gotParen(ch);
                    break;
                default: 
                    output += ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output += theStack.pop();
        }
        return output;
    }

    private void gotOperator(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2 = (opTop == '+' || opTop == '-') ? 1 : 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output += opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    private void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output += chx;
        }
    }
}
