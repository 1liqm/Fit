package de.liam.fit;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AnonymousAllowed
public class FitApplicationController {

    @Autowired
    @GetMapping("/test")
    public String hello() {
        return "Hallo Julian";
    }
    @GetMapping("/test1")
    public String test() {
        return "Das hier ist ein Test";
        
    }
}
