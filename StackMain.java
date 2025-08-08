package com.assessment.oops;

public class StackMain {
	    public static void main(String[] args) {
	        IntegerStackManager obj = new IntegerStackManager();

	        obj.checkEmpty();
	        obj.pushElement(10);
	        obj.pushElement(20);
	        obj.popElement();
	        obj.checkEmpty();
	    }
	}


