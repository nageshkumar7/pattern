// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int row = 1; row<=n;row++){
//             for(int col=1;col<=4;col++){

//             System.out.print("* ");
//         }
//         System.out.println();
//      }
//    }
// }
// import java.util.Scanner;
// public class Pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number you want to make a pattern:");
//         int n = sc.nextInt();
//         for(int row=1;row<=n;row++){
//             for(int col = 1;col<=n;col++){
//                 System.out.print("* ");
//             }
//               System.out.println();
//         }
//     }
// }

//Solid Right-Angle Triangle Pattern

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 10;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//user input
// import java.util.*;
// public class Pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//Inverted Right-Angle Triangle Pattern

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int row=1;row<=n;row++){
//             for(int col=0;col<=n-row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//taking user input
// import java.util.*;
// public class Pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         for(int row=1;row<n;row++){
//             for(int col=0;col<=n-row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
        // public class Pattern {
        
        //     public static void main(String[] args) {
        //         int n =5;
        //         for(int row = 1; row<=n; row++){ 

        //             //print space
                    
        //             for(int col = 1; col<=n-row; col++){
        //                 System.out.print("   ");
        //             }
        //             //print stars

        //             for(int col=1;col<=n;col++){
        //                 System.out.print("* ");
        //             }
        //             System.out.println();
        //         }
        //     }
        // }
        // import java.util.*;
        // public class Pattern {
        
        //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
        //         System.out.println("Enter a number:");
        //         int n = sc.nextInt();
        //         for(int row=1;row<=n;row++){
        //             for(int col = 1; col <=n-row;col++){
        //                 System.out.print("  ");
        //                 for(col=1;col<=n;col++){
        //                     System.out.print("* ");
        //                 }
        //                 System.out.println();

        //             }
        //         }
        //     }
        
          
    //     public class Pattern {
        
    //         public static void main(String[] args) {
    //             int n =5;
    //             for(int row=1;row<=n;row++){
    //                 for(int col=1;col<=n-row;col++){
    //                     System.out.print("  ");
    //                 }
    //                 for(int col =1;col<=2*row-1;col++){
    //                     System.out.print("* ");                    
    //             }
    //             System.out.println();
    //         }
    //     }  
    // }  
    // import java.util.*;
    // public class Pattern {
    
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter a number:");
    //         int n = sc.nextInt();
    //         for(int row=1;row<=n;row++){
    //             for(int col=1;col<=n-row;col++){
    //                 System.out.print("  ");
    //             }
    //             for(int col=1;col<=2*row-1;col++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    // public class Pattern {
    
    //     public static void main(String[] args) {
    //         int n = 5;
    //         for(int row =1;row<=n;row++){
    //             //for space
    //             for(int col =1;col<=row-1;col++ ){
    //                 System.out.print("  ");

    //             }
    //             //for stars
    //             for(int col=1;col<=2*n-2*row+1;col++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    
    // public class Pattern{
    //     public static void main(String[] args) {
    //         int n = 11;
    //         for(int row=1;row<=n;row++){
    //             //for space
    //             for(int col=1;col<=row-1;col++){
    //                 System.out.print("  ");
    //             }
    //             //for stars
    //             for(int col=1;col<=2*n - 2*row;col++){
    //                 System.out.print("* ");
    //             }
    //             //move to next line
    //             System.out.println( );
    //         } 
    //     }
    // }

    // public class Pattern{
    //     public static void main (String[]args){
    //         int n=4;
    //         for(int row = 1;row<=n;row ++){
    //             //for each row 6 columns
    //             for(int col=1;col<=6;col++){
    //                 if(row==1||row==n){
    //                     System.out.print("* ");
    //                 }
    //             else if (col==1||col==6) {
    //                 System.out.print("* ");
    //             }
    //                 //middle row
                    
                       
    //                 else{
    //                     //middle columns
    //                     System.out.print( "  ");
                    
    //                 }
                    
    //             }
    //             System.out.println();
    //         }
            
    //     }
    // }


    // import java.util.*;
    // public class Pattern{
    //     public static void main (String []args){
    //         Scanner sc = new Scanner (System.in);
    //         System.out.println("Enter a number:");
    //         int n=sc.nextInt();
            
    //         for(int row=1;row<=n;row++){
    //             for(int col=1;col<=n;col++){
    //                 if (row==1||row==n||col==1||col==n) {
    //                     System.out.print("* ");
                        
    //                 }
    //                 else{
    //                     System.out.print("  ");
    //                 }

    //             }
    //             System.out.println();
    //         }
    //         sc.close();
    //     }
    // }

    // public class Pattern {
    
    //     public static void main(String[] args) {
    //         int n = 5;
    //         //Upper half
    //         for(int row=1;row<=n;row++){
    //             //space
    //             for(int col=1;col<=n-row;col++){
    //                 System.out.print("  ");
    //             }
    //             //stars
    //             for(int col =1;col<=2*row-1;col++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
        
    //         //Lower half
    //         for(int row=n-1;row>=1;row--){
    //             //space
    //             for(int col=1; col<=n-row;col++){
    //                 System.out.print("  ");
    //             }
    //             //stars
    //             for(int col=1;col<=2*row-1;col++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }


    // public class Pattern{
    //     public static void main(String[] args) {
    //         int n=5;
    //         for(int row=1;row<=n;row++){
    //             for(int col=1;col<=row;col++){
    //                System.out.print("* "); 
    //             }
    //             System.out.println();
    //         } 
    //     }
    // }


    // import java.util.*;
    // public class Pattern {
    
    //     public static void main(String[] args) {
    //         Scanner sc= new Scanner (System.in);
    //         System.out.println("Enter a number:");
    //         int n = sc.nextInt();
    //         for(int row=1;row<=n;row++){
    //             for(int col=1;col<=row;col++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

    //Hollow Triangle

//     public class Pattern {
    
//         public static void main(String[] args) {
//             int n=10;
//             for(int row=1;row<=n;row++){
//                 for(int col=1;col<=row;col++){
                    
//                     if (col==1||col==row||row==n) {
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             } 
//                 System.out.println();
//         }
//      }
// }
//    import java.util.*;
//    public class Pattern {
   
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 if (col==1||col==row||row==n) {
//                     System.out.print("* ");
                    
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//    }

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int row=1;row<=n;row++){
//             //part 1
//             for(int col=1;col<n-row;col++){
//                 System.out.print("  ");
//             }
//             //part2
//             if (row==1||row==n) {
//             for(int col=1;col<=2*row-3;col++){
//                 System.out.print("* ");
//             }
//               }
//               else{
//                 //middle row
//                 //1*
//                 System.out.print("* ");
//               }
//               //2r-3 space
//               for(int col=1;col<=2*row-3;col++){
//                 System.out.print("  ");
//               }
//               System.out.print("* ");
//               System.out.println();
            
//         }
        
//     }
    
// }


//from basics

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=n-row+1;col++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print(col);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print(row);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=15; 
//         for(int row=1;row<=n;row++){
//             for(int col = n-row+1; col>=1;col--){
//                 System.out.print(col);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         int num=1;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=15;
//         for(int row=1;row<=n;row++){
//             //space print
//             for(int col=1;col<=n-row;col++){
//                 System.out.print(" ");
//             }
//             //star print
//             for(int col=1;col<=row;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row =1;row<=n;row++){
//             for(int col=1;col<=n-row;col++){
//                 System.out.print("  ");
//             }
//             //print stars
//             for(int col=1;col<=2*row-1;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Pattern {

//     public static void main(String[] args) {
//         int n =5; 
//         for(int row=1;row<=n;row++){
//             //print spaces
//             for(int col=1;col<=row-1;col++){
//                 System.out.print("  ");
//             }
//             //print stars
//             for(int col=1;col<=2*(n-row)+1;col++){
//                 System.out.print("* ");
//             }
            
//             System.out.println();
//         }
        
//     }
// }
//error hai is code me baad me thik karna hai
//print dimond
// public class Pattern {

//     public static void main(String[] args) {
//         int n=4;
//         //upper half
//         for(int row=1;row<=n;row++){
//             //space
//             for(int col=1;col<=n-row;col++){
//                 System.out.print("  ");
//             }
//             //stars
//             for(int col=1;col<=2*row-1;col++){
//                 System.out.print("* ");
//             }
//             //lower half
//             for(int row =1;row<=n-1;row++){
//                 //spaces
//                 for(int col=1;col<=row;col++){
//                     System.out.print("  ");
//                 }
//                 //stars
//                 for(int col=1;col<=2*(n-row)-1;col++){
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

//error hai is code me baad me thik karna hai
// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int ro=1;row<=n;row++){
//             for(int col=1;col<=n;col++){
//                 if (row==1||row==n||col==1||col==n) {
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//         }

//     }
// }

//print hollow trangle
// public class Pattern {

//     public static void main(String[] args) {
//         int n=10;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 if (col==1||col==row||row==n) {
//                     System.out.print("* ");
                    
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             //part1
//             for(int col=1;col<=n-row;col++){
//                 System.out.print(" ");
//             }
//             //part2
//             for(int col=1;col<=row;col++){
//                 System.out.print(col);
//             }
//             //part3
//             for(int col=1;col<=row-1;col++){
//                 System.out.print(row-col);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int row=1;row<=n;row++){
//             //print space
//             for(int col=1;col<=n-row;col++){
//                 System.out.print("  ");
//             }
//             //pyramid position
//             for(int col=1;col<=2*row-1;col++){
//                 if (col==1||col==2*row-1||row==n) {
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
// }

//user input

// import java.util.*;
// public class Pattern {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();

//         for(int row=1;row<=n;row++){
//             //space
//             for(int col=1;col<=n-row;col++){
//                 System.out.print("  ");

//             }
//             for(int col=1;col<=2*row-1;col++){
//                 if (col==1||col==2*row-1||row==n) {
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//BUTTERFLY PATTERN

import java.util.*; 

public class Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        //UPPER HALF
        for(int row=1;row<=n;row++){
            //LEFT STARS
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            //MIDDLE SPACES
            for(int col=1;col<=2*(n-row);col++){
                System.out.print("  ");
            }
            //RIGHT STARS
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println(); 
           
            
        }
         //LOWER HALF
            for( int row=1;row<=n-1;row++){
                //LEFT STARS
                for(int col=1;col<=n-row;col++){
                    System.out.print("* ");
                }
                //MIDDLE SPACE
                for(int col=1;col<=2*row;col++){
                    System.out.print("  ");
                }
                //RIGHT STARS
                for(int col=1;col<=n-row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            sc.close();
    }
}


        
    
