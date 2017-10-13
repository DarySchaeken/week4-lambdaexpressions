package be.pxl.lambdaexpressions.opdracht3;

import java.util.ArrayList;

public class VideoGame {
	private String name;
	private double price;
	private double rating;
	private ArrayList<String> genres;
	
	public VideoGame(String name, double price, double rating, String[] genres) {
		setName(name);
		setGenres(genres);
		setPrice(price);
		setRating(rating);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public ArrayList<String> getGenres() {
		return genres;
	}


	public void setGenres(String[] genres) {
		this.genres = new ArrayList<>();
		for(String g: genres){
			this.genres.add(g.toLowerCase());
		}
	}

}
