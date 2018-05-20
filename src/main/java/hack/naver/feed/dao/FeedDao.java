package hack.naver.feed.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import hack.naver.feed.dto.ContentDto;

public class FeedDao {

	@Autowired
	private SqlSession sqlSession;
	@Autowired
	FollowDao dao;
	
	public List<ContentDto> followerFeed (String id){
		List<ContentDto> dto;
		List<ContentDto> list = new ArrayList<ContentDto>();
		List<String> names = dao.following(id);
		names.add(id);
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.println("name: " + name);
			dto = sqlSession.selectList("feed.followerFeed", name);
			list.addAll(dto);
		}
		return list;
	}
}
