package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_26a {

  public static void main(String[] args) {
    Observable.just(1 / 0)
        .subscribe(
            i -> System.out.println("RECEIVED: " + i),
            e -> System.out.println("Error Captured: " + e)
        );
  }
}
