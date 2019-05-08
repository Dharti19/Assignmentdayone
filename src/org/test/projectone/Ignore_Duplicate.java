package org.test.projectone;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Ignore_Duplicate {
public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<Integer>();
	Set <Integer> s = new TreeSet<Integer>();
	
	li.add(12);
	li.add(15);
	li.add(16);
	li.add(12);
	li.add(17);
	s.add(12);
	s.add(15);
	s.add(20);
	s.add(12);
	
	System.out.println(li);
	System.out.println(s);
}
	
	
	
}
