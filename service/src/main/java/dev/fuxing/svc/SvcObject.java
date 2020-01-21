package dev.fuxing.svc;

public class SvcObject {

	private final long id;
	private final String content;

	public SvcObject(long id, String content) {
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
