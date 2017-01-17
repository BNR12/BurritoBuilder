public class Burrito
{
  private boolean wrapped;
  private String mainFilling;
  private String rice;
  private String beans;
  private boolean sourCream;
  private boolean lettuce;
  private boolean guac;
  private boolean cheese;
  private boolean inTact;

  /**
   *
   */
  public Burrito()
  {
    this.wrapped = false;
    this.mainFilling = null;
    this.rice = null;
    this.beans = null;
    this.sourCream = false;
    this.lettuce = false;
    this.guac = false;
    this.cheese = false;
    this.inTact = true;
    this.inTact = true;
  }

  /**
   *
   * @param wrapped
   * @param mainFilling
   * @param rice
   * @param beans
   * @param sourCream
   * @param lettuce
   * @param guac
   * @param cheese
   */
  public Burrito(boolean wrapped, String mainFilling, String rice, String beans, boolean sourCream, boolean lettuce, boolean guac, boolean cheese)
  {
    this.wrapped = wrapped;
    this.mainFilling = mainFilling;
    this.rice = rice;
    this.beans = beans;
    this.sourCream = sourCream;
    this.lettuce = lettuce;
    this.guac = guac;
    this.cheese = cheese;
    this.inTact = true;

  }

  /**
   *
   */
  public void eatBurrito()
  {
    if(this.inTact)
    {
      this.inTact = false;
      System.out.println("What a delicious and nutritious meal! :D ");
    }
    else
      System.out.println("Sorry, this burrito is gone :'( ");
  }

  /**
   *
   * @return
   */
  public boolean isInTact()
  {
    return inTact;
  }

  /**
   *
   * @param inTact
   */
  public void setInTact(boolean inTact)
  {
    this.inTact = inTact;
  }

  /**
   *
   * @return
   */
  public boolean isWrapped()
  {
    return wrapped;
  }

  /**
   *
   * @param wrapped
   */
  public void setWrapped(boolean wrapped)
  {
    this.wrapped = wrapped;
  }

  /**
   *
   * @return
   */
  public String getMainFilling()
  {
    return mainFilling;
  }

  /**
   *
   * @param mainFilling
   */
  public void setMainFilling(String mainFilling)
  {
    this.mainFilling = mainFilling;
  }

  /**
   *
   * @return
   */
  public String getRice()
  {
    return rice;
  }

  /**
   *
   * @param rice
   */
  public void setRice(String rice)
  {
    this.rice = rice;
  }

  /**
   *
   * @return
   */
  public String getBeans()
  {
    return beans;
  }

  /**
   *
   * @param beans
   */
  public void setBeans(String beans)
  {
    this.beans = beans;
  }

  /**
   *
   * @return
   */
  public boolean hasSourCream()
  {
    return sourCream;
  }

  /**
   *
   * @param sourCream
   */
  public void setSourCream(boolean sourCream)
  {
    this.sourCream = sourCream;
  }

  /**
   *
   * @return
   */
  public boolean hasLettuce()
  {
    return lettuce;
  }

  /**
   *
   * @param lettuce
   */
  public void setLettuce(boolean lettuce)
  {
    this.lettuce = lettuce;
  }

  /**
   *
   * @return
   */
  public boolean hasGuac()
  {
    return guac;
  }

  /**
   *
   * @param guac
   */
  public void setGuac(boolean guac)
  {
    this.guac = guac;
  }

  /**
   *
   * @return
   */
  public boolean hasCheese()
  {
    return cheese;
  }

  /**
   *
   * @param cheese
   */
  public void setCheese(boolean cheese)
  {
    this.cheese = cheese;
  }

  /**
   *
   * @return
   */
  @Override
  public String toString()
  {
    return "Burrito{" +
        "wrapped=" + wrapped +
        ", mainFilling='" + mainFilling + '\'' +
        ", rice='" + rice + '\'' +
        ", beans='" + beans + '\'' +
        ", sourCream=" + sourCream +
        ", lettuce=" + lettuce +
        ", guac=" + guac +
        ", cheese=" + cheese +
        ", inTact=" + inTact +
        '}';
  }

  /**
   *
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o)
  {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;

    Burrito burrito = (Burrito) o;

    if(wrapped != burrito.wrapped) return false;
    if(sourCream != burrito.sourCream) return false;
    if(lettuce != burrito.lettuce) return false;
    if(guac != burrito.guac) return false;
    if(cheese != burrito.cheese) return false;
    if(mainFilling != null ? !mainFilling.equals(burrito.mainFilling) : burrito.mainFilling != null) return false;
    if(rice != null ? !rice.equals(burrito.rice) : burrito.rice != null) return false;
    return beans != null ? beans.equals(burrito.beans) : burrito.beans == null;

  }


}
