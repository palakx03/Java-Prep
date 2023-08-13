import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        // for(int i = 1; i<=4;i++){
        //     for(int j = 1;j<=10;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

   //     Hollow Rectangle
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i ==n|| j== m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Half Pyramid
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverted Pyramid

        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // for(int i=n;i>=1;i--){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Rotated Pyramid
        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=n-i;j++){          // --> inner loop for space before printing stars
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){              // --> inner loop for stars
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Print Numbers

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        

        //Inverted Numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i =1;i<=n;i++){
        //     for(int j = 1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

            // Floyd's Triangle
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int a=1;
        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(a+" ");
        //         a++;
        //     }System.out.println();
        // }
        // 0-1 Triangle

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
}}


