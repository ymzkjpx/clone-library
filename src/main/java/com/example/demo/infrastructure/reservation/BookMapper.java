package com.example.demo.infrastructure.reservation;

import com.example.demo.domain.model.book.Entry;
import com.example.demo.domain.model.book.EntryNumber;
import com.example.demo.domain.model.book.Keyword;
import com.example.demo.domain.model.reservation.MaterialLoanability;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    List<MaterialLoanability> search(@Param("keyword") Keyword keyword, @Param("limit") int limit);

    Entry findByMaterial(@Param("entryNumber") EntryNumber entryNumber);

    void register(@Param("nextNumber")int nextNumber, @Param("entry") Entry entry);

    int nextNumber();
}
