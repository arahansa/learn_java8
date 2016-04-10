package etc.effective.chap04;

import java.util.Arrays;
import java.util.List;

public class Zzz {
  public static void main(String[] args) {

    final List<A> listA = Arrays.asList(new A());
    final List<B> listB = Arrays.asList(new B());
    final List<C> listC = Arrays.asList(new C());

    run(listA);
    run(listB);
    run(listC);

    run2(listA);
    //run2(listB); // compile-time error
    //run2(listC); // compile-time error

  }

  public static <E extends A, T extends List<E>> void run(T list) {
    // List<A>, List<B>, List<C>등 A를 상속한 모든 타입을 가진 List에 사용 가능
    for (E e : list) {
      e.tellMe();
    }
  }

  public static void run2(List<A> list) { // List<A>만 처리가능
    for (A a : list) {
      a.tellMe();
    }
  }

}

class A {
  void tellMe() {
    System.out.println("A");
  }
}

class B extends A {
  void tellMe() {
    System.out.println("B");
  }
}

class C extends B {
  @Override
  public void tellMe() {
    System.out.println("C");
  }
}
