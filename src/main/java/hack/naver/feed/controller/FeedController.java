/*
package hack.naver.feed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hack.naver.feed.dto.ContentDto;
import hack.naver.feed.service.FeedService;
import io.swagger.annotations.Api;

@CrossOrigin(origins = "*")

@Api(value="Feed", description="피드 구성 API", basePath="/api/v1/feed")
@RestController
public class FeedController {

	@Autowired
	FeedService feedService;
	
	@RequestMapping(value = "/api/v1/followerFeed", method = RequestMethod.POST)
	public @ResponseBody List<ContentDto> followerFeed(@RequestParam String id){
		return feedService.followerFeed(id);
	}
}
*/