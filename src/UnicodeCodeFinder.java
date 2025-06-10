import java.util.Scanner;

  class UnicodeFinder

{
    public static void main(String [] args)
    {
        System.out.println("Enter your Text Please:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Enter the desired index please:");
        int nm = sc.nextInt();
        System.out.println("The Unicode before the given index " + nm + " is " +text.codePointBefore(nm)) ;
        sc.close();


    }


}
