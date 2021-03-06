package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.material.entry.Keyword;
import com.example.demo.domain.model.reservation.loan.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 本の検索画面
 */
@Controller
@RequestMapping("reservation/entries")
public class BookSearchController {

    @Autowired
    ReservationScenario reservationScenario;

    @GetMapping("search")
    String search(Model model, @ModelAttribute("keyword") Keyword keyword, BindingResult result) {
        Books books = reservationScenario.search(keyword);
        model.addAttribute("keyword", keyword);
        model.addAttribute("books", books);
        return "reservation/search";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("keyword.value");
    }
}
