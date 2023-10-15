import java.util.Scanner;
public class Characterfrequency {
    public static int findfrequency(String str, char target) {
        int freq=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target){
            freq++;}
        }
            return freq;
    }
       public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a String");
       String input=sc.nextLine();
       System.out.print("Enter the Character you want to search for:");
       char targetc=sc.next().charAt(0);
       int freq=findfrequency(input,targetc);
       System.out.println("The Character"+targetc+"Appears"+freq+"times");
   }
}