package day6;

public class Song extends Media{
	
	
	private int srno;
	private String title;
	
	
	public Song(int srno,String title)
	{
		this.title = title;
		this.srno = srno;
	}
	
	
	
	@Override
	public String toString() {
		return "Song [srno=" + srno + ", title=" + title + "]";
	}



	@Override
	public void play()
	{
		System.out.println("Song is playing");
	}

}
