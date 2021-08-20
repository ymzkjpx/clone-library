package com.example.demo.presentation.loan;

import com.example.demo.application.scenario.LoanScenario;
import com.example.demo.domain.model.loan.LoanRequest;
import com.example.demo.domain.model.member.loan.MemberStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 本の貸出
 */
@Controller
@RequestMapping("loan/register")
public class LoanController {

    @Autowired
    LoanScenario loanScenario;

    @GetMapping
    String init(Model model) {
        model.addAttribute("loanRequest", LoanRequest.empty());
        return "loan/form";
    }

    /**
     * バリデーションチェック
     * 会員の存在確認
     * 貸出を行う
     */
    @PostMapping
    String loan(@Validated @ModelAttribute("loanRequest") LoanRequest loanRequest, Model model, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) return "loan/form";
        MemberStatus memberStatus = loanScenario.memberStatus(loanRequest);
        loanScenario.loan(loanRequest);
        redirectAttributes.addFlashAttribute("loanRequest", loanRequest);
        model.addAttribute("loanRequest", loanRequest);
        return "redirect:/loan/register/completed";
    }

    @GetMapping("completed")
    String completed(@ModelAttribute("loanRequest") LoanRequest loanRequest, Model model) {
        model.addAttribute("loanRequest", loanRequest);
        return "loan/completed";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("memberNumber.value", "itemNumber.value", "loanDate.value");
    }
}
