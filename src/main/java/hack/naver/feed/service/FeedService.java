package hack.naver.feed.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hack.naver.feed.dao.FeedDao;
import hack.naver.feed.dto.ContentDto;

public class FeedService {

	@Autowired
	FeedDao feedDao;
	
	public List<ContentDto> followerFeed (String id){
		List<ContentDto> list = new ArrayList<ContentDto>();
		
		list = feedDao.followerFeed(id);
		Collections.sort(list, new CompareSeqDesc());
		
		return list;
	}
}

class CompareSeqDesc implements Comparator<ContentDto>{
	 
    @Override
    public int compare(ContentDto o1, ContentDto o2) {
        // TODO Auto-generated method stub
        return o1.getP_id() > o2.getP_id() ? -1 : o1.getP_id() < o2.getP_id() ? 1:0;
    }        
}
