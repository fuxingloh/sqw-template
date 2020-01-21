package dev.fuxing.sqw.model;

public class HelloObject {

	private final long id;
	private final String content;

	public HelloObject(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
