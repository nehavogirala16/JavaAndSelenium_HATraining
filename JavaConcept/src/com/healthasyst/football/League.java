package com.healthasyst.football;

public class League {

	public static void main(String[] args) {
//initialize the player object and load the data
		
        Player player1=new Player();
		player1.playerName="Raina";
		
		Player player2=new Player();
		player2.playerName="john";
		
		Player player3=new Player();
		player3.playerName="dhoni";
		
		Player[] playerArray=new Player[3];
		playerArray[0]=player1;
		playerArray[1]=player2;
		playerArray[2]=player3;
		
		
		Team team1= new Team();
		team1.teamName="CSK";
		team1.playerArray= playerArray;
		
		//...................................................
		
		    Player player4=new Player();
			player4.playerName="Khoili";
			
			Player player5=new Player();
			player5.playerName="rishab";
			
			Player player6=new Player();
			player6.playerName="yovi";
			
			Player[] playerArray2=new Player[3];
			playerArray2[0]=player4;
			playerArray2[1]=player5;
			playerArray2[2]=player6;
			
			
			Team team2= new Team();
			team2.teamName="RCB";
			team2.playerArray2= playerArray2;
		
			
			System.out.println("team name is "+team1.teamName);
			System.out.println("team players name" );
			for (Player name : team1.playerArray) {
				System.out.println(name.playerName);
			}

	}

}
