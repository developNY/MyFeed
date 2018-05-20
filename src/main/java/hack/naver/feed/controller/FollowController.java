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

import hack.naver.feed.service.FollowService;
import io.swagger.annotations.Api;

@CrossOrigin(origins = "*")

@Api(value="Follow", description="관계정보 API", basePath="/api/v1/follow")
@RestController
public class FollowController {

	@Autowired
	FollowService followService;
	
	@RequestMapping(value = "/api/v1/follow", method = RequestMethod.POST)
	public @ResponseBody void follow(@RequestParam String id, String following){
		followService.follow(id, following);
	}
	
	@RequestMapping(value = "/api/v1/unfollow", method = RequestMethod.POST)
	public @ResponseBody void unfollow(@RequestParam String id, String following){
		followService.unfollow(id, following);
	}
	
	@RequestMapping(value = "/api/v1/following", method = RequestMethod.POST)
	public @ResponseBody List<String> following(@RequestParam String id){
		return followService.following(id);
	}
	
	@RequestMapping(value = "/api/v1/follower", method = RequestMethod.POST)
	public @ResponseBody List<String> follower(@RequestParam String id){
		return followService.follower(id);
	}
}
*/