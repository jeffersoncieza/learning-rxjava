package com.pebrains.rxjava.ch02;

import io.reactivex.rxjava3.core.Single;

public class Ch02_28 {

  public static void main(String[] args) {
    Single.just("Hello!")
        .map(String::length)
        .subscribe(
            System.out::println,
            e -> System.out.println("Error Captured: " + e)
        );
  }
}
