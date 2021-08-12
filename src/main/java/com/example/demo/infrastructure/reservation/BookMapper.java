package com.example.demo.infrastructure.reservation;

import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.reservation.reservation.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {
    Books search(@Param("keyword") Keyword keyword);
}
