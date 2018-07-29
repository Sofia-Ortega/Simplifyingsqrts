import java.util.Scanner;


public class Testing {
  public static final Scanner CONSOLE = new Scanner(System.in);
  //====================================DIVIDERFINDER==============================
  public static int dividerFinder(int userNum){
    int divider = 1;
    int returnDivider = 1;
    int factor = 1;
    
    //Gets first multiple ( not 1 and userNum )
    while ( divider <= userNum && divider <= factor && divider != -100 ){
      factor = userNum / divider;
      
      if ( (factor * divider) == userNum && divider > 1 ) { 
        //System.out.println(factor + "\t" + divider);
        returnDivider = divider;
        divider = -100;
      }
      
      divider = divider + 1; 
    }
    
    return returnDivider;
    
    
  }
  
//====================================FACTOR FINDER==========================
/*
public static void factoring(int x){
    int y;
  
    for(int i=x; i >1; i = i -1){
   y = x % i;
      if ( y == 0){
       System.out.println(i);
      }
   }
 }
my factoring program. needs to be updated with variables but is short
*/
  public static int factorFinder(int userNum){
    int divider = 1;
    int factor = 1;
    int returnFactor = 1;
    
    //Gets first multiple ( not 1 and userNum )
    while ( divider <= userNum && divider <= factor && divider != -100 ){
      factor = userNum / divider;
      
      if ( (factor * divider) == userNum && divider > 1 ) { 
        //System.out.println(factor + "\t" + divider);
        returnFactor = factor;
        divider = -100;
      }
      
      divider = divider + 1; 
    }
    
    return returnFactor;
    
    
  }
    
  //=======================================MAIN====================================
  
  public static void main ( String [] args){

    System.out.println("Prompt: ");
    int userNum = CONSOLE.nextInt();
   
    System.out.println("dividerFinder: " + dividerFinder(userNum));
    System.out.println("factorFinder: " + factorFinder(userNum) + "\n");
     
    
  }
}





/*
 * int divider = 1;
    int factor = 1;
        
    //Gets first multiple ( not 1 and userNum )
    while ( divider <= userNum && divider <= factor && divider != -100 ){
      factor = userNum / divider;
      if ( (factor * divider) == userNum && divider > 1 ) { 
        System.out.println(factor + "\t" + divider);
        divider = -100;
      }
      divider = divider + 1; 
    }
    
 */
