class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start =0;
        int end = s.length()-1;
        String vowels ="AEIOUaeiou";
        while(start <end){
            
            if((ch[start]=='A' || ch[start]=='E' || ch[start]=='I' || ch[start]=='O' ||ch[start]=='U' || ch[start]=='a' || ch[start]=='e'|| ch[start]=='i' || ch[start]=='o' ||ch[start]=='u' ) && (ch[end]=='A'|| ch[end]=='E'|| ch[end]=='I' || ch[end]=='O' ||ch[end]=='U' || ch[end]=='a' || ch[end]=='e'|| ch[end]=='i' || ch[end]=='o' ||ch[end]=='u' ) )
            //if(vowels.indexOf(ch[start])<=0 && vowels.indexOf(ch[end])<=0)
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            else if(!(ch[start]=='A' || ch[start]=='E' || ch[start]=='I' || ch[start]=='O' ||ch[start]=='U' || ch[start]=='a' || ch[start]=='e'|| ch[start]=='i' || ch[start]=='o' ||ch[start]=='u' ) )
            //else if(vowels.indexOf(ch[start]) <0)
            {
                start++;
            }
            
            else if(!(ch[end]=='A'|| ch[end]=='E'|| ch[end]=='I' || ch[end]=='O' ||ch[end]=='U' || ch[end]=='a' || ch[end]=='e'|| ch[end]=='i' || ch[end]=='o' ||ch[end]=='u' ))
            //else if(vowels.indexOf(ch[end]) <0)
            {
                end--;
            }
        }
        return new String(ch);
        
    }
}