package com.generation;

public class Main {

    public static void main(String[] args) {
	boolean X = true;
	boolean Y = false;
	boolean Z = true;

	System.out.println("a) (X && Y) || (X && Z)   es " + ((X && Y) || (X && Z)));
	System.out.println("b) (X || ! Y)&& (! X || Z)   es " + ((X || ! Y)&& (! X || Z)));
	System.out.println("c) X || Y && Z   es " + (X || Y && Z));
	System.out.println("d) ! (X || Y) && Z  es " + (! (X || Y) && Z));
	System.out.println("e) X || Y || X && ! Z && ! Y   es " + (X || Y || X && ! Z && ! Y));
	System.out.println("f) ! X || ! Y || Z && X && ! Y   es " + (! X || ! Y || Z && X && ! Y));

    }
}
