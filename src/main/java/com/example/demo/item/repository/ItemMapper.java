package com.example.demo.item.repository;


import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {
    Boolean save(Item item);

    Boolean update(@Param("id") Long id, @Param("updateParam") Item updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll();

    Boolean deleteById(@Param("id") Long id);
}
