
class pattern {

    public static void p1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void p8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void p10(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p11(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void p12(int n) {
        for (int i = 1; i <= n; i++) {
            int nums = (n - i + 1) * (n - i + 2) / 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums += n - i + j;
            }
            System.out.println();
        }
    }

    public static void p13(int n) {
        int c = 0;
        int v = 0;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            c += i;
            v = c;
            for (int j = 1; j <= i; j++) {
                System.out.print(v + " ");
                v--;
            }
            System.out.println();
        }
        int rem = n - ((n / 2) + 1);
        for (int i = rem; i >= 1; i--) {
            c += i;
            v = c;
            for (int j = 1; j <= i; j++) {
                System.out.print(v + " ");
                v--;
            }
            System.out.println();
        }
    }

    public static void p14(int n) {
        int c = 1;
        int v = 0;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        int rem = n - ((n / 2) + 1);
        for (int i = rem; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    public static void p15(int n) {
        int v = 0;
        for (int i = 1; i <= n; i++) {
            v = i;
            for (int j = n; j >= i; j--) {
                System.out.print(v + " ");
                v += j;
            }
            System.out.println();
        }
    }

    public static void p16(int n) {
        int v = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p17(int n) {
        int v = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p18(int n) {
        int v = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        p1(n);
        System.out.println();
        p2(n);
        System.out.println();
        p3(n);
        System.out.println();
        p4(n);
        System.out.println();
        p5(n);
        System.out.println();
        p6(n);
        System.out.println();
        p7(n);
        System.out.println();
        p8(n);
        System.out.println();
        p9(n);
        System.out.println();
        p10(n);
        System.out.println();
        p11(n);
        System.out.println();
        p12(n);
        System.out.println();
        p13(n);
        System.out.println();
        p14(n);
        System.out.println();
        p15(n);
        System.out.println();
        p16(n);
        System.out.println();
        p17(n);
        System.out.println();
        p18(n);
        System.out.println();
        p19(n);
        System.out.println();
        p20(n);
        System.out.println();
        p21(n);
    }
}
