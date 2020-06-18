package odko.nanjid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/user", "/signup"})
public class SignUpController {

    //@RequestMapping(value="/signup", method = RequestMethod.GET)
    @GetMapping({"/abc", "/hello"})
    public String getSignUpForm() {
        return "SignUpForm";
    }

    //@RequestMapping(value="/signup", method = RequestMethod.POST)
    @PostMapping("/save")
    public String saveUser() {
        return "result";
    }

}
