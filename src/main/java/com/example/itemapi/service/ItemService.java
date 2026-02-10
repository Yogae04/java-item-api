package com.example.itemapi.service;

import com.example.itemapi.model.item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private List<item> items = new ArrayList<>();
    private Long idCounter = 1L;

    // Add new item
    public item addItem(item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Optional<item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
