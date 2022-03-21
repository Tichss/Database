package hu.tichss.database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SzB on 2018. 01. 29..
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

}
