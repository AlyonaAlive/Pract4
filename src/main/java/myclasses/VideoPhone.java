package myclasses;

public class VideoPhone extends FirstPhone {
	private Video video;
	public VideoPhone(Video video){
		super();
		this.video = video;
	}
	public VideoPhone(Video video, String number){
		super(number);
		this.video = video;
	}
	public void call(){
		super.call();
		System.out.println("video-calling");
		video.showVideo();
	}

}
