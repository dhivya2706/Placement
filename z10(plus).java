public class Main {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 9;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (i == 0) {
                    if (j == 0 || j == 4 || j == 8)
                        System.out.print("Z ");
                    else
                        System.out.print("  ");
                }

                else if (i == 1) {
                    if (j == 2 || j == 4 || j == 6)
                        System.out.print("O ");
                    else
                        System.out.print("  ");
                }

                else if (i == 2) {
                    if (j == 0)
                        System.out.print("Z ");
                    else if (j == 2)
                        System.out.print("O ");
                    else if (j == 4)
                        System.out.print("* ");
                    else if (j == 6)
                        System.out.print("H ");
                    else if (j == 8)
                        System.out.print("O ");
                    else
                        System.out.print("  ");
                }

                else if (i == 3) {
                    if (j == 2 || j == 4 || j == 6)
                        System.out.print("H ");
                    else
                        System.out.print("  ");
                }

                else if (i == 4) {
                    if (j == 0 || j == 4 || j == 8)
                        System.out.print("O ");
                    else
                        System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}