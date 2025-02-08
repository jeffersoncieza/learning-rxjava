package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_27 {

  public static void main(String[] args) {
    Observable.fromCallable(() -> 1 / 0)
        .subscribe(
            i -> System.out.println("RECEIVED: " + i),
            e -> System.out.println("Error Captured: " + e)
        );
  }
}
