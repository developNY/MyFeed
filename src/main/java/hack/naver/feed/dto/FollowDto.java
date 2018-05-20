package hack.naver.feed.dto;

public class FollowDto {
	String id;
	String following;
	
	public FollowDto(String id, String following) {
		super();
		this.id = id;
		this.following = following;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFollowing() {
		return following;
	}
	public void setFollowing(String following) {
		this.following = following;
	}
}
