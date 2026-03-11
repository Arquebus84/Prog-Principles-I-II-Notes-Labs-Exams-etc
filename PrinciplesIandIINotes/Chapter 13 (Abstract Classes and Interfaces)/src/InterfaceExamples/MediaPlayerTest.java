package InterfaceExamples;

public class MediaPlayerTest {
	public static void main(String[] args) {
		SimpleMediaPlayer m1 = new SimpleMediaPlayer();
		m1.setCurrentSong("Radioactive");
		m1.setStatus("playing");
		
		System.out.println(m1.displayStatus());
	}
}

interface MediaPlayer {
	// Plays the media file
	void play(String songName);

	// Pauses the currently playing media
	void pause();

	// Stops the media playback
	void stop();

	// Shows information about the current status
	abstract String displayStatus();
}

class SimpleMediaPlayer implements MediaPlayer{
	private String currentSong;
    private String status;			//can be one of the following values: "playing", "paused" or "idle"

    public SimpleMediaPlayer(){
        setCurrentSong("");			//Empty String
        setStatus("idle");
    }

    public String getCurrentSong(){
        return currentSong;
    }
    public void setCurrentSong(String currentSong){
        this.currentSong = currentSong;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
	
	@Override
	public void play(String songName) {
		this.currentSong = songName;
		setStatus("playing");
	}
	
	@Override
	public void pause() {
		if(getCurrentSong().length() > 0)
			setStatus("paused");
	}
	
	@Override
	public void stop() {
		if(getCurrentSong().length() > 0) {
			setStatus("idle");
			setCurrentSong("");
		}
	}
	
	@Override
	public String displayStatus() {
		if(getCurrentSong().length() > 0 && getStatus() == "playing") {
			return String.format("Currently playing: %s", getCurrentSong());
		}else {
			return String.format("Media player is %s", getStatus());
		}
	}
}