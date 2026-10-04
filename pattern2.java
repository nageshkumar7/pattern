public class pattern2 {
    
//print hollow trangle


    public static void main(String[] args) {
        int n=10;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if (col==1||col==row||row==n) {
                    System.out.print("* ");
                    
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

