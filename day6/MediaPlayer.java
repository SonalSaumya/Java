package day6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	public void playMyList(List<? extends Media> medialist)
	{
		for(Media m : medialist)
		{
			m.play();
		}
	}
	
	
	
	public static void main(StringInterface[] args)
	{
		MediaPlayer player = new MediaPlayer();
		
		List<Song> songs = new ArrayList();
		
		songs.add(new Song(1,"a"));
		songs.add(new Song(2,"b"));
		songs.add(new Song(2,"c"));
		
		
		player.playMyList(songs);
	}

}
