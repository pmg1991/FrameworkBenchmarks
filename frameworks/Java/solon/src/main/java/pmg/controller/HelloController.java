package pmg.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;
import pmg.model.Fortune;
import pmg.model.Message;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author noear
 * @version V1.0
 */
@Controller
public class HelloController {
    @Get
    @Mapping("plaintext")
    public String plaintext() {
        return "Hello, World!";
    }

    @Get
    @Mapping("json")
    public Message json() {
        return new Message("Hello, World!");
    }

    @Mapping("fortunes")
    public ModelAndView fortunes(ModelAndView mv) {
        List<Fortune> fortunes = new ArrayList<>();
        fortunes.add(new Fortune(0, "Additional fortune added at request time."));
        fortunes.sort(comparing(fortune -> fortune.message));

        mv.view("fortunes.ftl");
        mv.put("fortunes", fortunes);


        return mv;
    }
}
