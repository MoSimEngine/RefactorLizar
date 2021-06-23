// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

public class Foo {
  
  Foo() {
    bar();
  }
  void bar() {
    new Foo();
  }
}
