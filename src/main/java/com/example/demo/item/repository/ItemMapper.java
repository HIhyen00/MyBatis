package com.example.demo.item.repository;


import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    public Item save(Item item);

    public void update(Long itemId, ItemUpdateDto updateParam);

    public Optional<Item> findById(Long id);

//    public List<Item> findAll(ItemSearchCond cond);

}
