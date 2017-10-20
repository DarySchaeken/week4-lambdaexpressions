package be.pxl.lambdaexpressions.opdracht3;

import java.util.ArrayList;

public class GameBrowser {
	private GameCollection collection;

	public GameBrowser(GameCollection collection) {
		this.collection = collection;
	}
	
	public ArrayList<VideoGame> showGamesForSearch(String search){
		/*return collection.selectGames(new Predicate<VideoGame>() {
			
			@Override
			public boolean test(VideoGame t) {
				if(t.getName().toLowerCase().contains(search.toLowerCase())){
					return true;
				}
				return false;
			}
		});*/
		return collection.selectGames(v -> v.getName().toLowerCase().contains(search.toLowerCase()));
	}
	
	public ArrayList<VideoGame> showFreeGames(){
		return collection.selectGames((g) -> g.getPrice() == 0);
	}
	
	public ArrayList<VideoGame> showGamesInGenre(String genre){
		return collection.selectGames((g) -> g.getGenres().contains(genre.toLowerCase()));
	}

}
