package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ReservationController {

    @Autowired
    ReservationScenario reservationScenario;

    @GetMapping
    String reservationToSearch(){
        return "redirect:/reservation/entries/search";
    }

    @GetMapping(params = {"entry"})
    String register(@ModelAttribute("entry")Book entry, Model model, BindingResult bindingResult){
        reservationScenario.findByMaterial(entry);
    }
}
