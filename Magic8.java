public class Magic8 {

//create random number
  static int number= (int)(Math.random() * 8);

  public static void main(String[] args) {
    
 //tell fortune/piece of work
    switch(number) {
      
      case 0:
      System.out.println("Your badluck");
      break;
      case 1:
      System.out.println("Good time come");
      break;
      case 2:
      System.out.println("You get a good patner");
      break;
      case 3:
      System.out.println("you have good luck");
      break;
      case 4:
      System.out.println("you win match");
      break;
      case 5:
      System.out.println("you met favourite person today");
      break;
      case 6:
      System.out.println("time is not good ");
      break;
      case 7:
      System.out.println("save money");
      break;
      default: 
      System.out.println("work hard");
      break;
    }
  }
}