
public class CD {
	
	String title;
	int numSongs;
	String artist;
	String publisher;
	double price;
	
	public CD() {
		
	}
	
	public CD(String title, int numSongs, String artist, String publisher, double price) {
		
		this.title = title;
		this.numSongs = numSongs;
		this.artist = artist;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void setTitle(String title) {
		
		this.title = title;
	}
	
	public void setNumSongs(int numSongs) {
		
		this.numSongs = numSongs;
	}
	
	public void setArtist(String artist) {
		
		this.artist = artist;
	}
	
	public void setPublisher(String publisher) {
		
		this.publisher = publisher;
	}
	
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public int getNumSongs() {
		
		return numSongs;
	}
	
	public String getArtist() {
		
		return artist;
	}
	
	public String getPublisher() {
		
		return publisher;
	}
	
	public double getPrice() {
		
		return price;
	}

	public String toString() {
		
		return title + ", " + numSongs + ", " + artist + ", " + publisher
				+ ", " + price + ".";
	}
}
