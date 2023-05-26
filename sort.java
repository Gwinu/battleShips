import java.util.Scanner;

class sort {

        //FOR THE GAME CLASS, ONLY USE BOTTOM PUBLIC METHODS

    private static String[] numList = {"1","2","3","4","5","6","7","8","9","10"};
    private static Scanner in = new Scanner(System.in);
    private static boolean isLetter(String ch) {
        return  ((ch.compareTo("a") >= 0 && ch.compareTo("z") <= 25) ||
            (ch.compareTo("A") >= 0 && ch.compareTo("Z") <= 25));
    }
    private static boolean isOneLetter(String ch) {
        return isLetter(ch) && ch.length() == 1;
    } //checks if a string is ALPHABETICAL LETTER
    private static boolean isOneTen(int ch) {
        return (ch >= 1 && ch <= 10);
    } //checks if an int is between 1-10
    private static boolean isOneTen(String ch) {
        for(String num : numList)
        {
            if(ch.equals(num))
                return true;
        }
        return false;
    }
    private static String checkEmpty(String statement) {
        if(statement.equals(" ")){
            System.out.println("put something in!???");
            statement = in.nextLine();
            checkEmpty(statement);
        }
        return statement;
    }
    public static String checkY(String statement){
        statement = statement.toLowerCase();
        if(statement.indexOf("yes") < 0 || statement.length() == 0)
            {
                System.out.println("Type in 'yes'");
                statement = in.nextLine().toLowerCase();
                checkY(statement);
            }
        return statement;
    }
    public static String checkYN(String statement) {
        statement = statement.toLowerCase();
        if(statement.indexOf("yes") < 0 && statement.indexOf("no") < 0)
            {
                System.out.println("Put in 'yes' or 'no'");
                statement = in.nextLine().toLowerCase();
                checkYN(statement);
            }
        return statement;
    }
    public static String checkVertical(String statement) {
        statement = statement.toLowerCase();
        if(statement.indexOf("ver") < 0 && statement.indexOf("hor") < 0)
        {
            System.out.println("Please type in 'ver' or 'hor' to determine verticality");
            statement = in.nextLine();
            checkVertical(statement);
        }
        return statement;
    }
    public static String checkCoords(String statement) {
        statement = statement.toLowerCase();
        if(statement.length() > 3 || statement.length() == 0)
        {
            System.out.println("Your statement is not the right length.");
            statement = in.nextLine();
            statement = checkCoords(statement);
        }
        else if(!(isOneLetter(statement.substring(0,1))))
        {
            System.out.println("The first character should be one letter.");
            statement = in.nextLine();
            statement =checkCoords(statement);
        }
        else if(!(isOneTen(statement.substring(1))))
        {
            System.out.println("Type in a valid number after the letter.");
            statement = in.nextLine();
            statement =checkCoords(statement);
        }
        else if(!(statement.substring(0,1).compareTo("a") <= 9))
        {
            System.out.println("The letter goes out of the map bounds.");
            statement = in.nextLine();
            statement =checkCoords(statement);
        }
        return statement;
    }
    public static String checkShipArgs(String statement) {
        statement = statement.toLowerCase();
        String section;
        if(statement.length() > 8 || statement.length() < 6 || statement.length() == 0)
        {
            System.out.println("Your statement is not the right length.");
            statement = in.nextLine();
            statement = checkShipArgs(statement);
        }
        section = statement.substring(0,2);
        if( !(section.equals("fr") || section.equals("dr") || section.equals("cr") || section.equals("ar")) )
        {
            System.out.println("Please designate the ship type correctly.");
            statement = in.nextLine();
            statement = checkShipArgs(statement);
        }
        section = statement.substring(statement.length() - 1);
        if( !(section.equals("v") || section.equals("h")) )
        {
            System.out.println("Please designate the verticality correctly.");
            statement = in.nextLine();
            statement = checkShipArgs(statement);
        }
        if(!(isOneLetter(statement.substring(3,4))) || !(statement.substring(3,4).compareTo("a") <= 9))
        {
            System.out.println("You either don't have a letter for the coordinates, or the letter goes out of the map bounds.");
            statement = in.nextLine();
            statement = checkShipArgs(statement);
        }
        if(statement.length() == 8)
        {
            if(!(isOneTen(statement.substring(4,6))))
            {
                System.out.println("Type in a correct number for the ship coordinates.");
                statement = in.nextLine();
                statement = checkShipArgs(statement);
            }
        }
        else
        {
            if(!(isOneTen(statement.substring(4,5))))
            {
                System.out.println("Type in a correct number for the ship coordinates.");
                statement = in.nextLine();
                statement = checkShipArgs(statement);
            }
        }
        return statement;
    }
}
