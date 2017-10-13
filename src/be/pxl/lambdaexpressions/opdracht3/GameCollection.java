package be.pxl.lambdaexpressions.opdracht3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GameCollection {
	private ArrayList<VideoGame> games;
	
	public GameCollection() {
		games = new ArrayList<>();
	}
	
	public void addGame(VideoGame game){
		games.add(game);
	}
	
	public ArrayList<VideoGame> selectGames(Predicate<VideoGame> gameTest){
		ArrayList<VideoGame> filteredGames = new ArrayList<>();
		for(VideoGame game: games){
			if(gameTest.test(game)){
				filteredGames.add(game);
			}
		}
		return filteredGames;
	}
	
	
	

}
