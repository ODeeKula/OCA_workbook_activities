package soccer;

public class League {
    public static void main(String[] args){
//        app code here

        Team[] theTeams = createTeams();

        Game[] theGames = createGames(theTeams);
        Game  currGame = theGames[0];


//        creating a goal object scored by home team
        Goal goal1 =  new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[1];
        goal1.theTeam =  currGame.homeTeam;
        goal1.theTime = 55;

//        Put this Goal object in a Goal array, and then assign this Goal array to the goals
//        attribute of the Game object.
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

//        Print out the score of the game (if there was more than one goal, you would need to
//        use a loop)
        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName
        );

    }

    public static Team[] createTeams() {

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

        Player[] thePlayers = {player1, player2, player3, player4, player5};

        Team team1 = new Team();
        team1.teamName = "The Legends";
        team1.playerArray = thePlayers;

        System.out.println("* * * * * * * * * * * * *");

        Team team2 = new Team();
        team2.teamName = "The Brookies";
        team2.playerArray = new Player[5];
,
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



        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams){
    Game theGame = new Game();
    theGame.homeTeam = theTeams[0];
    theGame.awayTeam = theTeams[1];

    Game[] theGames = {theGame};

    return theGames;

    }




}
