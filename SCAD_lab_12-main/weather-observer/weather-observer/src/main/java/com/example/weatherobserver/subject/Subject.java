package com.example.weatherobserver.subject;

import com.example.weatherobserver.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
