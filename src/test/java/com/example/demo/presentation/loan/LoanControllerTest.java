package com.example.demo.presentation.loan;

import com.example.demo.LibraryDBTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@LibraryDBTest
@AutoConfigureMockMvc
class LoanControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    void 画面

    @Test
    void 貸出画面が表示できる() throws Exception {
        mockMvc.perform(get("/loan/register/")).andExpect(status().isOk());
    }
}