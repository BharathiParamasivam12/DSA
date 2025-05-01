package com.datastructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
       LinkedLists impl = new LinkedLists();
        impl.add(5);
        impl.add(10);
        impl.add(29);
        impl.addFirst(12);
        impl.addAt(0, 3);
        impl.delete(3);
        impl.show();
        
    }
   

    Node head; // First node to get start with all operation

    void add(int data){
       
        Node newNode = new Node();
        newNode.data=data;
        newNode.nextNode= null;   // create a new node for constucting the each node in list (box)

        if(head == null){
            head = newNode;
        }else{
            Node tempNode = head;    // just for looping and assiging values 
            while(tempNode.nextNode != null){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
        }
    }
    void show(){
        Node loopNode = head;
       
        while(loopNode !=null ){
         System.out.println(loopNode.data);
           loopNode = loopNode.nextNode;
        }
        //System.out.println(loopNode.data);

        
    }

    void addFirst(int input){
        Node firNode = new Node();
        firNode.data = input;
        firNode.nextNode = head;  // loop the first node's reference to head, so that head will 2nd node

        head = firNode;  ///make the first node as head
    } 

    void addAt(int index, int data){
        Node indexNode = new Node();
        indexNode.data = data;
        indexNode.nextNode = null;

        if(index == 0){
            addFirst(data);
            return;
        }

        Node loopNode = head;
        for(int i=0; i<index-1;i++){
            loopNode = loopNode.nextNode;
        }
        indexNode.nextNode = loopNode.nextNode;
        loopNode.nextNode = indexNode;
    
    }

    void delete(int index){

        if(index == 0){
            head = head.nextNode;
            return;
        }
     
        Node deleteNode = null;  
        Node loopNode = head;  //starting point

        for(int i=0; i< index-1; i++){
            loopNode = loopNode.nextNode;         
        }
        deleteNode = loopNode.nextNode;
        loopNode.nextNode = deleteNode.nextNode;
        System.err.println("deleted node:" +loopNode.data);
    }

}

class Node {
    int data;
    Node nextNode;
}



