class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(!isOperator(tokens[i])){
                s.push(Integer.parseInt(tokens[i]));
            }else{
                int one = s.pop();
                int two = s.pop();
                int res = -1;
                switch(tokens[i]){
                    case "+" : 
                     res = two + one;
                     break;
                    case "-" :
                     res = two - one;
                     break;
                    case "*" :
                     res = two * one;
                     break;
                    case "/" :
                     res = two / one;
                     break;  
                }
                s.push(res);
            }
        }
        return s.pop();

    }

    public boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return true;
        }
        return false;
    }
}
