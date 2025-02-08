package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Ch02_13 {

  public static void main(String[] args) {
    ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma").publish();

    source.subscribe(s -> System.out.println("Observer 1: " + s));

    source
        .map(String::length)
        .filter(i -> i >= 5)
        .subscribe(i -> System.out.println("Observer 2: " + i));

    source.connect();
  }
}
