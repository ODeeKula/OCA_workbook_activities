package soccer;

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

//        a Player array called thePlayers that comprises the three Player objects
//        that you just instantiated.
        Player[] thePlayers = {player1, player2, player3, player4, player5};

        Team team1 = new Team();

//        Set the teamName attribute of the Team object to "The Legends".
        team1.teamName = "The Legends";

//        Set the playerArray attribute of the Team object to the Player array thePlayers.
        team1.playerArray = thePlayers;

        for(Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }

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


        for(Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }

    }

}
