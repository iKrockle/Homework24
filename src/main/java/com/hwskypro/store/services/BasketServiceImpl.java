package com.hwskypro.store.services;

import com.hwskypro.store.components.Basket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        for (Integer id : items) {
            basket.addStore(id);
        }
        return items;
    }

    @Override
    public Collection<Integer> get() {
        return basket.get();
    }
}
