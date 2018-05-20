package hack.naver.feed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hack.naver.feed.dto.ContentDto;
import hack.naver.feed.service.ContentService;
import io.swagger.annotations.Api;


@Api(value="Content", description="컨텐츠 정보 API", basePath="미정")
@RestController
public class ContentController {

	@Autowired
	ContentService contentService;
	
	@RequestMapping(value = "/content/{u_id}/contents", method = RequestMethod.POST)
	public @ResponseBody void insertContent(@RequestParam long u_id, String content){
		contentService.insertContent(u_id, content);
	}
	
	@RequestMapping(value = "/contents/{p_id}", method = RequestMethod.PUT)
	public @ResponseBody void modifyContent(@RequestParam long u_id, String content, long p_id){
		contentService.modifyContent(u_id, content, p_id);
	}
	
	@RequestMapping(value = "/content/{p_id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteContent(@RequestParam long u_id, long p_id){
		contentService.deleteContent(u_id, p_id);
	}
	
	@RequestMapping(value = "/content", method = RequestMethod.GET)
	public @ResponseBody List<ContentDto> showMyContent(@RequestParam long u_id){
		return contentService.showMyContent(u_id);
	}
}
