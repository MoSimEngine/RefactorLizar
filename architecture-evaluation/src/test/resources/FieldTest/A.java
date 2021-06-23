// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package FieldTest;

public class A {
  B foo = new B();
  Object bar = foo.consume(foo).consume2(foo).consume3(foo);
}
