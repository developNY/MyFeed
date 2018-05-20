package hack.naver.feed.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import hack.naver.feed.dto.ContentDto;

public class ContentDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void insertContent(long u_id, String content){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("u_id", u_id);
		map.put("content", content);
		sqlSession.insert("content.insertContent", map);
	}
	
	public void modifyContent(long u_id, String content, long p_id){
		ContentDto dto = new ContentDto(u_id, content, p_id);
		sqlSession.update("content.modifyContent", dto);
	}

	public void deleteContent(long u_id, long p_id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("u_id", u_id);
		map.put("p_id", p_id);
		sqlSession.delete("content.deleteContent", map);
	}

	public List<ContentDto> showMyContent(long u_id){
		List<ContentDto> dto;
		dto = sqlSession.selectList("content.showMyContent", u_id);
		return dto;
	}
	
}
