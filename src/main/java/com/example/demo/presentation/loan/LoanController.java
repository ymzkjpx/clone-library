package com.example.demo.presentation.loan;

import com.example.demo.domain.model.loan.LoanRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 本の貸出
 */
@Controller
@RequestMapping("loan/register")
public class LoanController {

    @GetMapping
    String init(Model model) {
        model.addAttribute("loanRequest", LoanRequest.empty());
        return "loan/form";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("memberNumber.value");
    }
}
