package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_20 {

  public static void main(String[] args) {
    Observable<String> empty = Observable.empty();
    empty.subscribe(
        System.out::println,
        Throwable::printStackTrace,
        () -> System.out.println("Done!")
    );
  }
}
