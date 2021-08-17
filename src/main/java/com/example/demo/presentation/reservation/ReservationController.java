package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation/register")
public class ReservationController {

    @Autowired
    ReservationScenario reservationScenario;

    @GetMapping
    String reservationToSearch(){
        return "redirect:/reservation/entries/search";
    }

    @GetMapping(params = {"entry"})
    String register(@ModelAttribute("entry") EntryNumber entryNumber, Model model, BindingResult bindingResult){
        Entry book = reservationScenario.findByMaterial(entryNumber);
        model.addAttribute("book", book);
        return "reservation/form";
    }
}
