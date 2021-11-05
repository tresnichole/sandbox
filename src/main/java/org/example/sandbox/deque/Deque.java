package org.example.sandbox.deque;

public interface Deque<E> {

 void offerFirst(E e);
 E pollFirst();
 E peekFirst();

 void offerLast(E e);
 E pollLast();
 E peekLast();

 boolean isEmpty();

}
