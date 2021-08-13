package com.example.demo.infrastructure.reservation;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.Keyword;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> search(@Param("keyword") Keyword keyword);
}
