class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        String operators = "+-*/";
        
        for(String token : tokens){
            // 연산자가 아닌 경우
            if(!operators.contains(token)){
                 stack.push(Integer.parseInt(token)); } 
            // 연산
            else{
                int a = stack.pop();
                int b = stack.pop();
                int index = operators.indexOf(token);
                
                switch(index){
                    case 0 : stack.push(a + b);
                    break;
                    case 1 : stack.push(b - a);
                    break;
                    case 2 : stack.push(a * b);
                    break;
                    case 3 : stack.push(b / a);
                    break;
                }
            }
        }
        return stack.pop();
    }
}