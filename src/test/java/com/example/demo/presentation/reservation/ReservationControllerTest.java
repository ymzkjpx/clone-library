package com.example.demo.presentation.reservation;

import com.example.demo.LibraryDBTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@LibraryDBTest
@AutoConfigureMockMvc
class ReservationControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void 資料番号で本を検索できる() throws Exception{
        mockMvc.perform(
                get("/reservation/register?entry=2"))
                .andExpect(status().isOk());
    }
}