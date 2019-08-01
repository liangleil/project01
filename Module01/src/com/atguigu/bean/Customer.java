package com.atguigu.bean;


import java.util.*;

public class Customer {


    public static void main(String args[]) {
        //这是单行注释
        System.out.println("Hello World!!!!!");
        /*这是一个块注释*/
        System.out.println("Hello World!!!!!");
        List<Object> list = new List<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Object> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Object> listIterator(int index) {
                return null;
            }

            @Override
            public List<Object> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }

    public void fun() {


        Map map = new HashMap();
        Set set1 = map.keySet();
        Set set = map.entrySet();


        System.out.println("dfdf");

         

    }




}
