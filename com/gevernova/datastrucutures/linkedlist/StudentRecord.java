package com.gevernova.datastrucutures.linkedlist;

public class StudentRecord {
    class Node{
        int rollnum;
        String name;
        int age;
        char grade;
        Node next;

        public Node(int rollnum, String name, int age, char grade) {
            this.rollnum = rollnum;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    public void addAtBeginning(int rollnum, String name, int age, char grade){
        Node newNode = new Node(rollnum, name, age, grade);
        newNode.next = head;
        head = newNode; // update the head to the new node
    }
    public void addAtend(int rollnum, String name, int age, char grade){
        Node newNode = new Node(rollnum, name, age, grade);
        tail.next = newNode;
        tail = newNode; // update the tail to the new node
    }
    void deleteAtEnd(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Case 1: Only one node
        if (head == tail) {
            System.out.println("Deleted: " + head.rollnum);
            head = tail = null;
            return;
        }
        //traverse the linked list from start to before tail and remove the last node and mark last before node as tail
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        System.out.println("Deleted: " + tail.rollnum);
        current.next = null;
        tail = current;
    }
    public void deleteStudent(int rollnum) {
        if (head == null) {
            System.out.println("No data present");
            return;
        }

        // Case 1: The student to be deleted is the head
        if (head.rollnum == rollnum) {
            head = head.next;
            System.out.println("Student with roll number " + rollnum + " deleted.");
            return;
        }

        // Case 2: Deletion in the middle or end
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.rollnum == rollnum) {
                prev.next = current.next; // unlink the node
                System.out.println("Student with roll number " + rollnum + " deleted.");
                return;
            }
            prev = current;
            current = current.next;
        }

        // Case 3: Not found
        System.out.println("Student with roll number " + rollnum + " not found.");
    }

    public void displayRecords() {
        if (head == null) {
            System.out.println("No data present");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollnum + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StudentRecord record = new StudentRecord();
        record.addAtBeginning(101, "stuti", 20, 'A');
        record.addAtBeginning(102, "krethik", 21, 'B');
        record.addAtBeginning(103, "sam", 22, 'C');

        System.out.println("Before Deletion:");
        record.displayRecords();

        record.deleteStudent(102); // Delete Bob

        System.out.println("After Deletion:");
        record.displayRecords();

        record.deleteStudent(999); // Try deleting non-existent student
    }

}


