import java.util.*;
public class AdvancedPatterns {
    public static void main(String[] args) {
        //Butterfly
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // Upper Half
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){            //stars 1st half
                System.out.print("*");
            }
            int spaces = 2*(n-i);               //spaces 
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for(int i=n;i>=1;i--){
            for(int j = 1;j<=i;j++){            //stars 1st half
                System.out.print("*");
            }
            int spaces = 2*(n-i);               //spaces 
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            // Solid Rhombus
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     int spaces =n-i;
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Number Pyramid
        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     int spaces = n-i;
        //     for(int j =1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2/*1*/;j<=i;j++){
        //         System.out.print(j);
        //     }
            
        //     System.out.println();
        // }
        

        // Diamond Pattern

        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        //     //Upper half
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" " );
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for( int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // Lower half
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" " );
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for( int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
    }}

