public class VacuumRoute {
    public static void main(String[] args) {
           String input = "RUULLDRD";
           String input2 = "LR";
           System.out.println(VacuumReturnsStart(input2));
    }

    public static Boolean VacuumReturnsStart(String moves) {
        int LR = 0;
        int UD = 0;
        for (int i = 0; i < moves.length(); i++) {
            char current = moves.charAt(i);
            if (current == 'L') {
                LR++;
            } else if (current == 'R') {
                LR--;
            } else if (current == 'U') {
                UD++;
            } else if (current == 'D') {
                UD--;
            }
        }

        return LR == 0 && UD == 0;
    }
}