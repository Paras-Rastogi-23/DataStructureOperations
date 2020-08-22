package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// Linked List operations
        System.out.println("\n\n#########################LINKED LIST OPERATIONS#######################");
        LinkedList<String> list = new LinkedList<>();
        list.add("paras");
        list.add("meggi");
        list.add("sona");
        list.add("kd");
        list.addFirst("King");
        list.addLast("Queen");
        list.add(2,"rastogi");
        System.out.println("initial LinkedList : "+list);
        System.out.println("Length of linkedList : "+list.size());


        String firstName = list.getFirst();
        String lastName  = list.getLast();
        String secondName = list.get(1);
        System.out.println("first name : "+firstName);
        System.out.println("lastName : "+lastName);
        System.out.println("secondName : " + secondName);

        list.remove(0);
        list.remove("paras");
        list.removeLast();
        boolean check = list.contains("sona");
        System.out.println("Now LinkedList Becomes : "+list);
        System.out.println(check);
        list.clear();
        System.out.println("Final list after getting clear() operation : "+list+"\n\n");

        //Queue operations
        System.out.println("########################Queue_Operations#######################");
        Queue<String> queue = new LinkedList<>();
        queue.add("Paras");
        queue.add("Rishabh");
        queue.add("guptag");
        queue.add("bhaai");
        queue.add("shweta");
        queue.add("mansi");
        System.out.println("Initial Queue : "+queue);
        System.out.println("Length of Queue : "+queue.size());
        System.out.println("peek element is : "+queue.peek());
        System.out.println("First removing element : "+queue.remove());
        System.out.println("Final queue : "+ queue+"\n\n");

        //Stack Operations
        System.out.println("\n\n#########################Stack OPERATIONS#######################");
        Stack<String> stack = new Stack<>();
        stack.add("Paras");
        stack.add("Shashank");
        stack.add("Doctor");
        stack.add("Ishika");
        stack.push("Lakshita");
        System.out.println("Initial Stack after insertion : "+ list);
        System.out.println("Length of Stack : "+stack.size());
        System.out.println("Top element of Stack : "+stack.peek());
        System.out.println("remove top element : "+stack.remove(0));
        String new_Item = stack.push("Rastogi");
        System.out.println("pushing new item is : "+new_Item );
        System.out.println("Stack is not Empty : "+ stack.isEmpty());

        stack.clear();
        System.out.println("Stack after removing : "+ stack);




    }
}
