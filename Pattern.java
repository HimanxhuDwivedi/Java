// ..1..Type Pattten.

// import java.util.*;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // number of rows
//         int m = sc.nextInt(); // number of columns

//         // Outer loop (rows)
//         for (int i = 1; i <= n; i++) {
//             // Inner loop (columns)
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(); // move to next line after each row
//         }
//     }
// }

// ..2.. Type Pattten.

// import java.util.*;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // number of rows
//         int m = sc.nextInt(); // number of columns

//         // Outer loop (rows)
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= m; j++) {
//                 // cell →> (i,j)
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ..3..Type Pattten.

// public class Pattern {
//     public static void main(String[] args) {

//         int n = 4;

//         // Outer loop (rows)
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ..4..Type Pattten.


public class Pattern {
    public static void main(String[] args) {

        int n = 4;

        // Outer loop (rows)
        for (int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ..5..Type Pattten.


// public class Pattern {
//     public static void main(String[] args) {

//         int n = 4;

//         // Outer loop (rows)
//         for (int i = 1; i <=n; i++) {
//             // inner loop
//             for (int j=1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j<= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }