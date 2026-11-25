class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c != '#'){
                stack1.push(c);
            } else {
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }

        StringBuilder sb1 = new StringBuilder();
        while(!stack1.isEmpty()){
        sb1.append(stack1.pop());
        }
        String s1 = sb1.toString();

        for(char c: t.toCharArray()){
            if(c != '#'){
                stack2.push(c);
            } else {
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        
        StringBuilder sb2 = new StringBuilder();
        while(!stack2.isEmpty()){
        sb2.append(stack2.pop());
        }
        String s2 = sb2.toString();

        return s1.equals(s2);

    }
}