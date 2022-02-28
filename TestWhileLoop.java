public class TestWhileLoop {
    public static void main(String[] args){
        int i1 = 1;
        //int p1 = 0;
        //
        int i2 = 1;
        //int p2 = 0;
        System.out.println("While loop:");
        while (i1<=5){
            //System.out.println("Before increment: i1= " + i1);
            i1++;
            System.out.println("After increment:i1= " + i1);
        }

        System.out.println("\nDo while loop:");
        do{
            //System.out.println("Before increment: i2= " + i2);
            i2++;
            System.out.println("After increment:i2= " + i2);
        }while(i2<=5);
    }
}
