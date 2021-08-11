public class Foo {
  
  Foo() {
    bar();
  }
  void bar() {
    new Foo();
  }
}
