package com.example.demo.presentation.reservation;

import com.example.demo.application.scenario.ReservationScenario;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.reservation.reservation.Books;
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
        // TODO: 2021/08/12 検索結果に合致する書籍の一覧を取得する
        Books books = reservationScenario.search(keyword);
        return "reservation/search";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setAllowedFields("keyword.value");
    }
}
