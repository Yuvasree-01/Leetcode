class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuffer str = new StringBuffer();
        String s1="";
        for(char c:s.toCharArray()){
            if(c!='*')
            st.push(c);
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        char[] ch=s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--){
            str.append(ch[i]);
        }
        // StringBuffer str = new StringBuffer();
        // for(char ch:s.toCharArray()){
        //     if(st.peek()=='*' ){
        //         st.pop();
        //         st.pop();
        //         System.out.print(st.peek());
        //     }
        //     else if(!(st.isEmpty())){
        //         str.append(ch);
        //     }
        // }
        return str.toString();
    }
}