package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class Ch02_06 {

  public static void main(String[] args) {
    List<String> items = List.of("Alpha", "Beta", "Gamma");
    Observable<String> source = Observable.fromIterable(items);

    source
        .map(String::length)
        .filter(i -> i >= 5)
        .subscribe(s -> System.out.println("RECEIVED: " + s));
  }
}
