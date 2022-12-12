package cz.czechitas.lekce12java2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountdownController {

    private final CountdownService service;

    public CountdownController(CountdownService service) {
        this.service = service;
    }


    @GetMapping
    public ModelAndView christmas() {
        return new ModelAndView("index")
                .addObject("christmas", service.daysToChristmas());
    }
}
