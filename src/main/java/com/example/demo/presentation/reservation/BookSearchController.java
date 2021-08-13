package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.book.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

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
        System.out.println(keyword);
        Books books = reservationScenario.search(keyword);
        model.addAttribute("keyword", keyword);
        model.addAttribute("books", books);
        return "reservation/search";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setAllowedFields("keyword.value");
    }
}
