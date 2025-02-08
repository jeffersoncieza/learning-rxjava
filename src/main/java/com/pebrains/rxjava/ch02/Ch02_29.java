package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_29 {

  public static void main(String[] args) {
    Observable<String> source = Observable.just("Alpha", "Beta");
    source.first("Nil")
        .subscribe(System.out::println);
  }
}
