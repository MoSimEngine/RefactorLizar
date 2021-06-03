package FieldTest;

public class A {
  B foo = new B();
  Object bar = foo.consume(foo).consume2(foo).consume3(foo);
}
