import java.util.Scanner;

public class game {
    
    private static int nCountdown = 30;
    private static int roundNum = 1;
    private static int roundSinceEvent = 0;
    private static boolean fireEvent = false;
    private static boolean greeting1 = false;
    private static boolean greeting2 = false;
    private static boolean deployMe = false; 
    private static player p1; //Oceania
    private static player p2; //Eurasia
    private static Scanner in = new Scanner (System.in);
    private static final long createdMillis = System.currentTimeMillis();
    private static String statement = "";
    
    public game(player a, player b)
    {
        p1 = a;
        p2 = b;
    }
    
    public player getPlayer1() 
    {
        return p1;
    }
    
    public player getPlayer2() 
    {
        return p2;
    }
    
    public void nextRound() {
        roundNum++;
         if(fireEvent = false) 
        {
            roundSinceEvent++; 
        } 
        else
        {
            roundSinceEvent = 0;
        }
        
        
    } 
    
    public static void introduction() {
        System.out.println("\n \n \n \nBattleship SPS: Setup Place Strike \nCreated by: Ethan, Phoenix, and Garrett \nProud Students of Mrs. Bjorgum's 2023 AP CSA Class \n \n");
        System.out.println("Mission Statement: \n\n Attention, Admirals! The year is 2084, and the world is teetering on the edge of absolute chaos due to an all-out war between two superpowers - Oceania and Eurasia. \n \n It is up to you and your fleets to resolve this conflict. \n \n Both sides have amassed landing forces poised to unleash a devastating assault on the opposing faction. \n \n Your fleets are the only line of defence standing between victory and total annihilation. \n \n You must sally forth with unwavering determination, nation. For if you do not clear the waves of enemy ships, you run the risk of the war devolving into a ruinous nuclear conflict! \n \n The time for hesitation is over, Admiral! The fate of your nation depends on you. \n \n Are you ready to lead your fleet to victory and save your country from the brink of destruction? \n \n If you understand the your objective, type yes  \n"); 
        String statement = in.nextLine();
        if(statement.indexOf("no") >= 0)
            System.out.println("\n shoot gun make ship go BOOM!");
    }
    public static void confirmation() {
        System.out.print("\nPlease indicate (yes) that only 1 player is able to see the screen so the planning sequence may begin.\n");
        String statement = in.nextLine();
        if(statement.indexOf("no") >= 0)
            System.out.println("Please ensure only one player is viewing the sceen");
    }
    
    public static void asciiCountD(int p)
    {
        p++;
        long x = 0;
        while(p != 0)
        {
        if(getCurrentMillis() % 1000 == 0 && x != getCurrentMillis()) 
        {
            x = getCurrentMillis();
            p--;
            if(p == 10)
            {
                String[][] one = {
                             {"1", "1", "1", "1", " ", " "," ", "0", "0", "0", "0", " "},
                             {" ", " ", "1", "1", " ", " ","0", "0", " ", " ", "0", "0"},
                             {" ", " ", "1", "1", " ", " ","0", "0", " ", " ", "0", "0"},
                             {" ", " ", "1", "1", " ", " ","0", "0", " ", " ", "0", "0"},
                             {"1", "1", "1", "1", "1", "1"," ", "0", "0", "0", "0", " "}};
                for(String[] t : one) 
                {
                    for(String l : t) 
                    {
                        System.out.print(l);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            else if(p == 9)
            {
                String[][] nine = {
                             {" ", "9", "9", "9", "9", " "},
                             {"9", "9", " ", " ", "9", "9"},
                             {" ", "9", "9", "9", "9", "9"},
                             {" ", " ", " ", " ", "9", "9"},
                             {" ", "9", "9", "9", "9", " "}};
                for(String[] pe : nine) 
                {
                    for(String ste : pe) 
                        {
                            System.out.print(ste);
                        }
                    System.out.println();
                }
                System.out.println();
            }
            
            else if(p == 8)
            {
                String[][] eight = {
                             {" ", "8", "8", "8", "8", " "},
                             {"8", "8", " ", " ", "8", "8"},
                             {" ", "8", "8", "8", "8", " "},
                             {"8", "8", " ", " ", "8", "8"},
                             {" ", "8", "8", "8", "8", " "}};
                for(String[] pet : eight) 
                {
                    for(String stew : pet) 
                        {
                            System.out.print(stew);
                        }
                    System.out.println();
                } 
                System.out.println();
            }
            
            else if(p == 7)
            {
                String[][] seven = {
                             {"7", "7", "7", "7", "7", "7"},
                             {" ", " ", " ", "7", "7", " "},
                             {" ", " ", "7", "7", " ", " "},
                             {" ", "7", "7", " ", " ", " "},
                             {"7", "7", " ", " ", " ", " "}};
                for(String[] pete : seven) 
                {
                    for(String stewi : pete) 
                        {
                            System.out.print(stewi);
                        }
                    System.out.println();
                }
                System.out.println();
            }
            
            else if(p == 6)
            {
                String[][] six = {
                             {" ", " ", "6", "6", "6", "6"},
                             {"6", "6", " ", " ", " ", " "},
                             {"6", "6", "6", "6", "6", " "},
                             {"6", "6", " ", " ", "6", "6"},
                             {" ", "6", "6", "6", "6", " "}};
                for(String[] peter : six) 
                {
                    for(String stewie : peter) 
                        {
                            System.out.print(stewie);
                        }
                    System.out.println();
                }
                System.out.println();
            }
            
            else if(p == 5)
            {
                String[][] five = {
                             {"5", "5", "5", "5", "5", "5"},
                             {"5", "5", " ", " ", " ", " "},
                             {"5", "5", "5", "5", "5", "5"},
                             {" ", " ", " ", " ", "5", "5"},
                             {"5", "5", "5", "5", "5", " "}};
                for(String[] peterG : five) 
                {
                    for(String stewieG : peterG) 
                        {
                            System.out.print(stewieG);
                        }
                    System.out.println();
                }
                System.out.println();
            }
            
            else if(p == 4)
            {
                String[][] four = {
                             {"4", "4", " ", " ", "4", "4"},
                             {"4", "4", " ", " ", "4", "4"},
                             {"4", "4", "4", "4", "4", "4"},
                             {" ", " ", " ", " ", "4", "4"},
                             {" ", " ", " ", " ", "4", "4"}};
                for(String[] b : four) 
                {
                    for(String bigB : b) 
                    {
                        System.out.print(bigB);
                    }
                    System.out.println();
                } 
                System.out.println();
            }
            
            else if(p == 3)
            {
                String[][] three = {
                             {" ", "3", "3", "3", "3", " "},
                             {"3", "3", " ", " ", "3", "3"},
                             {" ", " ", " ", "3", "3", "3"},
                             {"3", "3", " ", " ", "3", "3"},
                             {" ", "3", "3", "3", "3", " "}};
                for(String[] ba : three) 
                {
                    for(String bigBa : ba) 
                    {
                            System.out.print(bigBa);
                    }
                    System.out.println();
                } 
                System.out.println();
            }
            else if(p == 2)
            {
                String[][] two = {
                             {" ", "2", "2", "2", "2", " "},
                             {"2", "2", " ", " ", "2", "2"},
                             {" ", " ", " ", "2", "2", " "},
                             {" ", " ", "2", "2", " ", " "},
                             {"2", "2", "2", "2", "2", "2"}};
                for(String[] bal : two) 
                {
                    for(String bigBal : bal) 
                        {
                            System.out.print(bigBal);
                        }
                    System.out.println();
                }
                System.out.println();
            }   
            else if(p == 1)
            {
                String[][] one = {
                             {"1", "1", "1", "1", " ", " "},
                             {" ", " ", "1", "1", " ", " "},
                             {" ", " ", "1", "1", " ", " "},
                             {" ", " ", "1", "1", " ", " "},
                             {"1", "1", "1", "1", "1", "1"}};
                for(String[] bad : one) 
                {
                    for(String myBad : bad) 
                    {
                        System.out.print(myBad);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
    }
    public int getRoundNum() {
        return roundNum;
    }
    
    public static long getCurrentMillis() {
        return System.currentTimeMillis() - createdMillis;
    }
    public static boolean checkLoss(player p) 
    {
        for(int i = 0; i < p.getFleet().length; i++)
        {
            if(p.getFleet()[i] != null)
                return false;
        }
        return true;
    }
    
    public static void nextScene() //Would be replaced with the wave sequence if time
    {
        for(int k = 0; k < 100; k++)
             System.out.println();
    }// System.out.println() alot, so cant see previous stuff ; used to cut to next player turn
    public static void nextScene(int i)
    {
        for(int k = 0; k < i; k++)
            System.out.println();
    }
    public static void nuclearArmageddon()
    {
         for(int i  = 0; i < 45; i++)
            {
            System.out.println();
            }
            for(int r = 1; r < p1.getSBoard().getField()[0].length; r++) {
                for(int c = 1; c < p1.getSBoard().getField()[0].length; c++) {
                    p1.getSBoard().getField()[2*r][c] = "| 💥 ";
                    p2.getSBoard().getField()[2*r][c] = "| 💥 ";
                }
            }
            p1.showSBoard();
            p2.showSBoard();
            System.out.println("Bombs are bursting");
            System.exit(0);
    }
   
  /*  public static boolean strike(player p1, player p2, String power) //When they hit replaces ship was fire emoji 
    {
        System.out.println(p1.getName() + " is striking " + p2.getName() + "!");
        System.out.println();
        System.out.println("Type a 'LETTER_NUMBER' (ex: 'C5') for coordinates to STRIKE.");
	    String statement = in.nextLine();
	    statement.toLowerCase();
	    statement = sort.checkCoords(statement);
	    int x = Integer.parseInt(statement.substring(1));
	    int y = statement.substring(0,1).compareTo("a") + 1;
        System
	    
	    String target = p2.getSBoard().getField()[2*y][x];
	    
	    if(target.indexOf("📍") >= 0) {
	        System.out.println("Why would you hit there again?");
	        return true; }
        if(target.indexOf("⛵️") >= 0 || target.indexOf("🚢") >= 0 || target.indexOf("🚀") >= 0 || target.indexOf("✈️") >= 0)
        {
            p2.getSBoard().getField()[2*y][x] = "| 🔥 ";
            p1.getHBoard().getField()[y][x] = " 🔥 ";
            System.out.println("You have hit a ship!");
            for(int i = 0; i < p2.getFleet().length; i++)
            {
                if(p2.getFleet()[i] == null)
                    continue;
                System.out.println();
                battleShip ship = p2.getFleet()[i];
                int shipX = ship.getXPos();
                int shipY = ship.getYPos();
                if(ship.getVertical())
                {
                    String type = ship.getType();
                    if(type.equals("fr"))
                    {
                        if(x == shipX && (y == shipY))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                    else if(type.equals("dr")){
                        if(x == shipX && (y == shipY-1 || y == shipY || y == shipY+1))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY-2][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+2][shipX]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY-1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+1][shipX]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    } 
                    else if(type.equals("cr")){
                        if(x == shipX && (y == shipY-2 || y == shipY-1 || y == shipY || y == shipY+1 || y == shipY+2))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY-4][shipX]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY-2][shipX]= "| 💥 "; 
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+2][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+4][shipX]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY-2][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+2][shipX]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                    else if(type.equals("ar")){
                        if( (x == shipX && (y == shipY-2 || y == shipY-1 || y == shipY || y == shipY+1 || y == shipY+2))
                            || (x == shipX+1 && (y == shipY-2 || y == shipY || y == shipY+2)) )
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY-4][shipX]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY-2][shipX]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY-2][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+2][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+2][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY+4][shipX]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY-2][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+1][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY+2][shipX]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                }
                else
                {
                    String type = ship.getType();
                    if(type.equals("fr"))
                    {
                        if(x == shipX && (y == shipY))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                    else if(type.equals("dr")){
                        if(y == shipY && (x == shipX-1 || x == shipX || x == shipX+1))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY][shipX-1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+1]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY][shipX-1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+1]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                    else if(type.equals("cr")){
                        if(y == shipY && (x == shipX-2 || x == shipX-1 || x == shipX || x == shipX+1 || x == shipX+2))
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY][shipX-2]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY][shipX-1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+2]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY][shipX-2]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX-1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+2]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                    else if(type.equals("ar")){
                        if( (y == shipY && (x == shipX-2 || x == shipX-1 || x == shipX || x == shipX+1 || x == shipX+2))
                            || (y == shipY+1 && (x == shipX-1 || x == shipX || x == shipX+1)) )
                        {
                            ship.setHP(ship.getHP() - 1);
                            if(ship.getHP() == 0)
                            {
                                p2.getSBoard().getField()[2*shipY][shipX-2]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY][shipX-1]= "| 💥 ";
                                p2.getSBoard().getField()[2*shipY-1][shipX-1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY-1][shipX]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY-1][shipX+1]= "| 💥 ";
        	                    p2.getSBoard().getField()[2*shipY][shipX+2]= "| 💥 ";
        	                    
        	                    p1.getHBoard().getField()[shipY][shipX-2]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX-1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX-1]= "| 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY-1][shipX+1]= " 💥 ";
        	                    p1.getHBoard().getField()[shipY][shipX+2]= " 💥 ";
        	                    
        	                    p2.getFleet()[i] = null;
        	                    i--;
                            }
                        }
                    }
                }
            }
            return true;
        }
        else 
        {
            p2.getSBoard().getField()[2*y][x] = "| 💀 ";
            p1.getHBoard().getField()[y][x] = " 📍 ";
            System.out.println("You have missed the ship.");
            return false;
        }
    }
    */
    public static void tutorialP1(player p) {
        if(p == p1){
        System.out.println("\n \n(Country) Tutorial \n");
        System.out.println("Welcome to Command Headquarters Admiral! \n \n********************************************************************************* \nYour task is to strategically position the fleet in a way that makes it difficult for the enemy to attack it. \n \nYou must utilise the entire fleet, 3 Frigates 'FR', 2 destroyers 'DR', 1 Cruiser 'CR' and 1 aircraft carrier 'AR'. \nThe Frigates are 1 unit, the Destroyers 3 units, the Cruiser 5 units, and the Aircraft Carrier 8 units in length. \n");
        System.out.println("Frigate:          ⛵️\n");
        System.out.println("Destroyer:        🚢🚢🚢\n");
        System.out.println("Cruiser:          🚀🚀🚀🚀🚀\n");
        System.out.println("Aircraft carrier: ✈️✈️✈️✈️✈️");
        System.out.println("                     ✈️✈️✈️\n \n*********************************************************************************");
        System.out.println("You should be particularly mindful of keeping your carrier and battleship afloat as they grant you special abilities that can change the tide of battle. \n \nYour Aircraft Carrier allows you to call in a (country specific attack) every 10 turns. \n(Country specific AR attack). \n \nYour Cruiser allows you to fire a missile barrage every 5 turns that hits 3 consecutive tiles. \n \n*********************************************************************************");
        System.out.println("To place a ship, first specify the ship type(FR, DR, CR, or AR), then the Coordinate (Ex, A1), followed by the desired orientation of the ship, vertical or horizontal(V or H). \nThe coordinate entered represents the middle axis of the ship. \n \nAn order should look like this: 'DR B7 V'");
        System.out.println("\n********************************************************************************* \nGood luck, Admiral! The fate of your nation depends on your strategic decisions and tactical prowess on the battlefield.");
        nextScene(5);
        System.out.println("Press enter once you have finished reading the tutorial\n");
        nextScene(5);
        if(deployMe == true) {
            deployMe = false;
            ask(p);
        }
        statement = in.nextLine();
        if(statement.indexOf("a") >= 0) {
            System.out.println("I can't make it any clearer than that.");
        }
        nextScene();
    }
    }
    public static void tutorialP2(player p) {
        if(p == p2){
        System.out.println("\n \n(Country) Tutorial \n");
        System.out.println("Welcome to Command Headquarters Admiral! \n \n********************************************************************************* \nYour task is to strategically position the fleet in a way that makes it difficult for the enemy to attack it. \n \nYou must utilise the entire fleet, 3 Frigates 'FR', 2 destroyers 'DR', 1 Cruiser 'CR' and 1 aircraft carrier 'AR'. \nThe Frigates are 1 unit, the Destroyers 3 units, the Cruiser 5 units, and the Aircraft Carrier 8 units in length. \n");
        System.out.println("Frigate:          ⛵️\n");
        System.out.println("Destroyer:        🚢🚢🚢\n");
        System.out.println("Cruiser:          🚀🚀🚀🚀🚀\n");
        System.out.println("Aircraft carrier: ✈️✈️✈️✈️✈️");
        System.out.println("                     ✈️✈️✈️\n \n*********************************************************************************");
        System.out.println("You should be particularly mindful of keeping your carrier and battleship afloat as they grant you special abilities that can change the tide of battle. \n \nYour Aircraft Carrier allows you to call in a (country specific attack) every 10 turns. \n(Country specific AR attack). \n \nYour Cruiser allows you to fire a missile barrage every 5 turns that hits 3 consecutive tiles. \n \n*********************************************************************************");
        System.out.println("To place a ship, first specify the ship type(FR, DR, CR, or AR), then the Coordinate (Ex, A1), followed by the desired orientation of the ship, vertical or horizontal(V or H). \nThe coordinate entered represents the middle axis of the ship. \n \nAn order should look like this: 'DR B7 V'");
        System.out.println("\n********************************************************************************* \nGood luck, Admiral! The fate of your nation depends on your strategic decisions and tactical prowess on the battlefield.");
        nextScene(5);
        System.out.println("Press enter once you have finished reading the tutorial\n");
        nextScene(5);
        if(deployMe == true) {
            deployMe = false;
            ask(p);
        }
        statement = in.nextLine();
        if(statement.indexOf("a") >= 0) {
            System.out.println("I can't make it any clearer than that.");
        }
        nextScene();
    }
    }
    public static void helpP1(player p) {
        if(p == p1) {
            nextScene(3);
            System.out.println("---------------- Help ---------------");
        System.out.println("Ship Types: ('FR', 'DR', 'CR', 'AR')");
        System.out.println("Coordinates: (A-J, 1-10) (Ex, B7)");
        System.out.println("Orientation: (V or H)");
        System.out.println("Add Spaces After Each Element: 'DR B7 H'\n");
        System.out.println("---------------- Deployment Status ---------------");
        System.out.println("You must place 3 Frigates, 2 Destroyers, 1 Cruiser, and 1 Aircraft Carrier.");
        System.out.println("You have placed " + p.shipsToPlace() + ". \n");
        System.out.println("To view the main tutorial, type 'Tutorial'. Otherwise, please enter valid placement coordinates.");
        System.out.print("\nPlacement Coordinates: ");
        String statement = in.nextLine();
        if(statement.indexOf("tutorial") >= 0)
            {
                deployMe = true;
                tutorialP1(p1);
                
            }
        }
    }
    public static void helpP2(player p) {
        if(p == p2) {
            nextScene(3);
            System.out.println("---------------- Help ---------------");
        System.out.println("Ship Types: ('FR', 'DR', 'CR', 'AR')");
        System.out.println("Coordinates: (A-J, 1-10) (Ex, B7)");
        System.out.println("Orientation: (V or H)");
        System.out.println("Add Spaces After Each Element: 'DR B7 H'\n");
        System.out.println("---------------- Deployment Status ---------------");
        System.out.println("You must place 3 Frigates, 2 Destroyers, 1 Cruiser, and 1 Aircraft Carrier.");
        System.out.println("You have placed " + p.shipsToPlace() + ". \n");
        System.out.println("To view the main tutorial, type 'Tutorial'. Otherwise, please enter valid placement coordinates.");
        System.out.print("\nPlacement Coordinates: ");
        String statement = in.nextLine();
        if(statement.indexOf("tutorial") >= 0)
            {
                deployMe = true;
                tutorialP2(p2);
            }
        }
    }
    public static void greetingP1(player p) { //Oceania Greeting
        if(greeting1 == false && p == p1)
        {
        System.out.println("Greetings Admiral! If you are already familiar with the different types of ships along with their unique abilities, and you know how to place your ships, press enter. \n\n \n \n \nIf you don't already know how to play the game, type 'help' to engage the tutorial. \n \n \n \n \n \n \n \n \n \n ");
        nextScene(25);
        statement = in.nextLine();
        greeting1 = true;
        }
        nextScene();
        if((statement.indexOf("help") >= 0))
        {
            tutorialP1(p1);
        }
    }
    public static void greetingP2(player p) { //Eurasia Greeting
        if(greeting2 == false && p == p2)
        {
        System.out.println("Greetings Admiral! If you are already familiar with the different types of ships along with their unique abilities, and you know how to place your ships, press enter. \n\n \n \n \nIf you don't already know how to play the game, type 'help' to engage the tutorial. \n \n \n \n \n \n \n \n \n \n ");
        nextScene(25);
        statement = in.nextLine();
        greeting2 = true;
        }
        nextScene();
        if((statement.indexOf("help") >= 0))
        {
            tutorialP2(p2);
        }
    }
    public static void deploymentView(player p) {
        System.out.println("Welcome to the Deployment Screen Admiral!\n \n");
        System.out.println("Ship placements should be formatted as: '[SHIP_TYPE] [COORDINATES] [VERTICAL/HORIZONTAL}'.");
        nextScene(2);
        if(roundNum == 1) {
            p.showSBoard();
            nextScene(5);
        }

        System.out.print("\nYou have " + p.shipsToPlace() +  " yet to be placed. Where would you like to place your ship admiral? If you are still unsure of how to place a ship, type help. \n \n");
        System.out.print("Placement Coordinates: ");
	    String statement = in.nextLine();
        if(statement.indexOf("help") >= 0)
        {
            helpP1(p);
            helpP2(p);
        }
    }
    //Deployment Screen-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static boolean ask(player p) // executes sequence of ship placement, asking player for inputs    // returns true if successfully placed ship, false if not
    {   
        greetingP1(p);
        greetingP2(p);
        while (p.shipsToPlace().indexOf("0 FRs,") < 0 && p.shipsToPlace().indexOf("0 DRs,") < 0 && p.shipsToPlace().indexOf("0 CRs,") < 0 && p.shipsToPlace().indexOf("0 ARs") < 0) { {
            deploymentView(p);

	    statement = sort.checkShipArgs(statement);
	    int x;
	    if(statement.length() == 8)
            x = Integer.parseInt(statement.substring(4,6));
        else 
            x = Integer.parseInt(statement.substring(4,5));
	    int y = statement.substring(3,4).compareTo("a") + 1;
	 
	    boolean aVertical = false;
	    statement = statement.toLowerCase();
	    if(statement.indexOf("v") >= 0)
	            {aVertical = true;}

	    String type = statement.substring(0,2);
	            
	    nextScene();
	    if(type.equals("fr"))
	    {
	        if(p.addFrigate(x, y, aVertical))
	        {
	            return true; 
	        }
	    }
	    else if(type.equals("dr"))
	    {
	        if(p.addDestroyer(x, y, aVertical))
	        {
	            return true; 
	        }
	    }
	    else if(type.equals("cr"))
	    {
	        if(p.addCruiser(x, y, aVertical))
	        {
	            return true; 
	        }
	    }
	    else if(type.equals("ar"))
	    {
	        if(p.addAirCarrier(x, y, aVertical))
	        {
	            return true; 
	        }
	    }
	    nextScene();
	    System.out.println("Something with your ship arguments went wrong!");
    }
}
	    return false;   

    }

    public static void intermission()
    {
        String statement;
        System.out.println("Admiral, please give the device to the next player. Press anything to continue.");
        statement = in.nextLine();
        nextScene(65);
        System.out.println("Switch to next person!");
         System.out.println("To affirm you did so, please type 'yes'");
         sort.checkY(statement);
    }

    public static void main(String[] args) {
        Boolean monk = false;
        game game1 = new game(new player("Oceania"), new player("Eurasia"));
        //INTRODUCTION PHASE--------------------------------------------------------
        introduction();
        confirmation();
        nextScene();

        //PLANNING PHASE -------------------------------------------------------------------------------------
        //need to make look like google doc
        for(int i = 0; i <= 6; i++) {
            if( !(ask(game1.getPlayer1())) )
                i--; 
            game1.getPlayer1().showSBoard();
            System.out.println("This is your ship board! Press anything to continue to player 2's ");
        }
        nextScene();
        for(int i = 0; i <= 6; i++) {
            if( !(ask(game1.getPlayer2())) )
                i--; 
            System.out.println("This is your ship board! Press anything to continue to STRIKE phase.");
        }
        
        nextScene();
        System.out.println("It is going to be " + game1.getPlayer1().getName() + "'s turn. Please ensure the screen is only visible to them");
        nextScene(1);
        statement = in.nextLine();
        
        player pTurnNow = game1.getPlayer1();
        player pTurnNot = game1.getPlayer2();
        boolean wasHit = false;
        
        //ATTACKING PHASE ----------------------------------------------------------------------
            
        while(!(checkLoss(pTurnNow)))
        {
            
            //Event Sequence (if valid)_________________________________________________
            System.out.println("Day: " + roundNum + "\n");
            System.out.println(RandomEvent());
            nextScene(5);
            //Intellegence Briefing_______________________________________________________
            System.out.println("********************************************************************************* \nYour Daily Intelligence Briefing brought to you By The Ministry of Intelligence: \n");
            
            //Hit or No Hit Feedback
           // if(roundNum == 1 && p2.getName().indexOf("Oceania") < 0) {  <--Supposed to trigger if and only if it is Oceania (p1's turn) on the very first round. 
           //     System.out.println("Admiral, it is your duty to ignite this war. Fire the first shot and aim true. If neither side is able to destroy the opposing fleet in a timely manner, they risk all out nuclear war!");
           // }
            if(wasHit) { //will become an else if
                System.out.println("You were hit! \n"); }
            else {
                System.out.println("The foolish and incompetent " + pTurnNot.getName() + "ians fired harmlessly into the ocean. \n"); }
            wasHit = false;
            
            //shipboard
            pTurnNow.showSBoard();
            
            //Rating Assessment
            System.out.println("");
            System.out.println("*********************************************************************************");
            System.out.println(pTurnNow.ratingAssessment(pTurnNot));
            System.out.println("\n*********************************************************************************");
            
            
            //Countdown to Armageddon
            System.out.println("☢ Countdown to Nuclear Armageddon: " + nCountdown + "☢ \n");
            
            //Nuclear Assessment
            System.out.println(nuclearAssessment());
            nextScene(2);
            
            System.out.println("Press anything to continue to your [STRIKE] phase");
            statement = in.nextLine();
            nextScene(1);
            
            //Strike Sequence______________________________________________________________
            
            pTurnNow.showHBoard();
          //  if(strike(pTurnNow, pTurnNot))
             //   wasHit = true;
           // nextScene();
          //  pTurnNow.showHBoard();
           // System.out.println();
            if(wasHit)
                System.out.println("You hit a ship!");
            else
                System.out.println("You missed completely! Wow! /n");
            
            statement = in.nextLine();
            intermission();
            nextScene();
            System.out.println("The next player should have the device. Press anything to continue to your [STRIKE] phase.");
            nextScene();
            
            if(pTurnNow == game1.getPlayer2())
            {
                roundNum++;
                nCountdown--;
            }
            player temp = pTurnNow;
            pTurnNow = pTurnNot;
            pTurnNot = temp;
            
            if(nCountdown == 0)             
            {
                System.out.println("❗❗❗❗You have run out of turns. Nuclear Armageddon commencing❗❗❗❗");
                asciiCountD(10);
                nuclearArmageddon();
            }
        }
        
// LOSING SCREEN ----------------------------------------------------------------------------------------------------------------------------------------------------
        //I get that this is a placeholder, but the only 3 possible endings are Oceania wins, Eurasia wins, or Nuclear Armaggedon.
        for(int i  = 0; i < 65; i++)
        {
            System.out.println();
        }
        pTurnNow.showSBoard();
        System.out.println();
        System.out.println("Sorry " + pTurnNow.getName() + " all your ships have been destroyed. Better luck next time.");
        while(!monk)
        {
            long iLoveComputerScience = 0;
            if(getCurrentMillis() % 8000 == 0 && iLoveComputerScience != getCurrentMillis())  //NEED TO FIX
            {                                       //wat this do
                iLoveComputerScience = getCurrentMillis();
                nextScene(65);
                
                pTurnNot.showSBoard();
                System.out.println("Congulations " + pTurnNot.getName() + " you have won the battle. Good luck on your next endeavor");   
                monk = true;
            }   
        }
    }
    
    //Considerations: Needs to take the value of all unhit parts of each ship (21)
    //                + if cruiser is not destroyed (3) + if AR isn't destroyed (6)
    //      
    //                So, the ratings are initially equal at 30. 
    

//Considerations: This one should just work as it is. 


public static String nuclearAssessment() 
{
   String[] nAss = new String[10];
   
   //nCountdown > 20
   nAss[0] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n          The risk of nuclear war at this time is low. Try and keep it this way Admiral."; 
   nAss[1] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n          The risk of nuclear war at this time is low. May we not antagonise (other country) further.";
   nAss[2] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n          The risk of nuclear war at this time is low. Pray we keep it this way.";
   
   //nCountdown > 10
   nAss[3] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is moderate. Let it rise no more Admiral.";
   nAss[4] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is moderate. May we not antagonise (other country) further.";
   nAss[5] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is moderate. Pray it de-escalates from here.";
   
   //nCountdown > 5
   nAss[6] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is high. You and you alone can resolve this conflict Admiral.";
   nAss[7] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is high. May we not antagonise (other country) further.";
   nAss[8] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           The risk of nuclear war at this time is high. Pray it rises no further.";
   
   //nCountdown < 5
   nAss[9] = "A risk assessment of Nuclear War by the Ministry of Intelligence: \n\n           Nuclear war is imminent.";
   
    if(nCountdown >= 20)
    {
        int r1 = (int) (Math.random() * 3);
        return nAss[r1];
    }
    else if(nCountdown >= 10)
    {
        int r2 = (int) (Math.random() * 3) + 3;
        return nAss[r2];
    }
    else if(nCountdown > 5)
    {
        int r3 = (int) (Math.random() * 3) + 6;
        return nAss[r3];
    }
    else
    {
        return nAss[9];
    }
    
}





public static String RandomEvent()
{
    int defaultChance = 10;
    int daysSinceLastEvent = roundSinceEvent;    // okay the variable is called "roundNum"
                                                 // the methods are "getRoundNum()" to get the 
                                                 // and "nextRound()" to increment it by +1
    int random = (int) (Math.random() * 100) + 1;
    int chance = defaultChance + (15 * daysSinceLastEvent);
    int eventID = 0;
    //System.out.println(random + " " + chance + " " + eventID); <-- to test event system
    String[] event = new String[28];
  
    event[0] = "Event: Pleasantries Exchanged!   \n\n In a rare moment of passion and grace, the leader of (the opposing nation) has complimented the state of our great nation and the strength of our armed forces. A nuclear crisis may be averted after all…     \n \n Effect: Increases the number of days before armageddon";
   
    event[1] = "Event: Diplomatic Insult!    \n\n While we have come to expect nothing but brutishness and savagery from the leader of (the opposing nation), they have crossed the line in their most recent public address! They call our people feeble and weak, unable to stand up to their might. Nonsense! We will convince him of our strength…   \n  \n   Effect: Decreases the number of days before armageddon";
    
    event[2] = "Event: Hostage Crisis!   \n\n Today is a glorious day for our country! We have captured the son of (other country)'s leader! Our generals have hastily prepared a military tribunal for him. Their choice of what to do with him will significantly affect our relationship with (other country)...";
   
    event[3] = "Event: Civilian Fishing Boat Struck!    \n\n Admiral, we have great respect for your command, but your recent misses have been extremely costly on the diplomatic front. It appears one of your strikes hit a civilian fishing vessel full of (opposing country)ians. They are accusing us of violating the basic rules of warfare. Don't let this event be your legacy…";
    
    event[4] = "Event: Lost at Sea! Poseidon be damned.    \n\n Stormy weather has caused one of our frigates to capsize! ";
    
    event[5] = "Event: Triumph at the Ministry of Intelligence!   \n\n Recent intelligence has allowed us to eliminate 2x2 squares from the map! ";
   
    event[6] = "Event: Fog!  \n\n Fog descends across the battlefield! \n\n You have lost a portion of your previously visible squares on the hit marker map. ";
    
    event[7] = "Event: A Wonder of Aviation!    \n\n The Ministry of Peace has developed the p16 Naval Bomber ahead of schedule! (Opposing nations)'s navy won't know what hit them..     \n \n  Effect: The aircraft carrier's ability will now only take 8 turns to refresh. ";
   
    event[8] = "Event: Disaster on the Runway!     \n\n A plane mysterious caught fire last night while positioned near the flight deck. This blatant act of sabotage will not go unnoticed! The perpetrator must be caught and swiftly brought to justice…   \n\n  Effect: It will take an additional 1-5 turns before kamikaze/dive bomb is ready again.";
    
    event[9] = "Event: A Promising Young Battery Captain!  \n\n The talents of a young battery captain have not gone unnoticed! He has been promoted to the rank of Lieutenant Commander. With him at the helm, the gunnery crew aboard the CR should be firing faster than ever…    \n \n  Effect: Under his command, the CR missile barrage ability will now be available every 4 turns. ";
    
    event[10] = "Event: Flooding ruins gunpowder stores!   \n\n A previously overlooked part of our CR has sprung a leak! Water has infiltrated the ship's main ammunition storage room, completely ruining all of the ship's munitions. We must be more disciplined in the future…      \n\n   Effect: It will take an additional 3-5 turns before the missile barrage ability is available. ";
   
    event[11] = "Event: Pleasantries Exchanged!    \n\n The diplomatic channels have been filled with nothing but venom and hate for far too long. But today, our leader extended an olive branch and complimented the military prowess of (other country). Could this be the beginning of a new era of cooperation and diplomacy?   \n \n  Effect: Increases the number of days before armageddon";
    
    event[12] = "Event: Diplomatic Insult!  \n\n We have been provoked, insulted, and belittled by (other country) for far too long. Their latest act of disrespect cannot go unanswered. Our leader has responded with force, and we will not back down until they show us the respect we deserve.   \n \n  Effect: Decreases the number of days until armageddon";
   
    event[13] = "Event: Hostage Crisis!    \n\n A shocking and appalling development Admiral! The brutish and oppressive 4th Mariners Division of (other country) has managed to capture the son of our great leader. Our diplomats are awaiting word on his condition, but they are already trying to negotiate his return. If they kill him there will be trouble…";
    
    event[14] = "Event: Hostage Crisis!    \n\n The military tribunal was suspended by our great leader before they could make a ruling. The world held its breath as we negotiated with (other country). It was eventually decided that all of our POWs would be returned to us in exchange for the release of the son. Many called it impossible for cooler heads to prevail…  \n \n  Effect: Increases the number of days before armageddon";
    
    event[15] = "Event: Hostage Crisis!    \n\n In recent days, a diplomatic crisis has been unfolding over the capture of our great leader's son. Intense negotiations over his release have embittered both sides, but today a deal has been struck! What a momentous day! Perhaps the people of (opposing country) have some humanity after all…     \n \n   Effect: Increases the number of days before armageddon";
   
    event[16] = "Event: Civilian Fishing Boat Struck!    \n \n  The barbaric forces of (opposing country) have struck a civilian fishing boat off of our coast! Do those brutes not know the basic rules of warfare, or are they using them as a playbook to conduct their offensive? This act of violence will not be forgotten…   \n \n   Effect: Decreases the number of days until armageddon";
    
    event[17] = "Event: Civilian Fishing Boat Struck!    \n \n  The ministry of peace has issued the following statement in regards to the incident with the fishing vessel, 'Your people should not have been fishing in our waters! This was a clear violation of our territorial sovereignty, and our forces acted accordingly. We regret the loss of life, but your people need to understand that there will be consequences for their actions. We will not be deterred in our mission to protect our nation at all costs.' A day that will live in infamy…     \n \n  Effect: Decreases the number of days until armageddon";
   
    event[18] = "Event: On an Angel's Wings!   \n\n  A frigate previously thought lost to bad weather has miraculously made contact with headquarters! Hope is not lost!  \n \n  Effect: Regain control over 1 previously sunk frigate.";
    
    event[19] = "Event: Recruitment Drive is a Resounding Success!    \n\n  The great people of our nation have united behind the war effort by enlisting in droves! We can use these new recruits to better staff the 'CR' and the 'AC'...  \n \n  Effect: Cooldown cap for special abilities is reduced by 1.";
    
    event[20] = "Event: Recruitment Drive is a Complete Failure!     \n \n  The great people of our nation aren't uniting around the war effort like we expected. We will not be able to properly staff the 'CR' and the 'AC'...    \n  \n  Effect: Cooldown cap for special abilities is increased by 1.";
   
    event[21] = "Event: A foreign defector!   \n\n  It appears (the opposing nation) is growing fatigued from the war and the threat of nuclear destruction. One of their senior officials has leaked the position of one of their few remaining vessels. This could be what we need to end the war!      \n \n Effect: You are advised to strike at the following coordinate: XX";
    
    event[22] = "Event: Solar Flare!  \n \n  A solar flare has descended across the Pacific Ocean! Our comms devices are rendered useless by this storm. You may still issue strike orders, but the maps will be temporarily unavailable as we wait for the solar flare to pass.   \n  Effect: Lose access to previously garnered map data for 1-2 turns.";
   
    event[23] = "A dire warning from the Ministry of Intelligence:    \n\n  Admiral, this conflict is reaching a breaking point. In recent days, leaders of Eurasia and Oceania have become manic and trigger-happy, so much so that they are willing to end this war by any means necessary.  To avoid a nuclear catastrophe, you must defeat the enemy fleet within the next 5 days. ";
    
    event[24] = "A dire warning from the Ministry of Intelligence:   \n \n  Admiral, time is a finite resource. We are rapidly approaching a future where the Earth isn't inhabited by the human race any longer. Politicians are unable to resolve this crisis. It is up to you Admiral. Defeat the enemy fleet in the next 4 days before nuclear armageddon is unavoidable!";
    
    event[25] = "A dire warning from the Ministry of Intelligence:    \n\n  Admiral, we are bordering on complete and utter disaster. Your family, hell, the entire country of O/E is counting on you. You must do everything in your power in the next 3 days to destroy the enemy fleet and eliminate the possibility of all out nuclear war!";
   
    event[26] = "A dire warning from the Ministry of Intelligence:    \n \n Admiral, the fate of humanity is in your hands. Never in the course of human history have we been this close to all out nuclear war. There is no more time for tactical blunders in the next 2 days. You must strike quickly and decisively to avoid the end of life as we know it. ";
    
    event[27] = "A dire warning from the Ministry of Intelligence:     \n\n Admiral, you are humanity's last chance. Today is do or die. If you fail to eliminate the enemy fleet on this turn, irreprehensible harm will be brought upon every person on the planet. For the sake of everything that is holy and well, do not let the countdown strike zero!";
   
    //roundNum % 10 != 0 <-- Add back
    if( chance > random && fireEvent == false  && nCountdown>5) 
    {
        eventID = (int) (Math.random()*11); //array of booleans so no event fires again.
        fireEvent = true;
        return event[eventID];
    }
    else if(eventID == 0 && fireEvent == true && nCountdown>5) //Pleasantries Exchanged
    {
        eventID += 11;
        fireEvent = false;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 1 && fireEvent == true && nCountdown>5) //Diplomatic Insult
    {
        eventID += 11;
        fireEvent = false;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 2 && fireEvent == true && nCountdown>5) //Hostage Crisis
    {
        eventID += 11;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 13 && fireEvent == true && nCountdown>5) //Hostage Crisis
    {
        eventID += 1;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 14 && fireEvent == true && nCountdown>5) //Hostage Crisis
    {
        eventID += 1;
        fireEvent = false;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 3 && fireEvent == true && nCountdown>5) //Civilian Fishing Boat Struck
    {
        eventID += 13;
         //effect of the event
        return event[eventID];
    }
    else if(eventID == 3 && fireEvent == true && nCountdown>5) //Civilian Fishing Boat Struck
    {
        eventID += 14;
        fireEvent = false;
         //effect of the event
        return event[eventID];
    }
    //This event will NOT fire for the correct player!!
    else if(eventID == 4 && fireEvent == true && nCountdown>5) //On an Angel's Wings
    {
        eventID += 14;
        fireEvent = false;
         //effect of the event
        return event[eventID];
    }
    else if(roundNum == 10 && fireEvent == false && nCountdown>5) //need another check for if they winning or losing
    {
        eventID = 19; 
         //effect of the event
        return event[eventID];
    }
    else if(roundNum == 10 && fireEvent == false && nCountdown>5) //need another check for if they winning or losing
    {
        eventID = 20; 
         //effect of the event
        return event[eventID];
    }
    else if(roundNum == 20 && fireEvent == false && nCountdown>5) //need another check for if they winning or losing
    {
        eventID = 21; 
         //effect of the event
        return event[eventID];
    }
    else if(roundNum == 20 && fireEvent == false && nCountdown>5) //need another check for if they winning or losing
    {
        eventID = 22;
         //effect of the event
        return event[eventID];
    }
    else if(nCountdown == 5) //Tm5
    {
        eventID = 23;
        return event[eventID];
    }
    else if(nCountdown == 4) //Tm4
    {
        eventID = 24;
        return event[eventID];
    }
    else if(nCountdown == 3) //Tm3
    {
        eventID = 25;
        return event[eventID];
    }
    else if(nCountdown == 2) //Tm2
    {
        eventID = 26;
        return event[eventID];
    }
    else if(nCountdown == 1) //Tm1
    {
        eventID = 27;
        return event[eventID];
    }
    else
    {
        fireEvent = false; 
    }
    
    
    //To give the remaining events their effect 
    //(these are the events that have outcomes that only pertain to 1 player)
    
    
    if (eventID == 4 && fireEvent == true) //Lost at Sea
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 5 && fireEvent == true) //Triumph at the Ministry of Intellegence
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 6 && fireEvent == true) //Fog
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 7 && fireEvent == true)  //A Wonder of Aviation
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 8 && fireEvent == true) //Disaster on the Runway
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 9 && fireEvent == true) //A Promising Young Battery Capitan
    {
        fireEvent = false; 
        //effect of the event
    }
    else if (eventID == 10 && fireEvent == true) //Flooding Ruins Gunpowder Stores!
    {
        fireEvent = false; 
        //effect of the event
    }
    return "Glory to (Current County), peaceful skies";
}

}
