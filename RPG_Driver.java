// Names: Nathan M, Esme Holden, Michael Boone

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class RPG_Driver {
	/* Name: bandit
	 * Author: Michael Boone
	 * Params: none
	 * Return: void
	 * Description: Adds visual for some fights, more monsters to come!
	 */
	public static void bandit() {
		System.out.println("          ________          ");
		System.out.println("         /        /   ");
		System.out.println("       ^|  | | | |^");
		System.out.println("       P --   --  P");
		System.out.println("      P   *   *   P         /|");
		System.out.println("      $$$$$$$$$$$$$        / |");
		System.out.println("        $$$$$$$$$         /  |");
		System.out.println("          $$$$$           |  |");
		System.out.println("          |$$$|           |  |");
		System.out.println("   [------  $    ------]  |  |");
		System.out.println("   |                  |   |  |");
		System.out.println("   |  |            |  |   |  |");
		System.out.println("   |  |            |  |  _|  |_");
		System.out.println("   |  |            |  |___ ||     ");
		System.out.println("   |  |            |_______||) ");
		System.out.println("   |  |           | ");
		System.out.println("   8888___________| ");
		System.out.println("      |      $    | ");
		System.out.println("      |-----------| ");
	}
	/* name: characterMethod1
	 * Author: Kevin Kauffman
	 * Params: input, chad, class type
	 * return: void
	 * Description: Method called to initialize character object. 
	 */
	public  void characterMethod1(Scanner input, Characters chad, int classType) 
	{
		int freePoints = 5;
		int pointsUse;
		System.out.println ( "Welcome to character creation" );
		System.out.println ( "Enter your characters name" );
		chad.name = input.nextLine ();
		System.out.println ( "Choose your characters class, *Type character class*" );
		System.out.println ( "1. Knight 2. Mage 3. Thief" );
		chad.classType= input.next ();
		if(chad.classType.equalsIgnoreCase ( "Knight" ) || chad.classType.equalsIgnoreCase ( "Mage" ) || chad.classType.equalsIgnoreCase ("Thief") ) 
		{
		
			if (chad.classType.equalsIgnoreCase( "Knight" ))
			{
				
				System.out.println("You Choose the Knight class.");
				System.out.println("Growing up, I came to know hard work.");
				System.out.println("My father, comander and chief in the town of Oozzengwentch, trained me since I was a young boy.");
				System.out.println("I remember as a child I had spent countless hours grinding through gruling training.");
				System.out.println("I would aften fall to my knees only to be ordered by my commander: ");
				System.out.println("Stand up soildier! Do you admit Defeat?! Do not accept your own mercy, stand on your feet and stare into the heart of your fellow warrior!");
			    System.out.println("Struggling to stand up, I face my father after being beat to a pulp. ");
				System.out.println("After a day of wretched rainfall fighting my father in a steamy pit of mud, grime and blood, I looked over my shoulder only to see the other kids playing across the court yard.");
				System.out.println("Distracted, my father calls out to me: stand sharp soildier!");
				System.out.println("Caught off guard, I looked in the eyes of my father after daydreaming to be free and loved like the other children and said: ");
				System.out.println("I love you Dad. <3 .");
				System.out.println("A warrior does not submit to murcy in the eyes of their enemy. to admit murcy is to admit defeat. He said");
				System.out.println("Your love means nothing to the heart of your oponnent. Instead, feel the fire in your gut and strike me!");
				System.out.println("I respond with anger and said: why can't I have no care in the world and enjoy myself like all the other kids?");
				System.out.println("Because it is the honor of the warrior to continue for the prosperity of others. He said with a grim disapointed look.");
				System.out.println("Stand up, Lets go again!!! He said.");
				System.out.println("********************************************************************************************************************************************************************************************");
				System.out.println("");

				
			}
			else if (chad.classType.contentEquals ( "Mage" ))
			{
				System.out.println("You choose the Mage class.");
				System.out.println("As a child, I've always craved the thurst for knowledge.");
				System.out.println("I spent many of my days as a kid reading books and absorbing information.");
				System.out.println("I often sold anything I had, trading my food for book on the constant search for something with profound meaning.");
				System.out.println("It wasn't until my years as a young adult and an apprentice that I became self aware with the identity of the world and how Oricle defined itself within all of us.");
				System.out.println("One day, a scragaly old man approuched me as I was reading under an oak tree consintrating my feelings of bliss and purity.");
				System.out.println("I looked up and requested his intentions and he perseeded with the words that would forever change my life");
				System.out.println("I can sense that you do not know what is true and what is false to the understanding of your identity . To precieve our posision in reality is to harness your energy of being. Tell me young one, do you long for meaning?");
				System.out.println("I paused for a moment to comprehend the obsurdity of possibility and looked back at the man, eyes filled with ambition and said: ");
				System.out.println("I want to learn and to understand reality and the meaning of life, what is truly possible and what could be possible. I want to become something magnificiant and and dive into the unknown.");
				System.out.println("The old man smilled at me and a began in a soft tone: ");
				System.out.println("I thought you'd say that, come follow me.");
				System.out.println("Years have passed and I've come to accept the limitations of ones mind and since then. I've grown, now I know who I am.");
				System.out.println("***************************************************************************************************************************************************************************************************************************************");
				System.out.println("");

			}
			else if (chad.classType.contentEquals ( "Thief" ))
			{
				System.out.println("You chose the Thief class.");
				System.out.println("Growing up, I endured a life of lies.");
				System.out.println("When I was born, my mother died. My father took care of me in my early childhood, teaching me the fine art of theft.");
				System.out.println("One day my father and I were aking for some sustinance, so we decided to treat ourselves to some fine ingrediants to make some stew.");
				System.out.println("As we were pocketing some potatos, a guard spotted my fathers sticky fingers.");
				System.out.println("That day was a dark day...");
				System.out.println("Here, in the town of Oozengwentch, they do not take kindley to theives. Shortly after, my father was put to death. ");
				System.out.println("Watching my fathers head fall from his body changed me as a person.");
				System.out.println("Since then, I've always watched my back and retraced my footsteps to be certain evrey move is the right one.");
				System.out.println("I make sure to take care of myself and practice the gift of swiftness my father gave to me.");
				System.out.println("In this world you have to take care of yourself first, because evreyone else will walk all over you.");
				System.out.println("Be sure of your movement and certain of your actions, because in the end you are the only one that can save yourself.");
				System.out.println("**************************************************************************************************************************************");
				System.out.println("");

			}
			System.out.println ("Your character has free attribute points that need assigned");
			while (freePoints >0)
			{
				System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Strength" );
				pointsUse = input.nextInt ( );
				while (pointsUse > freePoints || pointsUse <=0 && freePoints >0 )
				{
					System.out.println ( "Entera a number between 0 and "+freePoints );
					pointsUse = input.nextInt ( );
				}
				freePoints = freePoints - pointsUse;
				chad.setStrength( chad.getStrength() + pointsUse);
				if(freePoints > 0)
				{
					System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Vitality (Health)" );
					pointsUse = input.nextInt ( );
			
					while (pointsUse > freePoints|| pointsUse <=0 && freePoints >0 )
					{
						System.out.println ( "Enter a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
				freePoints = freePoints - pointsUse;
				chad.setVitality(chad.getVitality() + pointsUse);
				}	
				
				if(freePoints>0)
				{		
					System.out.println ( "You have: "+freePoints+ " left. How many points will you assign to Dexterity" );
					pointsUse = input.nextInt();

					while (pointsUse > freePoints || pointsUse <=0 && freePoints >0 )
					{
						System.out.println ( "Entera a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
					freePoints = freePoints - pointsUse;
					chad.dexterity = chad.dexterity + pointsUse;
				}
			
				
				if(freePoints>0)
				{
					System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Wisdom" );
					pointsUse = input.nextInt ( );
					while (pointsUse > freePoints || pointsUse <=0 )
					{
						System.out.println ( "Entera a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
				freePoints = freePoints - pointsUse;
				chad.wisdom = chad.wisdom + pointsUse;
				}
				if(chad.getWeaponName ( ) == null) {
					chad.setDmg (( chad.getStrength() + chad.getDexterity()+ chad.getWisdom()) /2);
				}
				else {
					chad.setDmg((chad.getStrength() + chad.getDexterity()+ chad.getWisdom() + chad.getWeaponDamage ( ))/2);
				}
		
			}
		}
		else
			{
				System.out.println ( "Invalid class entered please enter Knight, Mage or Thief" );
				chad.classType= input.next ();
			}

	}
	/* 
	 * Name: fighter
	 * Author: Michael Boone
	 * Params: chad
	 * return: void
	 * Description: Runs and sets up fight sequences
	 */
	public static void fighter(Characters chad) {
		if(chad.getWeaponName ( ) == null) {
			chad.setDmg (( chad.getStrength() + chad.getDexterity()+ chad.getWisdom()) /2);
		}
		else {
			chad.setDmg((chad.getStrength() + chad.getDexterity()+ chad.getWisdom() + chad.getWeaponDamage ( ))/2);
		}
		int attack = chad.getDmg();
		int health = chad.getVitality();
		Scanner input = new Scanner(System.in);
		// Monster creator
		
		int monsterHealth = (int) (Math.random() *(20) + 15);
		int monsterDmg = (int) ( Math.random()*((3-1)+1)+1);
		System.out.println("The enemy has " + monsterHealth + " health, and does " + monsterDmg + " damage");
		
		System.out.println("Press a to continue");
		char go = input.next().charAt(0);
		int turn = 0;
		char decision = 'a';
		while(health > 0 && monsterHealth > 0) {
			if(turn % 2 == 0) {
				System.out.println("You did " + attack + " damage!");
				monsterHealth = monsterHealth - attack;
				System.out.println("The monsters health is now " + monsterHealth);
				turn++;
				
			}
			else {
				System.out.println("The enemy did " + monsterDmg + " damage");
				health = health - monsterDmg;
				System.out.println("Your health is now " + health);
				turn++;
				System.out.println("Press a to continue");
				decision = input.next().charAt(0);
			}
		}
		if(health <= 0) {
			int exit = 1;
			System.out.println("GameOver");
			System.out.println("Better luck next time....");
			System.exit(1);
		}
		else if (monsterHealth == 0){
			System.out.println("VICTORY!!");
			System.out.println("Your current health is " + health);
			chad.setVitality(health);
			System.out.println("");
			System.out.println("**********************");
		}
		else {
			System.out.println("OVERKILL, HECK YEAH BUDDY!!!");
			System.out.println("Your current health is " + health);
			chad.setVitality(health);
			System.out.println("");
			System.out.println("**********************");
		}
		
	}
	/* Type generator method
	 * This method has not been implemented and will be used in future development
	 */
	public static String findType( )
	{
		int rType = (int)(Math.random()*((3-1)+1)+1);
		String[] mType = new String [3];
		String type;
		int burn;
	  for(int i = 0; i < 3; i++ )
	  {
		  if(i == 0 && i <3)
		  {
			mType[i] = "Fire";
			  
		  }
		  if(i==1)
		  {
			mType[i] = "Water";
			
		  }
		  if(i==2)
		  {
			mType[i] = "Grass";
		  }
		
	  }
	 if(rType >=3)
	 {
		 rType = 0; 
	 }
	  type = mType[rType];
	  return type;
	}
	/* Name: StoryStart
	 * Author: Michael Boone
	 * Params: none
	 * return: void
	 * Description: Prompts the start of the story line
	 */
	public static void StoryStart() throws InterruptedException{
		Scanner input = new Scanner(System.in);
		char cont;
		System.out.println("      _______  _______  _______  _______  _        _______ ");
		System.out.println("     (  ___  )(  ____ )(  ___  )(  ____ |( |      (  ____ | ");
		System.out.println("     | (   ) || (    )|| (   ) || (    |)| |      | (    ()");
		System.out.println("     | |   | || (____)|| (___) || |      | |      | (__    ");
		System.out.println("     | |   | ||     __)|  ___  || |      | |      |  __)");    
		System.out.println("     | |   | || ( | (  | (   ) || |      | |      | (     ");   
		System.out.println("     | (___) || )  ( ) | )   ( || (____|)| (____()| (____() "); 
		System.out.println("     (_______)|)    | )|)     (|(_______)(_______)(_______) ");                                                                                                                           
		Thread.sleep(2000);
		System.out.println(" _______           _______            _______  _______  _______"); 
		System.out.println("(__   __)|)     (|(  ____ )          (  ____ )(  ____ )(  ____ )");
		System.out.println("   ) (   | )   ( || (    |)          | (    )|| (    )|| (    |)");
		System.out.println("   | |   | (___) || (__              | (____)|| (____)|| |      ");
		System.out.println("   | |   |  ___  ||  __)             |     __)|  _____)| |  ___ ");
		System.out.println("   | |   | (   ) || (                | (|(    | (      | | (_  )");
		System.out.println("   | |   | )   ( || (____()          | ) | )  | )      | (___) |");
		System.out.println("   )_(   |)     (|(_______|          |)   (_) |_)      (_______)");
		System.out.println("");
		System.out.println(" ***************************************************************");
		System.out.println("");
		Thread.sleep(2000);
		System.out.println("Before life found existence there was oracle and the boundary between order and chaos belonged to oracle.");
		System.out.println("Oracle conceived life by exhaling the chaotic elements of its desire, giving birth to a vibrant smattering of life on this planet.");
		System.out.println("While the laws and nature of science exist on this planet, Oracle drowns them out with its presence.");
		System.out.println("With this intense range of life and chaos came both beauty and horror.");
		System.out.println("The world became a place that harbors both love and distain.");
		System.out.println("*********************************************************************************************************");
		System.out.println("");
		System.out.println("While some fight to keep the beauty and chaos of Oracle, others fights to destroy it.");
		System.out.println("As a child you were taught by the elders to be aware of Oracle, but in your learning, you found yourself lost as to what it truly is.");
		System.out.println("When you turn 16 you decide its time to define Oracle on your own, the elders in your town can only offer you so much, the rest is up to you.");
		System.out.println("Press a to start");
		cont = input.next().charAt(0);
	}
	/* Name: part1
	 * Author: Michael Boone
	 * Params: chad
	 * return: void
	 * Description: Holds all story for option one part 1
	 */
	public static void part1(Characters chad) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		char cont = 'f';
		
		if (chad.classType.equalsIgnoreCase( "Knight" ))
		{
			
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Growing up, I came to know hard work.");
			System.out.println("My father, comander and chief in the town of Oozzengwentch, trained me since I was a young boy.");
			System.out.println("I remember as a child I had spent countless hours grinding through gruling training.");
			System.out.println("I would aften fall to my knees only to be ordered by my commander: ");
			System.out.println("Stand up soildier! Do you admit Defeat?! Do not accept your own mercy, stand on your feet and stare into the heart of your fellow warrior!");
		    System.out.println("Struggling to stand up, I face my father after being beat to a pulp. ");
			System.out.println("After a day of wretched rainfall fighting my father in a steamy pit of mud, grime and blood, I looked over my shoulder only to see the other kids playing across the court yard.");
			System.out.println("Distracted, my father calls out to me: stand sharp soildier!");
			System.out.println("Caught off guard, I looked in the eyes of my father after daydreaming to be free and loved like the other children and said: ");
			System.out.println("I love you Dad. <3 .");
			System.out.println("A warrior does not submit to murcy in the eyes of their enemy. to admit murcy is to admit defeat. He said");
			System.out.println("Your love means nothing to the heart of your oponnent. Instead, feel the fire in your gut and strike me!");
			System.out.println("I respond with anger and said: why can't I have no care in the world and enjoy myself like all the other kids?");
			System.out.println("Because it is the honor of the warrior to continue for the prosperity of others. He said with a grim disapointed look.");
			System.out.println("Stand up, Lets go again!!! He said.");
			System.out.println("");
			System.out.println("Starting attributes:");
			System.out.println("Strength: " + chad.getStrength());
			System.out.println("Vitality: " + chad.getVitality());
			System.out.println("Dexterity: " + chad.getDexterity());
			System.out.println("Wisdom: " + chad.getWisdom());
			System.out.println("Press a to Continue");
			cont = input.next().charAt(0);
		}
		else if (chad.classType.contentEquals ( "Mage" ))
		{
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("As a child, I've always craved the thurst for knowledge.");
			System.out.println("I spent many of my days as a kid reading books and absorbing information.");
			System.out.println("I often sold anything I had, trading my food for book on the constant search for something with profound meaning.");
			System.out.println("It wasn't until my years as a young adult and an apprentice that I became self aware with the identity of the world and how Oricle defined itself within all of us.");
			System.out.println("One day, a scragaly old man approuched me as I was reading under an oak tree consintrating my feelings of bliss and purity.");
			System.out.println("I looked up and requested his intentions and he perseeded with the words that would forever change my life");
			System.out.println("I can sense that you do not know what is true and what is false to the understanding of your identity . To precieve our posision in reality is to harness your energy of being. Tell me young one, do you long for meaning?");
			System.out.println("I paused for a moment to comprehend the obsurdity of possibility and looked back at the man, eyes filled with ambition and said: ");
			System.out.println("I want to learn and to understand reality and the meaning of life, what is truly possible and what could be possible. I want to become something magnificiant and and dive into the unknown.");
			System.out.println("The old man smilled at me and a began in a soft tone: ");
			System.out.println("I thought you'd say that, come follow me.");
			System.out.println("Years have passed and I've come to accept the limitations of ones mind and since then. I've grown, now I know who I am.");
			System.out.println("");
			System.out.println("Starting attributes:");
			System.out.println("Strength: " + chad.getStrength());
			System.out.println("Vitality: " + chad.getVitality());
			System.out.println("Dexterity: " + chad.getDexterity());
			System.out.println("Wisdom: " + chad.getWisdom());
			System.out.println("Press a to Continue");
			cont = input.next().charAt(0);
		}
		else if (chad.classType.contentEquals ( "Thief" ))
		{
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("You chose the Thief class.");
			System.out.println("Growing up, I endured a life of lies.");
			System.out.println("When I was born, my mother died. My father took care of me in my early childhood, teaching me the fine art of theft.");
			System.out.println("One day my father and I were aking for some sustinance, so we decided to treat ourselves to some fine ingrediants to make some stew.");
			System.out.println("As we were pocketing some potatos, a guard spotted my fathers sticky fingers.");
			System.out.println("That day was a dark day...");
			System.out.println("Here, in the town of Oozengwentch, they do not take kindley to theives. Shortly after, my father was put to death. ");
			System.out.println("Watching my fathers head fall from his body changed me as a person.");
			System.out.println("Since then, I've always watched my back and retraced my footsteps to be certain evrey move is the right one.");
			System.out.println("I make sure to take care of myself and practice the gift of swiftness my father gave to me.");
			System.out.println("In this world you have to take care of yourself first, because evreyone else will walk all over you.");
			System.out.println("Be sure of your movement and certain of your actions, because in the end you are the only one that can save yourself.");
			System.out.println("");
			System.out.println("Starting attributes:");
			System.out.println("Strength: " + chad.getStrength());
			System.out.println("Vitality: " + chad.getVitality());
			System.out.println("Dexterity: " + chad.getDexterity());
			System.out.println("Wisdom: " + chad.getWisdom());
			System.out.println("Press a to Continue");
			cont = input.next().charAt(0); 
		}
		System.out.println("");
		System.out.println("*******************************");
		System.out.println("As you leave town looking for clues about Oracles whereabouts, you are at a laps as where to start.");
		System.out.println("Would you like to search the woods or head down the road to the nearby town to look for clues");
		System.out.println("a) The woods");
		System.out.println("b) Head down the road");
		char desision = input.next().charAt(0);
		if (desision == 'a') {
			part1Woods(chad);	
		}
		else {
			part1Town(chad);
		}
	}
	/* Name: part1Woods
	 * Author: Michael Boone
	 * Params: chad
	 * return: void
	 * Description: Holds all of part 1 option 2 display
	 */
	public static void part1Woods(Characters chad) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		CharacterC jim = new CharacterC();
		Weapon weapon = new Weapon();
		char desision;
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
		Potion hPot = new Potion();
		System.out.println("You think that the woods is the best place to start.");
		System.out.println("As you head into the woods you find yourself slightly disoriented.");
		System.out.println("Should you have brought a map or a compass? Sure, but its a little to late for that.");
		System.out.println("As you blast your way through some bushes you come upon a strange creature gnawing on some bones.");
		System.out.println("What do you want to do?");
		System.out.println("a) Fight the monster?");
		System.out.println("b) Leave and continue looking for clues?");
		System.out.println("c) Do small jig in bush?");
		desision = input.next().charAt(0);
		if(desision == 'a' || desision == 'c') {
			System.out.println("It spots you and looks mad, it charges");
			fighter(chad);
			jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
			System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
			System.out.println("What the heck was THAT! Your feeling a little disoriented after your first encounter on your adventure, but its a good indicator as to whats to come.");
			System.out.println("While Oracle creates great beauty, it also creates great evils.");
			System.out.println("************************");
		}
		else {
			System.out.println("Man that thing looked like %$%#.");
			System.out.println("Im glad I passed it up.");
			System.out.println("************************");
		}
		System.out.println("As you continue stumbling through the woods you spot a strange shack in the distance.");
		System.out.println("It looks deserted but you cant tell.");
		System.out.println("What would you like to do?");
		System.out.println("a) Head towards the shack?");
		System.out.println("b) Keep looking for clues/ the way out of the woods?");
		desision = input.next().charAt(0);
		if(desision == 'a') {
			System.out.println("You head towards the shack, while it doesnt seem very reasonable to wander towards a shack in the middle of the woods, your feeling lucky");
			System.out.println("As you get close you see a giant monster... It must be 7 feet tall and has a bicept like a tractor tire.");
			System.out.println("What would you like to do?");
			System.out.println("*************************");
			System.out.println("a) Fight the monster?");
			System.out.println("b) Sneak into the house?");
			System.out.println("c) Leave and hope that thing doesnt spot you?");
			desision = input.next().charAt(0);
			if(desision == 'a') {
				System.out.println("WOW! Were feeling brave this morning!");
				System.out.println("You approach the monster. It looks down at you and snorts. You see a smile creep up the side of his lips. You feel small");
				System.out.println("*************************");
				fighter(chad);
				System.out.println("Holy Crap!!! How did you win that fight!!!??? Well done!");
				System.out.println("*************************");
				System.out.println("You found a weapon and a potion!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				jim.addPotion(hPot);
				jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
				System.out.println("You clean yourself up and head back into the woods");
				System.out.println("*************************");
			}
			else if(desision == 'b') {
				System.out.println("You decide to seak into the house");
				System.out.println("The monster seems to be destracted cooking something in a large pot, you think you see a head");
				System.out.println("You start to creep into the house....... you open the door slightly and slip inside");
				System.out.println("You search the shack silently");
				System.out.println("You find something!");
				System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
				System.out.println("You creep back out of the house and quickly make your way back to the saftey of the woods");
				System.out.println("*************************");
				
			}
			else {
				System.out.println("That thing would eat you like nothing, you decide its best to head back into the woods and let that monster be.");
				System.out.println("*************************");
			}
		}
		else {
			System.out.println("Strange shack in the woods? Nope not having it, lets move on.");
			System.out.println("*************************");
		}
		System.out.println("You keep moving when you see a strange light in the woods.");
		System.out.println("It almost feels like its emanating heat.....");
		System.out.println("You cant help but move towards it.");
		System.out.println("It feels loving, yet terrifying all at once.");
		System.out.println("You push through some bushes and see a clearing, lit up like the afternoon sky.");
		System.out.println("Small particles push through the air, stinging your face as they brush past it.");
		System.out.println("Its warm here, and you start to sweat.");
		System.out.println("You feel obligated to talk, like something is listening, but you dont know what to say.");
		System.out.println("What would you like to say?");
		System.out.println("a) Hello?");
		System.out.println("b) Oy!");
		System.out.println("c) $%^$ its hot in hurrrr");
		System.out.println("*************************");
		desision = input.next().charAt(0);
		if(desision == 'c') {
			System.out.println("FOOL! Do you know who you speak to?");
			System.out.println("You feel like an idiot and you decide its best to stop talking.");
		}
		else {
			System.out.println("Do you know who I am?");
		}
		System.out.println("I am Oracle");
		System.out.println("The breath of creation and life of this planet.");
		System.out.println("");
		System.out.println("You: I found you, I have so many questions!");
		System.out.println("");
		System.out.println("Oracle: Small creation, I understand the need for understanding, however, there is a more pressing matter I must discuse with you");
		System.out.println("Oracle: My essance is at risk of being erased");
		System.out.println("Oracle: I have been in existance for all and always, and if I am no longer your world will change drasticly.");
		System.out.println("");
		System.out.println("You: But your here, how could you be in danger?");
		System.out.println("");
		System.out.println("Oracle: I am not here, I am not anywhere, I am in every fiber of this world.");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("You: Then how are you in danger? Can you not kill any danger to you?");
		System.out.println("");
		System.out.println("Oracle: While I have great influence over this planet, I can not interfere with it.");
		System.out.println("Oracle; I have shaped the creatures that roam this planet and the magics available to use, but I can not effect the physical that has already found creation.");
		System.out.println("Oracle: With out me, your world will find a state of neutrality that will be unbearable to some and profitable to others");
		System.out.println("Oracle: With out me, you will loose the color of life, the diversity of animals and the ability to hold and train magic.");
		System.out.println("");
		System.out.println("You: And you need me? Why me?");
		System.out.println("");
		System.out.println("Oracle: Lets be honest, your not special, your just some 16 year old kid thats lost in the woods.");
		System.out.println("Oracle: However, you are here, and others are not, not many search for the truth about me, and thus not many are willing to help me.");
		System.out.println("");
		System.out.println("You: What do I need to do?");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("Oracle: As you know, some love my influence on this world, and others dont.");
		System.out.println("Oracle: There is one that is trying to do away with me for good, one known as Python.");
		System.out.println("");
		System.out.println("You: Python? What a tacky unoriginal name? Who is this Python?");
		System.out.println("");
		System.out.println("Oracle: You know nothing. Python is not a person, it is a presence similar to me. an essence.");
		System.out.println("Oracle: And you need to stop it.");
		System.out.println("");
		System.out.println("You: How?");
		System.out.println("");
		System.out.println("Oracle: You have to create a logical conundrum, that has no answer, and no solution.");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("You: How do I do that?");
		System.out.println("");
		System.out.println("Oracle: That is for you to find out, but just know, it will not be easy. Python is very strong and will know you seek to destroy it.");
		System.out.println("Oracle: It will litter your path with challenges and when you finaly find him, if you do find him, you will have to fight him before you can ask him the question.");
		System.out.println("");
		System.out.println("You: Okay, I accept");
		System.out.println("");
		System.out.println("Oracle: ...");
		System.out.println("The area your standing in slowly darkens, the heat lessens and you realize your alone.");
	}
	/* Name: part1Town
	 * Author: Michael Boone
	 * Params: chad
	 * return: void
	 */
	public static void part1Town(Characters chad) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		char desision;
		char cont = 'f';
		String answer = " no";
		CharacterC jim = new CharacterC();
		Weapon weapon = new Weapon();
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
		Potion hPot = new Potion();
		System.out.println("You think the Town of OoznBarth is the best place to start.");
		System.out.println("You head down the road to OoznBarth. You walk at a quick pace as the town is 25 miles away.");
		System.out.println("After you have been walking for a couple of hours you run into an old Tinker.");
		System.out.println("*****************************");
		System.out.println("What would you like to do?");
		System.out.println("a) Approach the Tinker.");
		System.out.println("b) Kill the Tinker and take his things.");
		System.out.println("c) Walk past the Tinker and wave.");
		System.out.println("d) Walk past the Tinker and scowl.");
		desision = input.next().charAt(0);
		if (desision == 'a') {
			System.out.println("You decide to approach the Tinker.");
			System.out.println("You walk up to the old man and his donkey, and wave hello.");
			System.out.println("You: Hello Tinker!");
			System.out.println("You: What do you have for sale?");
			System.out.println("");
			System.out.println("The Tinker looks at you for a long time and then begins to ask you questions.");
			System.out.println("");
			System.out.println("Tinker: What has roots as deep as trees and arms that touch the sky?");
			System.out.println("*****************************");
			System.out.println("a) Trick question, its a tree.");
			System.out.println("b) A mountain");
			System.out.println("c) Family");
			System.out.println("*****************************");
			
			desision = input.next().charAt(0);
			
			if(desision == 'b') {
				System.out.println("Correct!");
				System.out.println("What has no windows and no doors, but a golden wonder is instore?");
				System.out.println("a) An egg");
				System.out.println("b) Treasure!");
				System.out.println("c) Your heart");
				desision = input.next().charAt(0);
				if(desision == 'a') {
					System.out.println("Correct! Heres a thing for ya!");
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon and a potion!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
					jim.addPotion(hPot);
					
					System.out.println("Well that was cool i guess!");
					System.out.println("*****************************");
					System.out.println("");
				}
				else {
					System.out.println("");				
					}
			}
			else {
				System.out.println("Nope, see ya later!");
			}
		}
		else if (desision == 'b') {
			System.out.println("You decide its best to kill the Tinker and take his things.");
			System.out.println("You slowly walk towards the Tinker, he raises his eyebrow slowly realizing whats happening");
			System.out.println("Before you can attack, the Tinker goes up and smoke and he and his donkey are gone.");
			System.out.println("I guess thats what you get for trying to kill a little old Tinker.");
			System.out.println("*****************************");
			System.out.println("");
		}
		else {
			System.out.println("The Tinker doesnt seem to notice you.");
			System.out.println("*****************************");
			System.out.println("");
		}
		
		System.out.println("You keep heading down the road.");
		System.out.println("A few hours later you see a bandit trying to rob a young woman.");
		System.out.println("*****************************");
		System.out.println("What would you like to do?");
		System.out.println("a) Help the young woman in distress?");
		System.out.println("b) Walk past quickly and hope he doesnt see you?");
		desision = input.next().charAt(0);
		if(desision == 'a') {
			System.out.println("You decide you want to help the woman");
			System.out.println("You run over to the bandit and grap him by the shoulder.");
			System.out.println("You look over at the once scream woman who now has a smile on her face.");
			System.out.println("You look closer, jesus CHRIST this woman has a beard! You realize its not a woman at all, but a man with a wig! It was a set up....");
			System.out.println("You slap the man with the wig on. HECK of a slap, he goes unconcience.");
			System.out.println("The other bandit is mad now and ready to fight");
			System.out.println("*****************************");
			System.out.println("Press a to continue.");
			cont = input.next().charAt(0);
			bandit();
			System.out.println("******************************");
			fighter(chad);
			System.out.println("You defeated one of the bandits, but the other is finally waking up");
			System.out.println("Your are weak after your last fight, what should you do?");
			System.out.println("a) Fight the second bandit?");
			System.out.println("b) Run and keep the xp but not get any of the loot?");
			desision = input.next().charAt(0);
			if (desision == 'a') {
				bandit();
				System.out.println("******************************");
				fighter(chad);
				System.out.println("You can believe you won, but now you get to reap the reward");
				System.out.println("You found two weapons!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
				jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
			}
			else {
				System.out.println("You decide its best to not interfere. Plus there was something fishy about that lady.");
				System.out.println("*****************************");
			}
		}System.out.println("You continue down the road.");
		System.out.println("******************************");
		System.out.println("");
		System.out.println("You keep moving when you see a strange light in the woods off to the left.");
		System.out.println("It almost feels like its emanating heat.....");
		System.out.println("You cant help but move towards it.");
		System.out.println("It feels loving, yet terrifying all at once.");
		System.out.println("You push through some bushes and see a clearing, lit up like the afternoon sky.");
		System.out.println("Small particles push through the air, stinging your face as they brush past it.");
		System.out.println("Its warm here, and you start to sweat.");
		System.out.println("You feel obligated to talk, like something is listening, but you dont know what to say.");
		System.out.println("*****************************");
		System.out.println("");
		System.out.println("What would you like to say?");
		System.out.println("a) Hello?");
		System.out.println("b) Oy!");
		System.out.println("c) $%^$ its hot in hurrrr");
		desision = input.next().charAt(0);
		if(desision == 'c') {
			System.out.println("FOOL! Do you know who you speak to?");
			System.out.println("You feel like an idiot and you decide its best to stop talking.");
		}
		else {
			System.out.println("Do you know who I am?");
		}
		System.out.println("I am Oracle");
		System.out.println("The breath of creation and life of this planet.");
		System.out.println("");
		System.out.println("You: I found you, I have so many questions!");
		System.out.println("");
		System.out.println("Oracle: Small creation, I understand the need for understanding, however, there is a more pressing matter I must discuse with you");
		System.out.println("Oracle: My essance is at risk of being erased");
		System.out.println("Oracle: I have been in existance for all and always, and if I am no longer your world will change drasticly.");
		System.out.println("");
		System.out.println("You: But your here, how could you be in danger?");
		System.out.println("");
		System.out.println("Oracle: I am not here, I am not anywhere, I am in every fiber of this world.");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("You: Then how are you in danger? Can you not kill any danger to you?");
		System.out.println("");
		System.out.println("Oracle: While I have great influence over this planet, I can not interfere with it.");
		System.out.println("Oracle; I have shaped the creatures that roam this planet and the magics available to use, but I can not effect the physical that has already found creation.");
		System.out.println("Oracle: With out me, your world will find a state of neutrality that will be unbearable to some and profitable to others");
		System.out.println("Oracle: With out me, you will loose the color of life, the diversity of animals and the ability to hold and train magic.");
		System.out.println("");
		System.out.println("You: And you need me? Why me?");
		System.out.println("");
		System.out.println("Oracle: Lets be honest, your not special, your just some 16 year old kid thats lost in the woods.");
		System.out.println("Oracle: However, you are here, and others are not, not many search for the truth about me, and thus not many are willing to help me.");
		System.out.println("");
		System.out.println("You: What do I need to do?");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("Oracle: As you know, some love my influence on this world, and others dont.");
		System.out.println("Oracle: There is one that is trying to do away with me for good, one known as Python.");
		System.out.println("");
		System.out.println("You: Python? What a tacky unoriginal name? Who is this Python?");
		System.out.println("");
		System.out.println("Oracle: You know nothing. Python is not a person, it is a presence similar to me. an essence.");
		System.out.println("Oracle: And you need to stop it.");
		System.out.println("");
		System.out.println("You: How?");
		System.out.println("");
		System.out.println("Oracle: You have to create a logical conundrum, that has no answer, and no solution.");
		System.out.println("*************************");
		Thread.sleep(7000);
		System.out.println("You: How do I do that?");
		System.out.println("");
		System.out.println("Oracle: That is for you to find out, but just know, it will not be easy. Python is very strong and will know you seek to destroy it.");
		System.out.println("Oracle: It will litter your path with challenges and when you finaly find him, if you do find him, you will have to fight him before you can ask him the question.");
		System.out.println("");
		System.out.println("You: Okay, I accept");
		System.out.println("");
		System.out.println("Oracle: ...");
		System.out.println("The area your standing in slowly darkens, the heat lessens and you realize your alone.");
		
		
	}
	/* Name: part2
	 * Author: (written by) Eseme Holden and (debugged and re-worked by) Michael Boone
	 * Params: chad
	 * return: void
	 */
	public static void part2(Characters chad) {
		char desition;
		int marker = 0;
		Scanner input = new Scanner(System.in);
		
		//intro to part 2
		System.out.println("As you enter the town you stop at a local pub to rest and collect your thoughts.");
		System.out.println("After a long journey of finding who you are and understanding the meaning of life through the percpective of Oricle, you undergo a profound reflection of self and the importance of this quest.");
		System.out.println("Now I am in search for clues that may lead me to confront this malitios power, Python.");
		System.out.println("I know that this powers intentions is to eliminate Oricle and the forbid the stories of my Elders, so now is my time to shine and defeat this Evil!");
		System.out.println("******************************************************************************************************************************************************************************************************");
		
		//selection for path 1 or 2 of part 2
		System.out.println("Where should I search for clues to find out where Python is? Enter a or b .");
		System.out.println("a.) Ask around the Pub and see if they've heard anything.");
		System.out.println("b.) walk around the street and see if anyone knows anything.");
		desition = input.next().charAt ( 0 );
		while(marker == 0) {
			
			if(desition == 'A' || desition == 'a') {
			part2Street(chad);
			marker = 1;
			}
			
			else if( desition == 'B' || desition == 'b') {
		System.out.println("pub");
			part2Pub(chad);
			marker = 1;
			}
			
			else {
				System.out.println("You did not enter a valid argument please enter a or b .");
			
			}
		}
	}
	/* Name: part2Street
	 * Author: (written by) Eseme Holden and (debugged and re-worked by) Michael Boone
	 * Params: chad
	 * return: void
	 */
	public static void part2Street(Characters chad) {
		Scanner input = new Scanner(System.in);
		char decsition;
		int indicator = 0;
		int check;
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
		Potion hPot = new Potion();
		CharacterC jim = new CharacterC();
		//option street
		System.out.println ("You walk out of the pub into the street. A sturn loud voice stops you in your tracks.");
		System.out.println("Holt! You are under arest for conspirarcy under rebellion.");
		System.out.println("Pannicked you run and the authority is now chassing you.");
		
		//checking your decsition
		while(indicator == 0) {
			System.out.println("You are being acused for conspirarcy agianst authority.");
			System.out.println("You run inside a strangers house and they frantickly question who you are hiding from, what do you do? Enter a , b , or c");
			System.out.println("a.) Politally ask the stranger to be quite.");
			System.out.println("b.) Jump out the window.");
			System.out.println("c.) Hold the strangers mouth to be quite.");
			
			decsition = input.next().charAt(0);

			if (decsition == 'A' || decsition == 'a') {
				
				//checking if wisdom is 5 or higher
				if(chad.getWisdom() >= 5 ) {
					System.out.println("You successfuly escaped.");
					System.out.println("Luckily you are very skilled in the arts of Wisdom");
					System.out.println("On your way you found a poition and snagged it!!");
					jim.addPotion(hPot);
					indicator = 1;
				}
				else {
					System.out.println("Your wisdom stat is not high enough, the man opens the door and yells for help. You are captured in a fight:");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
					indicator = 1;
				}
			}
					if(decsition == 'B' || decsition == 'b') {
					//checking if dexterity is 5 or higher
					if(chad.getDexterity() >= 5) {
						System.out.println("You successfuly escaped.");
						System.out.println("Luckily you are very skilled in the arts of dexstairity.");
						System.out.println("On your way you found a poition and snagged it!!");
						jim.addPotion(hPot);
						indicator = 1;
					}
					
					else {
						System.out.println("Your dexstarity stat is not high enough, the man opens the door and yells for help. You are captured in a fight:");
						fighter(chad);
						jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
						System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
						indicator = 1;
					}
				}
				if (decsition == 'C' || decsition == 'c') {
				//checking if strength is greater than 5
				if (chad.getStrength() >= 5) {
					System.out.println("You successfuly escaped.");
					System.out.println("Luckily you are very skilled in the arts of Strength.");
					System.out.println("On your way you found a poition and snagged it!!");
					jim.addPotion(hPot);
					indicator = 1;
				}
				
				else {
					System.out.println("Your Strength stat is not high enough, the man opens the door and yells for help. You are captured in a fight:");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
					indicator = 1;
				}
				
			}
			
				
					else {
						System.out.println("You did not enter a valid argument please enter a or b .");
					}
			
				}
		//After battle sequence
		System.out.println("After a long grind, you stumble across an old man.");
		System.out.println("I saw your conflict there, you know our local authority has been currupt by Python dont you? He said");
		System.out.println("I heard he is conspiraring in the town of Grill, if you are looking for him you should go there.");
		System.out.println("Head west down the path to the town of Gill");
			
	}
	/* Name: part2Pub
	 * Author: (written by) Eseme Holden and (debugged and re-worked by) Michael Boone
	 * Params: chad
	 * return: void
	 */
	public static void part2Pub(Characters chad) {
		Scanner input = new Scanner(System.in);
		char decsition;
		int indicator = 0;
		int check;
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
		Potion hPot = new Potion();
		CharacterC jim = new CharacterC();
		System.out.println("You start talking to individuals in the pub for information on the wretched Python.");
		System.out.println("A gang of men over hear you talking smack and tap you on the shoulder.");
		System.out.println("What do you know about Python? They ask");
		
		while(indicator == 0) {
			System.out.println("The man seems pretty tuff, what do you do? Enter a , b or c");
			System.out.println("a.) Tell them that you are intrested in getting involved with the Python movment.");
			System.out.println("b.) Lie and say you are with the movment.");
			System.out.println("c.) Tell them that you are agianst Python looking for his location.");
			
			decsition = input.next().charAt(0);

			if (decsition == 'A' || decsition == 'a') {
				//checking if wisdom is 5 or higher
				if(chad.getWisdom() >= 5) {
					System.out.println("You successfuly, the men start telling you of Pythons location.");
					System.out.println("Head west down the path to the town of Grill");
					indicator = 1;
				}
				else {
					System.out.println("Your wisdom wasnt hight enough!!");
					System.out.println("You must fight!");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
					
				}
				
			}
				
				else if(decsition == 'B' || decsition == 'b') {
					//checking if dexstarity is 5 or higher
					if(chad.getDexterity() >= 5 && chad.getWisdom() >= 3) {
						System.out.println("You successfuly lied to the men. They tell you where Python is located.");
						System.out.println("Luckily you are very skilled in the arts of dexstairity and wisdom.");
						System.out.println("Head west down the path to the town of Grill");
						indicator = 1;
					}
					
					else {
						System.out.println("Your dexstarity or wisdom stat is not high enough, Both the men get very mad and one engages you in battle.");
						fighter(chad);
						jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
						System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
						indicator = 1;
					}
				}
			if (decsition == 'C' || decsition == 'c') {
				//checking if strength is greater than 5
				if (chad.getStrength() >= 5) {
					System.out.println("You successfuly escaped.");
					System.out.println("Luckily you are very skilled in the arts of Strength.");
					indicator = 1;
				}
				
				else {
					System.out.println("Your Strength stat is not high enough, the man opens the door and yells for help. You are captured in a fight:");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
					indicator = 1;
				}
				
			}
		}
	}
	/* Name: Part3
	 * Author: Michael Boone
	 * Params: chad
	 * return: void
	 */
	public static void part3(Characters chad) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		char desision;
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
		Potion hPot = new Potion();
		CharacterC jim = new CharacterC();
		System.out.println("Now knowing where Python is located, you leave OozenBarth feeling good about your quest.");
		System.out.println("You head down the red path, to the town of Gill");
		System.out.println("Would you like to rest before you start, wasting precious time?");
		System.out.println("a) No.");
		System.out.println("b) Yes.");
		desision = input.next().charAt(0);
		if(desision == 'a') {
			System.out.println("You decided to head down the red path right now. A dangerous choice, but you think you can handle it.");
		}
		else {
			System.out.println("You decided to get some sleep.");
			System.out.println("Nothing happened, sleep is for the weak.");
			System.out.println("**********************************************");
			System.out.println("You start down the path, the town of Gill is a days travel.");
			System.out.println("Its getting dark, and you are tired. You look for a place to camp for the night.");
			System.out.println("Where would you like to sleep?");
			System.out.println("a) A nearby cave, it looks a little wet but at least there would be some cover.");
			System.out.println("b) Some nice grass in a clearing of trees, nice and dry but offers no protection from the elements.");
			desision = input.next().charAt(0);
			if(desision == 'a') {
				System.out.println("You decided to sleep in the nearby cave.");
				System.out.println("You settle in, is really wet, and almost slimy... actually really slimy. At least its much warmer than expected.");
				System.out.println("All of a sudden you feel the ground move...... I dont think this is a cave");
				System.out.println("You run out of the opening right as the mouth closes.. standing before you is a massive beast.");
				System.out.println("It doesnt seem to be able to move, but as you stand there small monsters start coming out of its mouth.");
				System.out.println("Two monsters start charging at you, what do you do?");
				System.out.println("a) Fight the monsters.");
				System.out.println("b) Run like &$%R");
				desision = input.next().charAt(0);
				if(desision == 'a') {
					System.out.println("You stand and hold your ground");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				}
				else {
					System.out.println("You..G..G..Giddy up right out of there. ");
					
				}
			}
			else {
				System.out.println("You decide its best to sleep on the dry nice grass.");
				System.out.println("You settle in and lay down in the grass.");
				System.out.println("You close your eyes.");
				System.out.println("As you start drifting off to sleep, you feel a light rustling underneath you.");
				System.out.println("You open your eyes to find yourself fasened to the ground. What should you do?");
				System.out.println("a) Slash away with your wepon, free yourself and then get the heck out?");
				System.out.println("b) Try and reason with the tiny leader?");
				if(desision == 'a') {
					System.out.println("You decide to slash your way out.");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				}
				else {
					System.out.println("You decide to reason with the leader");
					System.out.println("He is an unreasonable man.... He wants to fight");
					fighter(chad);
					jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
					System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
				}
				
			}
		}
		System.out.println("You didnt get much sleep but your running out of time and decide to keep going.");
		System.out.println("***********************************");
		System.out.println("You see the light off to the side of the trail and a quiet voice whispering out to you.");
		System.out.println("Oracle: Hurry! Pythons killing me");
		System.out.println("You start to sprint.");
		System.out.println("You run up the hill and Gill sits right in front of you.");
		System.out.println("Unfortunatly there are two Knights sitting at the entrance.");
		System.out.println("************************************");
		System.out.println("Would you like to sneak into the city or fight your way through?");
		System.out.println("a) Fight your way through");
		System.out.println("b) Sneak in");
		desision = input.next().charAt(0);
		if(desision == 'a') {
			System.out.println("You decide to fight your way through");
			fighter(chad);
			jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
			System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
			
		}
		else {
			System.out.println("You sneak your way into the city.");
		}
		System.out.println("At the center of town you see a tall tower, according to all rpg plots ever, Python must be up there.");
		System.out.println("You make your way to the tower and through the front doors and look up.");
		System.out.println("You can tell your not alone.");
		System.out.println("The room grows hot and dark, black particles start to fill the room, burning as they touch your skin,");
		System.out.println("Python");
		System.out.println("******************");
		System.out.println("You: WHY Python, why do you want to kill Oracle.");
		System.out.println("");
		System.out.println("Python: Because I am the superior language....ehhhemm I mean essence.");
		System.out.println("Python: I am older and wiser than Oracle, I am the true ruler.");
		System.out.println("");
		System.out.println("Infuriated you attack");
		fighter(chad);
		jim.addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
		System.out.println("You found a weapon!!! " + "The weapons now in you inventory are: " + chad.playerWeapsName);
		System.out.println("You did it, you killed the evil that was Python, removing it from this world.");
		System.out.println("Oracle: Thank you, you have saved me.");
		System.out.println("Oracle: May creation flow and flourish");
		System.out.println("Congragulations!!!!!!!!! You WIN!");
		System.out.println("");
		
	}

	/* Author: Kevin Kauffman and Michael Boone
	 * Return type: Prints the main
	 * all implementation by Michael Boone
	 */
public static void main(String [ ] args) throws InterruptedException
{	
	Potion hPot = new Potion();
	//intro story
	StoryStart();
	//CharacterCreator
	Scanner input = new Scanner(System.in);
	int classType =0; // variable to call the proper class attributes for represented class
	Characters chad =  new Characters(); //new Characters(); // creates the character object
	CharacterC jim = new CharacterC();
	Weapon weapon = new Weapon();// character Creator object
	jim.characterMethod1(input, chad, classType); // call to the character creation method
	chad.printCharacters ( ); 
	int attack = chad.getDmg();
	int health = chad.getVitality();
	jim.foundPotion(chad, hPot);
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
	 //story calls
	part1(chad);
	System.out.println("");
	System.out.println("***************");
	System.out.println("Great job getting though the first story tree, here is you player inventory!");
	System.out.println("Here you can change out weapons and heal yourself (if you have potions)!");
	System.out.println("Press the number associated with the weapon to equip.");
	System.out.println(chad.getPlayerInventory());
	jim.equipWeapon(input, chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc, hPot);
	System.out.println("Would you like to use a potion?");
	char potion = input.next().charAt(0);
	if(potion == 'y') {
		jim.usePotion(hPot, chad);
	}
	else{
		System.out.println("no potion was used");
	}
	part2(chad);
	System.out.println("");
	System.out.println("***************");
	System.out.println("Great job getting though the second story tree, here is you player inventory!");
	System.out.println("Here you can change out weapons and heal yourself!");
	System.out.println("Press the number associated with the weapon to equip.");
	System.out.println(chad.getPlayerInventory());
	jim.equipWeapon(input, chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc, hPot);
	System.out.println("Would you like to use a potion?");
	potion = input.next().charAt(0);
	if(potion == 'y') {
		jim.usePotion(hPot, chad);
	}
	else{
		System.out.println("no potion was used");
	}
	part3(chad);
	}
}



