public class StringBuilders {
    public static void main(String[] args){

        StringBuilder sb= new StringBuilder("Shreya");
        System.out.println(sb);

        //char at 0
        System.out.println(sb.charAt(0));

        //set character at index
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //insert in String Builder
        sb.insert(0,'S');
        System.out.println(sb);

        //delete the extra 'S'
        sb.delete(0,1);
        System.out.println(sb);

        //append string
        sb.append("T");
        sb.append("h");
        sb.append("a");
        sb.append("k");
        sb.append("k");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        //reverse sting
        for (int i=0; i< sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

    }
}
