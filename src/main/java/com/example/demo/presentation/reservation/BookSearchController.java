package com.example.demo.presentation.reservation;

import com.example.demo.domain.model.book.SearchKeyword;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * 本の検索画面
 */
@Controller
@RequestMapping("reservation/books")
public class BookSearchController {

    @GetMapping("search")
    String search(Model model, @ModelAttribute("searchKeyword") SearchKeyword searchKeyword, BindingResult result) {
        System.out.println(searchKeyword);
        model.addAttribute("searchKeyword", new SearchKeyword("bookName"));
        return "reservation/search";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setAllowedFields("searchKeyword.value");
    }
}
