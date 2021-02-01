public class Snake {
   static int k=0;
    public static void main (String args[]) {
        int n=4,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(2*n)-i;j++)   //(2*n)-i  is number columns for each row
            {

                String s = j <= n - i ? (myFunction0()) : (((i % 2) == 1) ? (myFunction()) : (myFunction1()));
            }k+=n;
            System.out.println("");
        }
    }
     public static String myFunction() {
        k++;
                    System.out.print(""+k+" ");
                    return "";
    }
    public static String myFunction0() {
        System.out.print(" ");
        return "";
    }

    public static String myFunction1() {
        System.out.print(""+k+" ");
        k--;
        return "";
    }
}
