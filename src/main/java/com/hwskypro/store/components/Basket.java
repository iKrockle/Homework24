package com.hwskypro.store.components;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Component
public class Basket {
    private final List<Integer> basketList = new ArrayList<>();

    public List<Integer> addStore(Integer items) {
        basketList.add(items);
        return basketList;
    }

    public Collection<Integer> get() {
        return new ArrayList<>(basketList);
    }
}
