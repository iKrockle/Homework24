package com.hwskypro.store.services;

import java.util.Collection;
import java.util.List;

public interface BasketService {
    List<Integer> add(List<Integer> items);
    Collection<Integer> get();
}
