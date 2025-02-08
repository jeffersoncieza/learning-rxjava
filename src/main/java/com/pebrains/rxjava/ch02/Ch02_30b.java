package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_30b {

  public static void main(String[] args) {
    Observable<Integer> source = Observable.just(100);
    source.subscribe(
        s -> System.out.println("Process 1: " + s),
        e -> System.out.println("Error Captured: " + e),
        () -> System.out.println("Process 1 done!")
    );

    Observable<Integer> empty = Observable.empty();
    empty.subscribe(
        s -> System.out.println("Process 2: " + s),
        e -> System.out.println("Error Captured: " + e),
        () -> System.out.println("Process 2 done!")
    );
  }
}
