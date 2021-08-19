package com.example.demo.presentation.loan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("loan/")
public class LoanController {

    //    @Autowired
    //    LoanScinario loanScinario;

    @GetMapping
    String form(Model model) {
        model.addAttribute("loanRequest", LoanRequest.empty());
        return "loan/form";
    }
}
