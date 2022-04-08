package PatikaCloneOdev.Model;

import java.util.List;

public class Content {

	private String contentTitle;
	private String contentDescription;
	private String youtubeUrl;
	private List<String> questions;
	private int patikaId;
	
	public Content(String contentTitle, String contentDescription, String youtubeUrl, List<String> questions, int patikaId) {
		super();
		this.contentTitle = contentTitle;
		this.contentDescription = contentDescription;
		this.youtubeUrl = youtubeUrl;
		this.questions = questions;
		this.patikaId = patikaId;
	}

	public Content() {
		super();
	}



	public String getContentTitle() {
		return contentTitle;
	}

	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}

	public String getContentDescription() {
		return contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	public String getYoutubeUrl() {
		return youtubeUrl;
	}

	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}

	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	
	public int getPatikaId() {
		return this.patikaId;
	}
	
	public void setPatikaId(int patikaId) {
		this.patikaId = patikaId;
	}
	
}
