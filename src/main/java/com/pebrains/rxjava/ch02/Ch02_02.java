package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;

public class Ch02_02 {

  public static void main(String[] args) {
    Observable<String> source = Observable.create(emitter -> {
      try {
        emitter.onNext("Alpha");
        emitter.onNext("Beta");
        emitter.onNext("Gamma");
        emitter.onComplete();
      } catch (Throwable e) {
        emitter.onError(e);
      }
    });

    source.subscribe(
        s -> System.out.println("RECEIVED: " + s),
        Throwable::printStackTrace
    );
  }
}
