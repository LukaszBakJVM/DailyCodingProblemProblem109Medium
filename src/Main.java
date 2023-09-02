public class Main {
    private static int a=11100010;
    public static void main(String[] args) {
        String swap1 = swap88(a);
        System.out.println(swap1);
    }
    private static String swap88(int number){
       String s1="";
        StringBuilder str=new StringBuilder();
        String s=String.valueOf(number);
        char[]chars =new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                chars[i - 1] = s.charAt(i);
            } else {
                chars[i + 1] = s.charAt(i);
            }
        }

        for (char aChar : chars) {
            s1 = str.append(aChar).toString();


        }



return s1;
    }

}