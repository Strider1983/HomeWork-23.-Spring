package ru.skypro.springtraining.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.springtraining.service.Chart;
import ru.skypro.springtraining.service.StoreService;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {
    private final Chart chart;

    public StoreServiceImpl(Chart chart) {
        this.chart = chart;
    }

    @Override
    public List<Integer> add(List<Integer> goods) {
        return chart.add(goods);
    }

    @Override
    public List<Integer> get() {
        return chart.get();
    }
}
