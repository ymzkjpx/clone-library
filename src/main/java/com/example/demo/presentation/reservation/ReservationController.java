package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.material.entry.Entry;
import com.example.demo.domain.model.material.entry.EntryNumber;
import com.example.demo.domain.model.member.MemberNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/reservation/register")
public class ReservationController {

    @Autowired
    ReservationScenario reservationScenario;

    @GetMapping
    String reservationToSearch() {
        return "redirect:/reservation/entries/search";
    }

    @GetMapping(params = {"entry"})
    String reservationForm(@ModelAttribute("entry") EntryNumber entryNumber, Model model, BindingResult bindingResult) {
        Entry book = reservationScenario.findByMaterial(entryNumber);
        model.addAttribute("book", book);
        model.addAttribute("member", MemberNumber.empty());
        return "reservation/form";
    }

    @PostMapping
    String register(@ModelAttribute("member") MemberNumber memberNumber, @ModelAttribute("entry") EntryNumber entryNumber, Model model, BindingResult bindingResult, RedirectAttributes attributes) {
        Entry entry = reservationScenario.findByMaterial(entryNumber);
        reservationScenario.register(memberNumber, entry);
        attributes.addFlashAttribute("entry", entry);
        return "redirect:/reservation/register/completed";
    }

    @GetMapping("completed")
    String completed(@ModelAttribute("entry") Entry entry, Model model) {
        model.addAttribute("entry", entry);
        return "reservation/completed";
    }
}
