package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_16 {

  public static void main(String[] args) {
    Observable.range(5, 3)
        .subscribe(s -> System.out.println("RECEIVED: " + s));
  }
}
