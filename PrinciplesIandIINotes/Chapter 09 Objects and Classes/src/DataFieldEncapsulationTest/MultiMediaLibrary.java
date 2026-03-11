package DataFieldEncapsulationTest;
import java.util.Arrays;

public class MultiMediaLibrary {
    private String trackName;
    private boolean available;
    private int rating;
    //private Artist artist;
    private String[] genres;

    public boolean setTrackName(String newTrackName) {
        // Set the track name
        if(newTrackName != null && newTrackName != ""){
            trackName = newTrackName;
            return true;
        }else{
            return false;
        }
    }

    public String getTrackName() {
        // Get the track
        return trackName;
    }

    public boolean setAvailable(boolean isAvailable) {
        // Check if the track is available
        if(isAvailable != false){
            available = isAvailable;
            return true;
        }else{
            return false;
        }
    }

    public boolean isAvailable() {
        // write appropriate code here
        return available;
    }

    public boolean setRating(int newRating) {
        // write appropriate code here
        if(newRating >= 1 && newRating <= 5){
            rating = newRating;
            return true;
        }else{
            return false;
        }
    }

    public int getRating() {
        // write appropriate code here
        return rating;
    }

    /*public boolean setArtist(Artist newArtist) {
        // write appropriate code here
        if(newArtist != null){
            artist = newArtist;
            return true;
        }else{
            return false;
        }
        
    }

    public Artist getArtist() {
        // write appropriate code here
        return artist;
    }*/

    public boolean setGenres(String[] genres) {
        if (genres != null) {
            this.genres = Arrays.copyOf(genres, genres.length);
            return true;
        }
        return false;
    }

    //Return a copy of the array in the getGenres (getter) to avoid external modifications to the original array.
    public String[] getGenres() {
        if (genres != null) {
            return Arrays.copyOf(genres, genres.length);
        }
        return null;
    }
    
    public static void main(String args[]) {
    	MultiMediaLibrary genre = new MultiMediaLibrary();
    	System.out.println(genre.getRating());
    }
}