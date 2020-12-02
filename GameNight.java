import java.util.*;
class GameNight
{
   public static void main(String[] args)
   {
   
   Scanner scan1 = new Scanner(System.in);  // Create a Scanner object
   System.out.println("Enter the number of people in the game:(1<=n<=10^5)");
   int numberOfPeople = scan1.nextInt();
   
   Scanner scan2 = new Scanner(System.in);  // Create a Scanner object
   System.out.println("Enter the string of groups");
   String string = scan2.nextLine();
   
    String[] groupsArray = string.split("");
    int[] indexA;
    int[] indexB;
    int[] indexC;
    for (int i = 0; i<groupsArray.length; i++){
      if(groupsArray[i] == "A"){
      indexA[0]= i;
      
    /*  if(groupsArray[i] == "B"){
      indexB[]= i;
      
      if(groupsArray[i] == "C"){
      indexC[]= i;
      
      */
      
}}
  
   
   
   
   }}