public class Price
{
  private Burrito b;

  /**
   * @param b
   */
  public Price(Burrito b)
  {
    this.b = b;

  }

  /**
   *
   */
  public double printReceipt()
  {
    double total = 0.0;

    if(!b.isInTact())
    {
      System.out.println("Not sure what burrito you're talkin' about there, pal.");
      System.out.printf("Your total is $%.2f", total);
      System.out.println(" ");
      return total;
    } else {

      if (b.isWrapped())
        total += .5;

      if (b.getMainFilling().equals("chicken"))
        total += 5;
      else if (b.getMainFilling().equals("steak"))
        total += 7;
      else if (b.getMainFilling().equals("pork"))
        total += 6;
      else {
        System.out.println("What did you put in that burrito...?");
        System.out.println(" ");
      }

      if (b.getRice().toLowerCase().equals("brown"))
        total += .5;
      else if (b.getRice().toLowerCase().equals("white"))
        total += .5;

      if (b.getBeans().toLowerCase().equals("black"))
        total += .5;
      else if (b.getBeans().toLowerCase().equals("pinto"))
        total += .5;

      if (b.hasSourCream())
        total += .25;

      if (b.hasCheese())
        total += .25;

      if (b.hasGuac())
        total += 2.78;

      if (b.hasLettuce())
        total += .1;


      System.out.println("Thanks so much for your business.");
      System.out.printf("Your total is $%.2f", total);
      System.out.println(b);

      return total;
    }

  }

}
