package hack.naver.feed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hack.naver.feed.dao.ContentDao;
import hack.naver.feed.dto.ContentDto;

public class ContentService {

	@Autowired
	ContentDao contentDao;
	
	public void insertContent(long u_id, String content){
		contentDao.insertContent(u_id, content);
	}
	
	public void modifyContent(long u_id, String content, long p_id){
		contentDao.modifyContent(u_id, content, p_id);
	}
	
	public void deleteContent(long u_id, long p_id){
		contentDao.deleteContent(u_id, p_id);
	}
	
	public List<ContentDto> showMyContent(long u_id){
		return contentDao.showMyContent(u_id);
	}
}
