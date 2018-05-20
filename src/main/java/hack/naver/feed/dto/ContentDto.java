package hack.naver.feed.dto;

public class ContentDto {
	Long u_id;
	String content;
	Long p_id;
	public ContentDto(Long u_id, String content, Long p_id) {
		super();
		this.u_id = u_id;
		this.content = content;
		this.p_id = p_id;
	}
	public ContentDto(Long u_id, String content) {
		super();
		this.u_id = u_id;
		this.content = content;
	}
	public Long getU_id() {
		return u_id;
	}
	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getP_id() {
		return p_id;
	}
	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}
}
