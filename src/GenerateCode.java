
import java.util.Scanner;

/**
 * @author Ammar Yasser
 */
public class GenerateCode {

    static Scanner sc = new Scanner(System.in);

    protected static void If(int Case, String Char, int State) {
        System.out.printf("case %d: if (ch == '%s') currentState = %d; else return false; break;\n", Case, Char, State);
    }

    protected static void Switch() {
        System.out.print("caseNO = ");
        int caseNo = sc.nextInt();
        System.out.print("cases = ");
        int cases = sc.nextInt();

        String result = "case " + caseNo + ": switch (ch) { ";

        while (cases-- != 0) {
            String Char = sc.next();
            int State = sc.nextInt();
            result += " case '" + Char + "': currentState = " + State + "; break; ";
        }
        result += "default: return false; } break;";
        System.out.println(result);
    }

    public static void main(String[] args) {
        while (true) {
            int Case = sc.nextInt();
            String Char = sc.next();
            int State = sc.nextInt();

            If(Case, Char, State);
        }
    }
}
