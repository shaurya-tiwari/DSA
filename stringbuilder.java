public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("KABIR");
        // sb.append("A");
        // sb.append("B");
        // sb.append("I");
        // sb.append("R");
        // sb.insert(2, "b");  
        // sb.delete(start,end);
        // sb.delete(0, 2); // 2 will exclude from the removing characters
        // System.out.println(sb);
        // System.out.println(sb.length());

        // reverse string
        for(int i = 0; i < sb.length()/2; i++){ // the loop will goes half of the word length 
            int front = i;
             int back = sb.length() - 1 - i; //last character

            //  take as teh character 
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
            System.out.println(sb);

        }
        // we can also use inbuild function
        // sb.reverse();
    
    }
}

