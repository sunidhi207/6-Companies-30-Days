# 6-Companies-30-Days
#You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0 || tokens==null)
        {
           return -1;
        }
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens)
        {
            if(token.equals("+"))
            {
                stack.push(stack.pop() +stack.pop());
            }
            else if(token.equals("*"))
            {
                stack.push(stack.pop()*stack.pop());
            }
            else if(token.equals("-"))
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("/"))
            { 
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }
            else
            {
                stack.push(Integer.valueOf(token));
            }


        }
        return stack.pop();
    }
}
