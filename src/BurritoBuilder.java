import java.util.Scanner;

/**
 *
 */
public class BurritoBuilder
{
  public static void main(String[] args)
  {

    Scanner user = new Scanner(System.in);

    while(true)
    {
      System.out.println("Welcome to Burrito Builder!");
      System.out.println("Would you like to build a burrito? (y/n)");

      if(user.nextLine().toLowerCase().equals("y") || user.nextLine().toLowerCase().equals("yes"))
      {

        Burrito current = new Burrito();

        System.out.println("Great! Would you like your burrito wrapped? (y/n)");
        String temp = user.nextLine();
        if(temp.equals("y"))
        {
          current.setWrapped(true);
        }
        else if(temp.equals("n"))
        {
          current.setWrapped(false);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("What kind of rice would you like on your burrito? (white/brown/none)");
        temp = user.nextLine();
        if(temp.equals("white"))
        {
          current.setRice("white");
        }
        else if(temp.equals("brown"))
        {
          current.setRice("brown");
        }
        else if(temp.equals("none"))
        {
          current.setRice(null);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("What kind of beans would you like on your burrito? (black/pinto/none)");
        temp = user.nextLine();
        if(temp.equals("black"))
        {
          current.setBeans("black");
        }
        else if(temp.equals("pinto"))
        {
          current.setBeans("pinto");
        }
        else if(temp.equals("none"))
        {
          current.setBeans(null);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("What kind of meat would you like on your burrito? (chicken/steak/pork/none)");
        temp = user.nextLine();
        if (temp.equals("chicken")){
          current.setMainFilling("chicken");
        } else if (temp.equals("steak")){
          current.setMainFilling("steak");
        } else if (temp.equals("pork")){
          current.setMainFilling("pork");
        } else if (temp.equals("none")){
          current.setMainFilling(null);
        } else{
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("Would you like sour cream on your burrito? (y/n)");
        temp = user.nextLine();
        if(temp.equals("y"))
        {
          current.setSourCream(true);
        }
        else if(temp.equals("n"))
        {
          current.setSourCream(false);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("Would you like lettuce on your burrito? (y/n)");
        temp = user.nextLine();
        if(temp.equals("y"))
        {
          current.setLettuce(true);
        }
        else if(temp.equals("n"))
        {
          current.setLettuce(false);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("Would you like guacamole on your burrito? (y/n)");
        temp = user.nextLine();
        if(temp.equals("y"))
        {
          current.setGuac(true);
        }
        else if(temp.equals("n"))
        {
          current.setGuac(false);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("Would you like cheese on your burrito? (y/n)");
        temp = user.nextLine();
        if(temp.equals("y"))
        {
          current.setCheese(true);
        }
        else if(temp.equals("n"))
        {
          current.setCheese(false);
        }
        else
        {
          System.out.println("invalid input");
          System.exit(1);
        }

        System.out.println("Your burrito is almost ready!");

        if (current.isInTact()){

          System.out.println("Calculating total.....");

          System.out.println("Here is your receipt: ");

          Price burritoPrice = new Price(current);
          burritoPrice.printReceipt();

          System.out.println("Enjoy!");
          System.exit(0);
        } else {
          System.out.println("Your burrito is lost :(");
          System.exit(1);
        }
      }
      else
      {
        System.out.println("Okay, maybe next time!");
        System.exit(0);
      }

    }
  }

}
