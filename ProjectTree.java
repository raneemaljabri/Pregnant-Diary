/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProjectTree {

    NodeTree root;
    int size;
    int hight;

    public ProjectTree() {
        this.root = null;
        this.size = 0;
        this.hight = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public NodeTree getRoot() {
        return root;
    }

    public void setRoot(NodeTree root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        if (hight > this.hight) {
            this.hight = hight;
        }
    }
    public void addRecursive(String data) {
        NodeTree node = choosenode();
        node.getData().feelling.add(data);
    }
    /*addining node using recursion*/

    public NodeTree addRecursive(NodeTree current, Feeling data, boolean left) {
        NodeTree newnode = new NodeTree(data);
        if (left) {
            current.setLeftCh(newnode);
        } else {
            current.setRightChild(newnode);
        }
        return newnode;
    }

    public void Delete() {
        NodeTree node = choosenode();
        System.out.println("Please choose one feeling of the folowing to delete:");
        System.out.println(node.getData().toString());
        System.out.println("pleas enter feeling to remove");
        Scanner val = new Scanner(System.in);
        String key = val.next();
        node.getData().feelling.remove(key);
    }
    
    public NodeTree choosenode() {
        NodeTree node = root;
        Scanner n = new Scanner(System.in);
        System.out.println("First or second simister ");
        int simister = n.nextInt();
        System.out.println("Start of month or end of month");
        int month = n.nextInt();
        System.out.println("first week or second week");
        int week = n.nextInt();
        if (simister == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        if (month == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        if (week == 1) {
            node = node.getLeftCh();
        } else {
            node = node.getRightChild();
        }
        return node;
    }   
    public void Search(String data) {
        NodeTree choice1 = root.getLeftCh().getLeftCh().getLeftCh();
        NodeTree choice2 = root.getLeftCh().getLeftCh().getRightChild();
        NodeTree choice3 = root.getLeftCh().getRightChild().getLeftCh();
        NodeTree choice4 = root.getLeftCh().getRightChild().getRightChild();

        NodeTree choice5 = root.getRightChild().getLeftCh().getLeftCh();
        NodeTree choice6 = root.getRightChild().getLeftCh().getRightChild();
        NodeTree choice7 = root.getRightChild().getRightChild().getLeftCh();
        NodeTree choice8 = root.getRightChild().getRightChild().getRightChild();
        if (choice1.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semstar start month first week");
        } else if (choice2.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semstar start month second week");
        } else if (choice3.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semstar second month first week");
        } else if (choice4.getData().feelling.contains(data)) {
            System.out.println("your feeling was in first semstar second month second week");
        } else if (choice5.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semstar start month first week");
        } else if (choice6.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semstar start month second week");
        } else if (choice7.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semstar second month first week");
        } else if (choice8.getData().feelling.contains(data)) {
            System.out.println("your feeling was in second semstar second month second week");
        } else {
            System.out.println("your did not feel like this feeling ");
        }
    }
// وش كتبت 
    public void SearchHappen() {
        NodeTree node = choosenode();
        System.out.println(node.getData().toString());

    }

    public void Preorder() {
        System.out.println();
        Preorder(getRoot());
    }

    public void Preorder(NodeTree node) {
        //check if tree has nodes 
        if (node == null) {
            return;
        }
        //printRoot
        System.out.print(node.getData() + "/");
        //go left
        Preorder(node.getLeftCh());
        //go right
        Preorder(node.getRightChild());
    }

    public void Printinorder() {
        System.out.println();
        Preorder(getRoot());
    }
    // root, left, right

    public void inorder(NodeTree current) {

        //check if tree has nodes 
        if (current == null) {
            return;
        }
        //go left
        Preorder(current.getLeftCh());
        //printRoot
        System.out.print(current.getData() + " ");
        //go right
        Preorder(current.getRightChild());
    }
    /*to implemnt traversing level by level we need to use queue */

    public void Printfeeling() {
        NodeTree choice1 = root.getLeftCh().getLeftCh().getLeftCh();
        NodeTree choice2 = root.getLeftCh().getLeftCh().getRightChild();
        NodeTree choice3 = root.getLeftCh().getRightChild().getLeftCh();
        NodeTree choice4 = root.getLeftCh().getRightChild().getRightChild();

        NodeTree choice5 = root.getRightChild().getLeftCh().getLeftCh();
        NodeTree choice6 = root.getRightChild().getLeftCh().getRightChild();
        NodeTree choice7 = root.getRightChild().getRightChild().getLeftCh();
        NodeTree choice8 = root.getRightChild().getRightChild().getRightChild();

    System.out.println("in first semstar start month first week You felt the following");
System.out.println(choice1.getData().toString());

    }
       

}
