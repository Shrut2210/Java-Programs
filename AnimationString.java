public class AnimationString {
    public static void main(String[] args) {
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";
        String s = "Shruti Vadgama is now dumbo and she is in depression so don't try to broke her by tonting her ";

        for(int i=0;i<s.length();i++)
        {
            System.out.print(BLUE + s.charAt(i) + RESET);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
