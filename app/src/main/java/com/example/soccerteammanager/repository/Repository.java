package com.example.soccerteammanager.repository;

import com.example.soccerteammanager.model.SoccerEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T extends SoccerEntity> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

    public List<T> filter(java.util.function.Predicate<T> predicate) {
        return items.stream().filter(predicate).collect(Collectors.toList());
    }
}
