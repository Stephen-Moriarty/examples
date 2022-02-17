import java.util.Scanner;
public class Examples1 {
    /*
        About this program:
        This program is based off a chart from my geometry class.
        I will keep the name "Examples1" but I would like to name it somthing like "sumVsOne".
        This program probably could've been done with void methods more easily 
        but I was like "nah".
    */

    static Scanner k = new Scanner(System.in);
   public static void main(String[] args){
    boolean wantSum = false;
    //boolean wantOne = false;

    boolean wantIn = false;
    //boolean wantEx = false;
    int n = 0;
    
    System.out.print("Amount of sides your shape has?");
    inputPrompt();
    n = k.nextInt();

    System.out.println("\"true\" means you want, \"false\" means you do NOT want:");
    System.out.print("Want interior sides? (need a type boolean)");
    inputPrompt();
    wantIn = k.nextBoolean();

    System.out.print("Want sum? (need a type boolean)");
    inputPrompt();
    wantSum = k.nextBoolean();
    /*
    If the first thing is false then the entire thing is false 
    so it goes to the next if statement (Keep that in mind)
    */
    if(wantSum && wantIn){
        System.out.println(sumIn(n));
    }else if(wantSum && !wantIn){
        System.out.println(sumEx());
    }else if(wantIn && !wantSum){
        System.out.println(oneIn(n));
    }else{
        System.out.println(oneEx(n));
    }
   }


   public static void inputPrompt(){
       System.out.print("\n>");
   }
    // Sums
    public static int sumIn(int n){
        int interiorSum = 180*(n-2);
        return interiorSum;
    }
    public static int sumEx(){
        return 360; 
    }

    // Ones
    public static int oneIn(int n){
        // oneInSide is short for "one Interior Side"
        int oneInSide = 180*(n-2)/n;
        return oneInSide;
    }
    public static int oneEx(int n){
        int oneExSide = 360/n;
        return oneExSide;
    }

}
