package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping ({"/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping ("addjob")
    public String addjob () {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForn( JobPost jobPost) {
        return "success";
    }
}
