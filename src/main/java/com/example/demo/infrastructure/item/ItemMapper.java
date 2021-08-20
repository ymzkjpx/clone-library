package com.example.demo.infrastructure.item;

import com.example.demo.domain.model.material.item.ItemNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {
    void delete貸出可能(@Param("itemNumber") ItemNumber itemNumber);

    void insert貸出中(@Param("itemNumber") ItemNumber itemNumber);
}
