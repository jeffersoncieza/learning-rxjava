package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Maybe;

public class Ch02_30a {

  public static void main(String[] args) {
    Maybe<Integer> source = Maybe.just(100);
    source.subscribe(
        s -> System.out.println("Process 1: " + s),
        e -> System.out.println("Error Captured: " + e),
        () -> System.out.println("Process 1 Done!")
    );

    Maybe<Integer> empty = Maybe.empty();
    empty.subscribe(
        s -> System.out.println("Process 2: " + s),
        e -> System.out.println("Error Captured: " + e),
        () -> System.out.println("Process 2 Done!")
    );
  }
}
