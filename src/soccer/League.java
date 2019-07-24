package soccer;

import javax.xml.transform.sax.SAXSource;

public class League {
    public static void main(String[] args){
//        app code here

//        declaring the players
        Player player1 = new Player();
        player1.playerName = "Big Show";

        Player player2 = new Player();
        player2.playerName = "Mark Hendry";

        Player player3 =  new Player();
        player3.playerName = "Brock Lesnar";

        Player player4 = new Player();
        player4.playerName = "Great Khali";

        Player player5 =  new Player();
        player5.playerName = "Triple H";

//        a Player array called thePlayers that comprises the five Player objects
//        that you just instantiated.
        Player[] thePlayers = {player1, player2, player3, player4, player5};

        Team team1 = new Team();

//        Set the teamName attribute of the Team object to "The Legends".
        team1.teamName = "The Legends";

//        Set the playerArray attribute of the Team object to the Player array thePlayers.
        team1.playerArray = thePlayers;
        System.out.println(team1.playerArray[4]);

        System.out.println("- - - - - - - - -");

        Team team2 = new Team();
        team2.teamName = "The Brookies";
        team2.playerArray = new Player[5];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Rey Mysterio";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Fing Lay";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "John Cena";

        team2.playerArray[3] = new Player();
        team2.playerArray[3].playerName = "Serf Rollins";

        team2.playerArray[4] = new Player();
        team2.playerArray[4].playerName = "Dean Embrowes";

        System.out.println(team2.playerArray[4]);


//        create a method to print out team1 and team2 without the for loop
//        public method(){
//
//        }

//        Creating a game and populating the home and away team
        Game curreGame = new Game();
        curreGame.homeTeam =  team1;
        curreGame.awayTeam = team2;

//        creating a goal object scored by home team
        Goal goal1 =  new Goal();
        goal1.thePlayer = curreGame.homeTeam.playerArray[1];
        goal1.theTeam =  curreGame.homeTeam;
        goal1.theTime = 55;

//        Put this Goal object in a Goal array, and then assign this Goal array to the goals
//        attribute of the Game object.
        Goal[] theGoals = {goal1};
        curreGame.goals = theGoals;

//        Print out the score of the game (if there was more than one goal, you would need to
//        use a loop)
        System.out.println("Goal scored after " +
                curreGame.goals[0].theTime + " mins by " +
                curreGame.goals[0].thePlayer.playerName + " of " +
                curreGame.goals[0].theTeam.teamName
        );








    }

}
