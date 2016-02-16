package myclasses;

import java.util.Map;

public class SuperPuperPhoneNew implements Telephone{
	public SuperPuperPhoneNew(){}
	private Map <String, ShareFile> files;

	public void call() {
		for(String key: files.keySet()){
			System.out.println(key+" : ");
			ShareFile file = files.get(key);
			file.share();
		}
		
	}

	public void setFiles(Map<String, ShareFile> files) {
		this.files = files;
	}
	

}
