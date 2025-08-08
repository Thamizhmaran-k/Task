package com.assessment.oops;
import java.util.Stack;
public class IntegerStackManager {
	    private Stack<Integer> stack = new Stack<>();
	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println(element + " pushed to stack.");
	    }

	    public void popElement() {
	        if (!stack.isEmpty()) {
	            System.out.println(stack.pop() + " popped from stack.");
	        } else {
	            System.out.println("Stack is empty, cannot pop.");
	        }
	    }

	    public void checkEmpty() {
	        if(stack.isEmpty()) {
	            System.out.println("Stack is empty.");
	        } 
	        else{
	            System.out.println("Stack is not empty.");
	        }
	    }
	}

	