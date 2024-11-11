package day6;

public class Video extends Media{
	
	private int srno;
	private StringInterface title;
	
	public Video(int srno,StringInterface title)
	{
		this.srno = srno;
		this.title = title;
	}
	
	
	

	@Override
	public String toString() {
		return "Video [srno=" + srno + ", title=" + title + "]";
	}



	@Override
	public void play()
	{
		System.out.println("Video is playing");
	}
	
	
}
