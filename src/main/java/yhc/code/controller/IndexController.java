package yhc.code.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghanchun
 * @date 2019/7/1 15:49
 * @Description:
 */
@RestController
public class IndexController {
    @Value("${yhc.branch}")
    private String branch;

    @GetMapping("/")
    public String index(){
        return branch;
    }
}
