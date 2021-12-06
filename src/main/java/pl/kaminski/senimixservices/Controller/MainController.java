package pl.kaminski.senimixservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController implements IMainController {

    @EventListener(ApplicationReadyEvent.class)
    @RequestMapping("/")
    public String mainPage(){return "main"; }
}
