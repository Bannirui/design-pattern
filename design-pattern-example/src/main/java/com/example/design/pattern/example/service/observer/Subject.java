package com.example.design.pattern.example.service.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class Subject {
    // 容器
    private List<ObserverService> container = new ArrayList<>();

    // add
    public void addObserver(ObserverService observerService) {
        container.add(observerService);
    }

    // remove
    public void removeObserver(ObserverService observerService) {
        container.remove(observerService);
    }

    // notify
    public void notifyObserver(Object object) {
        for (ObserverService observerService : container) {
            observerService.update(object);
        }
    }
}
