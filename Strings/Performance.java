package javaCode.Strings;

public class Performance {
    public static void main(String[] args) {
        String str = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            str = str+ch;
        }
        System.out.println(str);
        //everytime a new string is formed and hence memoery wastage 
        // complexity of n-square because of size(1+2+3+4+5)

        //here comes stringBuilders

        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
