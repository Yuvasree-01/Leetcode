class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ){
            return false;
        }
        String str = Integer.toString(x);
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
        // long temp=x;
        // long reverse =0;
        // while(temp!=0){
        //     long digit=temp%10;
        //     reverse = reverse*10 + digit;
        //     temp=reverse/10;
        // }
        // if((reverse==x)){
        //     return true;
        // }
        // return false;
        
        
        // String s = Integer.toString(x);
        // Stack<Character> st = new Stack<>();
        // String str = "";
        // for(char ch:s.toCharArray()){
        //     st.push(ch);
        // }
        // while(!st.isEmpty()){
        //     str+=st.pop();
        // }
        // int a=Integer.parseInt(str);
        // if(a==x){
        //     return true;
        // }
        // return false;
    }
}