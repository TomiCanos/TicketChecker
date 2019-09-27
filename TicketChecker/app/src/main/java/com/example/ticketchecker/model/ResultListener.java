package com.example.ticketchecker.model;

public interface ResultListener<T> {
    void finish(T resultado);
}
