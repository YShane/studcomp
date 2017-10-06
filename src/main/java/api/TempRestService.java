package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by samyy on 06-Oct-17.
 */
@RestController
public class TempRestService {

    Logger logger = LoggerFactory.getLogger(TempRestService.class);

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }


}
