/*Name: Kevin Kauffman
Date: 12/08/2019
Class: CSC 160
Program Class: Potion
Description: a class object with three parameters for name count and heal points
 */
public class Potion
{
	@Override
	public String toString( )
	{
		return "["+ name + ", Heals for:" + healPoints + " Points, Total Potions=" + potionCount + "]";
	}
	String name = "Health Potion"; 
	int healPoints = 5;
	int potionCount = 0;
	public Potion(String name, int healPoints, int potionCount)
	{
		super ( );
		this.name = name;
		this.healPoints = healPoints;
		this.potionCount = potionCount;
	}
	 public Potion()
	{
		
	}
	public int getPotionCount( )
	{
		return potionCount;
	}
	public void setPotionCount( int potionCount )
	{
		this.potionCount = potionCount;
	}
	
}
