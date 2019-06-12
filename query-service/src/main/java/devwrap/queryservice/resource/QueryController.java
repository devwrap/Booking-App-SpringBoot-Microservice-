package devwrap.queryservice.resource;

import devwrap.queryservice.models.user;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryController {

    @RequestMapping("{id}")
    public List<user> fetchItems(@PathVariable("id") String str){
        return Arrays.asList(new user(1, "user1"), new user(2,"user2"));
    }
}
