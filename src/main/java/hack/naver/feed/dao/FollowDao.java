package hack.naver.feed.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class FollowDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void follow(String id, String following){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("following", following);
		sqlSession.insert("follow.follow", map);
	}

	public void unfollow(String id, String following){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("following", following);
		sqlSession.delete("follow.unfollow", map);
	}

	public List<String> following(String id){
		List<String> list;
		list = sqlSession.selectList("follow.following", id);
		return list;
	}
	
	public List<String> follower(String id){
		List<String> list;
		list = sqlSession.selectList("follow.follower", id);
		return list;
	}
}
