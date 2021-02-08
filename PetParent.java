class PetParent
{
  public String name;
  public boolenan hasHair
  public String color;
  public int cuteness;
  public double fiendliness;

  public PetParent(String name,boo hasHair,String color,int cuteness, double fiendliness)
  {
    this.name = name;
    this.hasHair = hasHair;
    this.color = color;
    this.cuteness = cuteness;
    this.fiendliness = fiendliness;
  }

  public String toString()
  {
    return "Name ="+name+
            "\nhasHair =" + hasHair +
            "\ncolor =" + color+
  }
}