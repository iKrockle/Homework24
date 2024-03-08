package com.hwskypro.store.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Component
@SessionScope
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
