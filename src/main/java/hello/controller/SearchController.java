package hello.controller;

import hello.model.Greeting;
import hello.model.SearchRequest;
import hello.model.SearchResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

/**
 * Created by qzhao on 2018/2/14.
 */
@RestController
@RequestMapping("/search")
public class SearchController {
    @RequestMapping(method = RequestMethod.POST)
    public SearchResponse search(@RequestBody SearchRequest request) {
        System.out.print(request.getId());
        System.out.print(request.getName());

        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        SearchResponse response = new SearchResponse();
        response.setStatus(request.getId());
        response.setStatusInfo(request.getName());
        return response;
    }
}
