package yhc.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanghanchun
 * @date 2019/7/1 15:49
 * @Description:
 */
@Controller
public class IndexController {
    @Value("${yhc.index}")
    private String branch;

    @GetMapping("/")
    public String index(){
        return branch;
    }
}
