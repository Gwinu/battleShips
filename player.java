

class player {
    
    
    private hitBoard hBoard = new hitBoard();
    private board sBoard = new board();
    private battleShip[] fleets = new battleShip[7]; // order is: 3 frigate, 2 destroyer, 1 cruiser, 1 aircraftCarrier
    
    private int numFR = 0;
    private int numDR = 0;
    private int numCR = 0;
    private int numAR = 0;
    private String name;

    public player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public board getSBoard(){
        return sBoard;
    }
    public hitBoard getHBoard(){
        return hBoard;
    }
    public int getNumFR() {
        return numFR;
    }
    public int getNumDR() {
        return numDR;
    }
    public int getNumCR() {
        return numCR;
    }
    public int getNumAR() {
        return numAR;
    }
    public void setNumFR(int x) {
        numFR = x;
    }
    public void setNumDR(int x) {
        numDR = x;
    }
    public void setNumCR(int x) {
        numCR = x;
    }
    public void setNumAR(int x) {
        numAR = x;
    }
    public void showSBoard() {
        System.out.println("   " + getName() + "'s turn   ");
        sBoard.showField();
    }
    public void showHBoard() {
        System.out.println("   " + getName() + "'s turn   ");
        hBoard.showField();
    }
    
    public battleShip[] getFleet() {
        return fleets;}
    
    public String toString() {
        String fleetList = " ";
        for(battleShip b0 : fleets)
            fleetList += ", " + b0;
        return name + ": " + fleetList;  }
    public void showBoards(){
        System.out.println(getName() + "'S TURN ----------------------------------");
        System.out.println();
        hBoard.showField();
        System.out.println();
        sBoard.showField();
    }
    public battleShip getShip(int shipNumber){
        return fleets[shipNumber];}
        
    public int findNextSpace() {
        for(int i = 0; i < fleets.length; i++) {
            if(fleets[i] == null)
                return i;
        }
        return -1;
    }
   public int rating() {
    int rate = 30;
    int totalHP = 0;
    for(battleShip ship : getFleet() )
    {
        if(ship == null)
            continue;
        totalHP += ship.getHP();
    }
    rate -= 21 % (totalHP);
    if(getFleet()[6].getHP() == 0)
        rate -= 6;
    if(getFleet()[5].getHP() == 0)
        rate -= 3;
    return rate;
    }
    
    public boolean winning(player player)
    {
    if(rating() > player.rating())
        return true;
    else
        return false;
    }   
    
    public String shipsToPlace() {
        int FRs = 0; int DRs = 0; int CRs = 0; int ARs = 0;
        for(int i = 0; i <= 2; i++)
        {
            if(fleets[i] == null)
                FRs++;
        }
        for(int i = 3; i <= 4; i++)
        {
            if(fleets[i] == null)
                DRs++;
        }
        for(int i = 5; i <= 5; i++)
        {
            if(fleets[i] == null)
                CRs++;
        }
        for(int i = 6; i <= 6; i++)
        {
            if(fleets[i] == null)
                ARs++;
        }
        return FRs + " FRs, " + DRs + " DRs, " + CRs + " CRs, " + ARs + " ARs";
    }
    public int numShipsToPlace() {
        int shipsToPlace = 0;
        for(battleShip ship : fleets)
        {
            if(ship == null)
                shipsToPlace++;
        }
        return shipsToPlace;
    }
    public String ratingAssessment(player player) // P1.ratingAssessment(P2)
{                                           //checks if P1 is the one winning,
                                            //where p1 is current player
    int oRating = rating(); // P1's rating
    int eRating = player.rating(); //P2's rating
    boolean winning = winning(player);   //checks if P1 is winning
    if(oRating == eRating)
    {
        return "        The ministry of intelligence projects that the balance of power is even";
    }
    
    else if(Math.abs(oRating - eRating) <= 5 && winning) 
    {
        return "        The ministry of intelligence projects a slight advantage for our naval forces in the ongoing conflict, with successful maneuvers executed by our fleet against the enemy vessels.";
    }
    
    else if(Math.abs(oRating - eRating) <= 5 && !winning) 
    {
        return "        The ministry of intelligence projects a non-advantageous situation for our navy. We have sustained greater losses than our enemy. Proceed with caution.";
    }
    
    else if(Math.abs(oRating - eRating) <= 10 && winning)
    {
        return "        The ministry of intelligence projects a significant lead for our navy in the ongoing naval war, as our ships continue to dominate and outmaneuver the enemy's fleets.";
    }
    
    else if(Math.abs(oRating - eRating) <= 10 && !winning) 
    {
        return "        The ministry of intelligence projects a perilous situation for our navy, as the enemy's superior tactics and weaponry have resulted in substantial losses and damage to our ships.";
    }
    
    else if(Math.abs(oRating - eRating) <= 15 && winning) 
    {
        return "        The ministry of intelligence projects that our naval forces are currently overpowering the enemy, executing successful blockades and naval assaults that are leaving the enemy forces reeling. We are on the verge of victory.";
    }
    
    else if(Math.abs(oRating - eRating) <= 15 && !winning) 
    {
        return "        The ministry of intelligence projects an imminent and catastrophic defeat for our navy, as the enemy's forces close in on our last remaining vessels, leaving us with little hope of mounting a successful defense.";
    }
    return " ";
    
}
    
    public boolean addFrigate(int x, int y, boolean vertical)//Official adds the ship to fleet(arraylist of ships each player has)
    {
        String bees = "|_⛵️ ";
        String target = sBoard.getField()[2*y][x];
        if(vertical)
        {
            if(y < 1 || y > sBoard.getField()[0].length-1 || numFR >= 3)
                return false;
            if(target.indexOf("⛵️") >= 0 || target.indexOf("🚢") >= 0 || target.indexOf("🚀") >= 0 || target.indexOf("✈️") >= 0)
                return false;
            else
            {
    	        sBoard.getField()[2*y][x]= bees;
            }
        }
        else
        {
            System.out.println(x + " " + sBoard.getField().length);
            if(x < 1 || x > sBoard.getField()[0].length-1 || numFR >= 3)
                return false;
            if(sBoard.getField()[2*(y)][x].indexOf("⛵️") >= 0 || sBoard.getField()[2*y][x].indexOf("🚢") >= 0 || sBoard.getField()[2*y][x].indexOf("🚀") >= 0 || sBoard.getField()[2*y][x].indexOf("✈️") >= 0)
                return false;
	        sBoard.getField()[2*y][x]= bees; 
        }
        fleets[numFR+0] = new frigate(x, y, vertical);
        numFR++;
        return true;
    }
    
    public boolean addDestroyer(int x, int y, boolean vertical)//Official adds the ship to fleet(arraylist of ships each player has)
    {
        String bees = "|_🚢️ ";
        if(vertical)
        {
            if(y <= 1 || y >= sBoard.getField()[0].length-1 || numDR >= 2)
                return false;
            for(int i = -1; i <= 1; i++)
            {
                if(sBoard.getField()[2*(y+i)][x].indexOf("⛵️") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚢") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚀") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y-2][x]= bees;
	        sBoard.getField()[2*y][x]= bees;
	        sBoard.getField()[2*y+2][x]= bees;
        }
        else
        {
            if(x <= 1 || x >= sBoard.getField()[0].length-1 || numDR >= 2)
                return false;
            for(int i = -1; i <= 1; i++)
            {
                if(sBoard.getField()[2*(y)][x+i].indexOf("⛵️") >= 0 || sBoard.getField()[2*y][x+i].indexOf("🚢") >= 0 || sBoard.getField()[2*y][x+i].indexOf("🚀") >= 0 || sBoard.getField()[2*y][x+i].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y][x-1]= bees;
	        sBoard.getField()[2*y][x]= bees;
	        sBoard.getField()[2*y][x+1]= bees;
        }
        fleets[numDR + 3] = new destroyer(x, y, vertical);
        numDR++;
        return true;
    }
    
    public boolean addCruiser(int x, int y, boolean vertical)//Official adds the ship to fleet(arraylist of ships each player has)
    {
        String bees = "|_🚀 ";
        if(vertical)
        {
            if(y <= 2 || y >= sBoard.getField()[0].length-1-1 || numCR >= 1)
                return false;
            for(int i = -2; i <= 2; i++)
            {
                if(sBoard.getField()[2*(y+i)][x].indexOf("⛵️") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚢") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚀") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y-4][x] = bees;
            sBoard.getField()[2*y-2][x]= bees;
	        sBoard.getField()[2*y][x]= bees;
	        sBoard.getField()[2*y+2][x]= bees;
	        sBoard.getField()[2*y+4][x] = bees;
        }
        else
        {
            if(x <= 2 || x >= sBoard.getField()[0].length-1-1)
                return false;
            for(int i = -2;i <= 2; i++)
            {
                if(sBoard.getField()[2*(y)][x+i].indexOf("⛵️") >= 0 || sBoard.getField()[2*y][x+i].indexOf("🚢") >= 0 || sBoard.getField()[2*y][x+i].indexOf("🚀") >= 0 || sBoard.getField()[2*y][x+i].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y][x-2] = bees;
            sBoard.getField()[2*y][x-1]= bees;
	        sBoard.getField()[2*y][x] = bees;
	        sBoard.getField()[2*y][x+1] = bees;
	        sBoard.getField()[2*y][x+2] = bees;
        }
        fleets[numCR + 5] = new cruiser(x, y, vertical);
        numCR++;
        return true;
    }
    
    public boolean addAirCarrier(int x, int y, boolean vertical)//Official adds the ship to fleet(arraylist of ships each player has)
    {
        String bees = "|_✈️️ ";
        if(vertical)
        {
            if(y <= 2 || y >= sBoard.getField()[0].length-1-1 || x <= 0 || numAR >= 1)
                return false;
            for(int i = -2; i <= 2; i++)
            {
                if(sBoard.getField()[2*(y+i)][x].indexOf("⛵️") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚢") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚀") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("✈️") >= 0)
                    return false;
            }
            for(int i = -1; i <= 1; i++)
            {
                if(sBoard.getField()[2*(y+i)][x].indexOf("⛵️") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚢") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("🚀") >= 0 || sBoard.getField()[2*(y+i)][x].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y-4][x] = bees;
            sBoard.getField()[2*y-2][x]= bees;
	        sBoard.getField()[2*y][x]= bees;
	        sBoard.getField()[2*y+2][x]= bees;
	        sBoard.getField()[2*y+4][x] = bees;
	        
	        sBoard.getField()[2*y-2][x+1] = bees;
	        sBoard.getField()[2*y][x+1] = bees;
	        sBoard.getField()[2*y+2][x+1] = bees;
        }
        else
        {
            if(x <= 2 || x >= sBoard.getField()[0].length-1-1 || y <= 0 || numAR >= 1)
                return false;
            System.out.println(x + " " + y);
            System.out.println(2*y);
            for(int i = -2; i <= 2; i++)
            {
                if(sBoard.getField()[2*(y)][x+i].indexOf("⛵️") >= 0 ||
                sBoard.getField()[2*y][x+i].indexOf("🚢") >= 0 || 
                sBoard.getField()[2*y][x+i].indexOf("🚀") >= 0 || 
                sBoard.getField()[2*y][x+i].indexOf("✈️") >= 0)
                    return false;
            }
            for(int i = -1; i <= 1; i++)
            {
                if(sBoard.getField()[2*(y+1)][x+i].indexOf("⛵️") >= 0 || sBoard.getField()[2*(y+1)][x+i].indexOf("🚢") >= 0 || sBoard.getField()[2*(y+1)][x+i].indexOf("🚀") >= 0 || sBoard.getField()[2*(y+1)][x+i].indexOf("✈️") >= 0)
                    return false;
            }
            sBoard.getField()[2*y][x-2] = bees;
            sBoard.getField()[2*y][x-1]= bees;
	        sBoard.getField()[2*y][x] = bees;
	        sBoard.getField()[2*y][x+1] = bees;
	        sBoard.getField()[2*y][x+2] = bees;
	        
	        sBoard.getField()[2*y-2][x-1] = bees;
	        sBoard.getField()[2*y-2][x] = bees;
	        sBoard.getField()[2*y-2][x+1] = bees;
        }
        fleets[numAR + 6] = new airCarrier(x, y, vertical);
        numAR++;
        return true;
    }
}