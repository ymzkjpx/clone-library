package com.example.demo.presentation.samples.form;

import com.example.demo.domain.model.samples.Keyword;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("samples/form")
public class SampleFormController {

    @GetMapping("")
    String request(Model model, @ModelAttribute("keyword") Keyword keyword) {
        System.out.println(keyword.getValue());
        model.addAttribute("keyword", keyword);
        model.addAttribute("message", new Keyword("apple"));
        return "samples/form/sampleform";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        binder.setAllowedFields(
//                "keyword.value"
//        );
//    }

}
