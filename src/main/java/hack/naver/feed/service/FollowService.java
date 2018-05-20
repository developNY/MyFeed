package hack.naver.feed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hack.naver.feed.dao.FollowDao;

public class FollowService {

	@Autowired
	FollowDao followDao;
	
	public void follow(String id, String following){
		followDao.follow(id, following);
	}
	
	public void unfollow(String id, String following){
		followDao.unfollow(id, following);
	}
	
	public List<String> following(String id){
		return followDao.following(id);
	}
	
	public List<String> follower(String id){
		return followDao.follower(id);
	}
}
