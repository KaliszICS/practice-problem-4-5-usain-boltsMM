public class PracticeProblem {

    public static void main(String[] args) {

    }

    public static String triangle(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;
    }

    public static String pyramid(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                result += " ";
            }

            for (int j = 1; j <= i; j++) {
                result += "*";
                if (j < i) {
                    result += " ";
                }
            }

            result += "\n";
        }

        return result;
    }

    public static String multiplicationTable(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result += (i * j);
                if (j < n) {
                    result += " ";
                }
            }
            result += "\n";
        }

        return result;
    }
}