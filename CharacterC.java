import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*Name: Kevin Kauffman and Michael Boone (re-worked some components for readability and implementation purposes)
/Date: 12/08/2019
/Class: CSC 160
/Program Class: Character Creator 
/class used to create the character, weapon, and potion objects for use throughout the game
*/

public class CharacterC {

		public static void main( String[ ] args )
		{
			Scanner input = new Scanner(System.in);
			int classType =0; // variable to call the proper class attributes for represented class
			Characters chad = new Characters(); // creates the character object
			CharacterC jim = new CharacterC(); // character Creator object
			jim.characterMethod1(input, chad, classType); // call to the character creation method
			chad.printCharacters ( ); 
			Weapon brzDagger = new Weapon();
			brzDagger.setName ("Bronze Dagger");
			brzDagger.setDamage ( 2 );
			Weapon enchBltSwrd = new Weapon();
			enchBltSwrd.setName ( "Enchanted Blunt Sword" );
			enchBltSwrd.setDamage ( 5 );
			Weapon brzSwrd = new Weapon();
			brzSwrd.setName ( "Bronze Sword" );
			brzSwrd.setDamage ( 3 );
			Weapon bnDag = new Weapon();
			bnDag.setName ( "Bone Dagger" );
			bnDag.setDamage ( 2 );
			Weapon irLngSwrd = new Weapon();
			irLngSwrd.setName ( "Iron Long Sword" );
			irLngSwrd.setDamage ( 6 );
			Weapon irDag = new Weapon();
			irDag.setName ( "Iron Dagger" );
			irDag.setDamage ( 4 );
			Weapon irFl = new Weapon();
			irFl.setName ( "Iron Flail" );
			irFl.setDamage ( 5 );
			Weapon bltIrSwrd = new Weapon();
			bltIrSwrd.setName ( "Blunt iron Sword" );
			bltIrSwrd.setDamage ( 4 );
			Weapon enchStlBrdSwrd = new Weapon();
			enchStlBrdSwrd.setName ( "Enchanted Steel Broad Sword" );
			enchStlBrdSwrd.setDamage ( 9 );
			Weapon stlLnc = new Weapon();
			stlLnc.setName ( "Steel Lance" );
			stlLnc.setDamage ( 6 );
			jim.characterMethod1(input, chad, classType); // call to the character creation method
			chad.printCharacters ( ); 
			Potion hPot = new Potion();
			foundPotion(chad, hPot);
			addPotion(hPot);
			addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
			addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
			System.out.println ( chad.playerInventory );
			equipWeapon(input, chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc, hPot);
			chad.toString ( );
			System.out.println ( "Program End" );
			

		}
		/*Name: Kevin Kauffman
Method: addPotion 
Description: method called to increment the potion objects count by +1
Return type: void
		 * 
		 */
		public static void addPotion( Potion hPot) {
			int countHold = hPot.getPotionCount ( );
			hPot.setPotionCount (countHold +1 );
			countHold = hPot.getPotionCount ( );
			System.out.println ( "You now have:"+countHold+ " potions ");
		}
		/*
		 * Name: Kevin Kauffman
Method: usePotion use potion Method
Description: method called to decrement potion count by 1 and incrments the characters vitality attribute by the set amount
Return type: void
		 */
		public static void usePotion(Potion hPot, Characters chad) {
			int countHold = hPot.getPotionCount ( );
			if(countHold>0) {
				hPot.setPotionCount ( countHold -1);
				countHold = hPot.getPotionCount ( );
				chad.setVitality ( chad.vitality + hPot.healPoints);
				System.out.println ( "You used a health potion, "+chad.getName ( )+"'s health is now "+chad.getVitality ( ) );
			}
			else {
				System.out.println("You have no potions left");
			}
			
		}
		/*
		 * Name: Kevin Kauffman
Method: foundPotion
Description: method called to add the potion to the character objects inventory at index 0
Return type: void
		 */
		public static void foundPotion(Characters chad, Potion hPot) {
			chad.playerInventory.add (0, hPot);
		}
		/*
		Name: Kevin Kauffman
Method: equipWeapon
Description: method called to take a weapon object from the character's inventory and equip it to the character
Return type: void
		 */
		public static void equipWeapon(Scanner input, Characters chad, Weapon brzDagger, Weapon enchBltSwrd, Weapon brzSwrd, Weapon bnDag, Weapon irLngSwrd, Weapon irDag, Weapon irFl, Weapon bltIrSwrd, Weapon enchStlBrdSwrd, Weapon stlLnc, Potion hPot) {
			if(chad.getWeaponName ( )==null) {
				System.out.println ( "No current Weapon" );
			}
			else {
				System.out.println ( "Your Current  Weapon is: "+chad.getWeaponName ( ));
			}
			System.out.println ( chad.getName()+"'s Inventory: "+chad.getPlayerInventory ( ) );
			System.out.println ( "Change Current Equip Weapon to one in your Inventory, enter Y for yes or N for no" );
			String equipCh = input.next ( );
			if(equipCh.equalsIgnoreCase ( "y")|| equipCh.equalsIgnoreCase ( "yes" )) {
				for(int i =0;i<chad.playerInventory.size ( );i++) {
					int c = i+1;
					System.out.print (c+": "+chad.playerInventory.get ( i )+"  "  );
				}
				System.out.println ( "\n Enter the number of the Weapon you wish to equip" );
				int weaponChoice = input.nextInt ( );
				if(chad.playerInventory.contains ( hPot  )) {
					chad.setWeaponName ( chad.playerWeapsName.get ( weaponChoice-2 ) );
					chad.setWeaponDamage ( chad.playerWeapsDmg.get ( weaponChoice-2 ) );
					chad.playerInventory.remove ( weaponChoice-1 );
					chad.playerWeapsName.remove ( weaponChoice -2 );
					chad.playerWeapsDmg.remove ( weaponChoice -2 );	
				}
				else {
					chad.setWeaponName ( chad.playerWeapsName.get ( weaponChoice-1 ) );
					chad.setWeaponDamage ( chad.playerWeapsDmg.get ( weaponChoice-1 ) );
					chad.playerInventory.remove ( weaponChoice-1 );
					chad.playerWeapsName.remove ( weaponChoice -1 );
					chad.playerWeapsDmg.remove ( weaponChoice -1 );
				}
				System.out.println ( "You equipped "+chad.getWeaponName ( )+" its attack is: "+chad.getWeaponDamage ( ) );
				System.out.println ( chad.getPlayerInventory ( ) );
			}
		}
		/*
		 * 
		Name: Kevin Kauffman
Method: addWeapon
Description: method called to add a weapon to the characters inventory and store it
Return type: void
		 */
		public static void addWeapon(Characters chad, Weapon brzDagger, Weapon enchBltSwrd, Weapon brzSwrd, Weapon bnDag, Weapon irLngSwrd, Weapon irDag, Weapon irFl, Weapon bltIrSwrd, Weapon enchStlBrdSwrd, Weapon stlLnc ) {
			int randWeap = (int)(Math.random ()*10+1);
			switch(randWeap) {
				case 1:
					chad.playerInventory.add ( brzDagger );
					chad.playerWeapsName.add ( brzDagger.name );
					chad.playerWeapsDmg.add ( brzDagger.damage );
					break;
				case 2:
					chad.playerInventory.add ( enchBltSwrd );
					chad.playerWeapsName.add ( enchBltSwrd.name );
					chad.playerWeapsDmg.add ( enchBltSwrd.damage );
					break;
				case 3:
					chad.playerInventory.add ( brzSwrd );
					chad.playerWeapsName.add ( brzSwrd.name );
					chad.playerWeapsDmg.add ( brzSwrd.damage );
					break;
				case 4:
					chad.playerInventory.add ( bnDag );
					chad.playerWeapsName.add ( bnDag.name );
					chad.playerWeapsDmg.add ( bnDag.damage );
					break;
				case 5:
					chad.playerInventory.add ( irLngSwrd );
					chad.playerWeapsName.add ( irLngSwrd.name );
					chad.playerWeapsDmg.add ( irLngSwrd.damage );
					break;
				case 6:
					chad.playerInventory.add ( irDag );
					chad.playerWeapsName.add ( irDag.name );
					chad.playerWeapsDmg.add ( irDag.damage );
					break;
				case 7:
					chad.playerInventory.add ( irFl );
					chad.playerWeapsName.add ( irFl.name );
					chad.playerWeapsDmg.add ( irFl.damage );
					break;
				case 8:
					chad.playerInventory.add ( bltIrSwrd );
					chad.playerWeapsName.add ( bltIrSwrd.name );
					chad.playerWeapsDmg.add ( bltIrSwrd.damage );
					break;
				case 9:
					chad.playerInventory.add ( enchStlBrdSwrd );
					chad.playerWeapsName.add ( enchStlBrdSwrd.name );
					chad.playerWeapsDmg.add ( enchStlBrdSwrd.damage );
					break;
				case 10:
					chad.playerInventory.add ( stlLnc );
					chad.playerWeapsName.add ( stlLnc.name );
					chad.playerWeapsDmg.add ( stlLnc.damage );
					break;
					
			
			}
		}
					
		/*
		 * Name: Kevin Kauffman
Method: foundPotion
Description: method called to add the potion to the character objects inventory at index 0
Return type: void
		 */
		public  void characterMethod1(Scanner input, Characters chad, int classType) 
		{
			int nS = 0;
			int nV = 0;
			int nD = 0;
			int nW = 0;
			int freePoints = 5;
			int pointsUse;
			System.out.println ( "Welcome to character creation" );
			System.out.println ( "Enter your characters name" );
			String name = input.nextLine ();
			chad.setName(name);
			System.out.println ( "Choose your characters class, *Choose 1, 2, or 3*" );
			System.out.println("1. Knight");
			System.out.println("2. Mage");
			System.out.println("3. Thief");
			int type = 0;
			int number = 0;
				type = input.nextInt ();
			
				if (type == 1) {
					number = 1;
					chad.setClassType("Knight");
				}
				else if (type == 2) {
					number = 2;
					chad.setClassType("Mage");
				}
				else if (type == 3) {
					number = 3;
					chad.setClassType("Thief");
				}
				else {
					System.out.println("Invalid entry, try again.");
				}
		
			
				if (number == 1)
				{
					nS = 6;
					nV = 6;
					nD = 4;
					nW = 2;
					chad.setStrength(nS);
					chad.setVitality(nV);
					chad.setDexterity(nD);
					chad.setWisdom(nW);
					System.out.println(number);
				}
				else if (number == 2)
				{
					nS = 3;
					nV = 3;
					nD = 5;
					nW = 6;
					chad.setStrength(nS);
					chad.setVitality(nV);
					chad.setDexterity(nD);
					chad.setWisdom(nW);
					System.out.println(number);
				}
				else //(number == 3)
				{
					nS = 4;
					nV = 5;
					nD = 6;
					nW = 3;
					chad.setStrength(nS);
					chad.setVitality(nV);
					chad.setDexterity(nD);
					chad.setWisdom(nW);
				}

				int inc =0;
				System.out.println ("Your character has " + freePoints + " more points that need assigned");
				System.out.println("Strength, Vitality, Dexterity, Wisdom");
				
				while (freePoints > 0)
				{
					System.out.println("Which one would you like to increase?");
					String choice = input.nextLine ();
						
					if(choice.equalsIgnoreCase ( "Strength" ) || choice.equalsIgnoreCase ( "Vitality" ) || choice.equalsIgnoreCase ("Dexterity") || choice.equalsIgnoreCase ("Wisdom")) 
					{
					
						if (choice.equalsIgnoreCase( "Strength" ) )
						{
							System.out.println("How much would you like to increase by?");
							inc = input.nextInt();
							nS = chad.getStrength();
							chad.setStrength((nS + inc));
							System.out.println("Total strength is now: " + chad.getStrength());
							freePoints = freePoints - inc;
						}
						else if (choice.equalsIgnoreCase ( "Vitality" ))
						{
							System.out.println("How much would you like to increase by?");
							inc = input.nextInt();
							nV = chad.getVitality();
							chad.setVitality((nV + inc));
							System.out.println("Total vitality is now: " + chad.getVitality());
							freePoints = freePoints - inc;
						}
						else if (choice.equalsIgnoreCase ("Dexterity"))
						{
							System.out.println("How much would you like to increase by?");
							inc = input.nextInt();
							nD = chad.getDexterity();
							chad.setDexterity((nD + inc));
							System.out.println("Total dexterity is now: " + chad.getDexterity());
							freePoints = freePoints - inc;
						}
						else if (choice.equalsIgnoreCase ("Wisdom"))
						{
							System.out.println("How much would you like to increase by?");
							inc = input.nextInt();
							nW = chad.getWisdom();
							chad.setWisdom((nW + inc));
							System.out.println("Total wisdom is now: " + chad.getWisdom());
							freePoints = freePoints - inc;
						}
						
						else {
							System.out.println("Invalid Entry");
						}
				}			
		}
				
			
			System.out.println("");
			System.out.println ( "All free attribute points are assigned" );
			System.out.println ( "Your characters Attributes are: " );
			System.out.println("");
			System.out.println ( "Strength: "+chad.getStrength());
			System.out.println ( "Vitality: "+chad.getVitality());
			System.out.println ( "Dexterity: "+chad.getDexterity());
			System.out.println ( "Wisdom: "+chad.getWisdom());
			
		}
	}

