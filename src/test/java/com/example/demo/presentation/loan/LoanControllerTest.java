package com.example.demo.presentation.loan;

import com.example.demo.LibraryDBTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@LibraryDBTest
@AutoConfigureMockMvc
class LoanControllerTest {
    @Autowired MockMvc mockMvc;

    @Test
    void 貸出画面が表示できる() throws Exception {
        mockMvc.perform(get("/loan/register/"))
               .andExpect(status().isOk());
    }

    @Test
    void 貸出登録できる() throws Exception {
        mockMvc.perform(post("/loan/register/").param("memberNumber.value", "1")
                                               .param("itemNumber.value", "1-A")
                                               .param("loanDate.value", "2021-08-20"))
               .andExpect(status().isFound())
               .andExpect(redirectedUrl("/loan/register/completed"));
    }
}