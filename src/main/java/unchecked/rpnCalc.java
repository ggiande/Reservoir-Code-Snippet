package unchecked;

import java.util.Stack;

public class rpnCalc {
	private Stack<Integer> stack;
	
	public rpnCalc() {
		stack = new Stack<Integer>();
	}

	public void evaluate(String token) {
            if (isOperator(token)) {
            	evaluateSingleOperator(token);
            }
            else {
           stack.push(Integer.parseInt(token)); 
            }
	}

	public boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || 
        		token.equals("*") || token.equals("/") ||
        		token.equals("%") || token.equals("q") ||
        		token.equals("?") || token.equals("h") || 
        		token.equals("n") || token.equals("p") ||
        		token.equals("?") || token.equals("m") ||
        		token.equals("f") || token.equals("c") ||
        		token.equals("r") || token.equals("d"));
    }

	private void evaluateSingleOperator(String operation) {
		int op1 = 1, op2 = 1, y, x;
        switch (operation) {
            case "+":					//Addition operation for the last two integers of the stack.
            	op2 = stack.pop();
                op1 = stack.pop();
            	x = op1 + op2;
            	stack.push(x);
            	break;
            	
            case "-":					//Subtraction operation for the last two integers of the stack.
            	op2 = stack.pop();
                op1 = stack.pop();
                y = op1 - op2;
                stack.push(y);
                break;
                
            case "*":					//Multiplication operation for the last two integers of the stack.
            	op2 = stack.pop();
                op1 = stack.pop();
                x = op1 * op2;
                stack.push(x);
                break;
                
            case "/":					//Division operation for the last two integers of the stack.
            	op2 = stack.pop();
                op1 = stack.pop();
                x = op1 / op2;
                stack.push(x);
                break;
                
            case "%":					//Modulus operation for last two integers of the stack.
            	op2 = stack.pop();
                op1 = stack.pop();
            	x = op1 % op2;
            	stack.push(x);
            	break;
            	
            case "q":					//Quits the Program.
            	System.out.println("EXITING.");
            	System.exit(0);
            	break;
            	
            case "h":					//Help Message.
            	System.out.println("The following commands are available:\n" + 
            			 "•	+ add the top two items\n" + 
            			"•	* multiply the top two items\n" + 
            			"•	- subtract the top item from the next item\n" + 
            			"•	/ integer divide the second item by the top item\n" + 
            			"•	% find the integer remainder when dividing the second item by the top item\n" + 
            			"•	m unary minus -- negate the top item\n" + 
            			"•	r exchange the top two items\n" + 
            			"•	d duplicate top item on stack\n" + 
            			"•	p print (to the screen) the top item\n" + 
            			"•	n print and remove the top item\n" + 
            			"•	h (or ?) print a help message\n");
            	break;
            	
            case "?":					//Help Message.
            	System.out.println("The following commands are available:\n" + 
           			 "•	+ add the top two items\n" + 
           			"•	* multiply the top two items\n" + 
           			"•	- subtract the top item from the next item\n" + 
           			"•	/ integer divide the second item by the top item\n" + 
           			"•	% find the integer remainder when dividing the second item by the top item\n" + 
           			"•	m unary minus -- negate the top item\n" + 
           			"•	r exchange the top two items\n" + 
           			"•	d duplicate top item on stack\n" + 
           			"•	p print (to the screen) the top item\n" + 
           			"•	n print and remove the top item\n" + 
           			"•	h (or ?) print a help message\n");
            	break;
            	
            case "n":					//Prints top and removes the top integers on the stack.
            	op2 = stack.pop();
            	break;
            	
            case "p":					//Prints the top of the stack.
            	System.out.println(stack.peek());
            	break;
            	
            case "f":					//Prints the contents of the stack.
                System.out.println(stack.toString());
                break;  
                
            case "m":					//Negates the top item.
            	op1 = stack.pop();
        		y = op1 * -1;
        		stack.push(y);
            	break;
            	
            case "r":					//Exchanges the last two integers in the stack.
            	op1 = stack.pop();
            	op2 = stack.pop();
            	x = op1;
            	y = op2;
            	stack.push(x);
            	stack.push(y);
            	break;
            	
            case "c":					//Clears the stack.
            	stack.clear();
            	break;
            	
            case "d":					//Duplicates the top item on the stack.
            	op1 = stack.peek();
            	stack.push(op1);
            	break;
        }
	}
}
