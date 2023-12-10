package ru.skypro.springtraining.service;

import java.util.List;

public interface StoreService {
    List<Integer> add(List<Integer> goods);
    List<Integer> get();
}
