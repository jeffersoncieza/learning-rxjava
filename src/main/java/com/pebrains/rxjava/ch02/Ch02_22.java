package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_22 {

  public static void main(String[] args) {
    Observable.error(new Exception("Crash and Burn!"))
        .subscribe(
            i -> System.out.println("RECEIVED: " + i),
            e -> System.out.println("ERROR CAPTURED: " + e),
            () -> System.out.println("Done!")
        );
  }
}
