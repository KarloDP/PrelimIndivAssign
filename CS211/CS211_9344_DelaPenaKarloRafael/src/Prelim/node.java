package Prelim;

/*Karlo Rafael G Dela Pena
  2222630
  node object class
  September 8,2024
 */
public class node <T extends Comparable<T>>{
    private T info;
    private node<T> link;

    // constructor to create new node
    public node(){}

    public node(T info) {
        this.info = info;
        this.link = null;
    }

    public node(T info,node<T> link){
        this.info=info;
        this.link=link;
    }

    public node getLink() {
        return link;
    }

    public T getInfo() {
        return info;
    }

    public void setData(int data) {
        this.info = info;
    }

    public void setNext(node next) {
        this.link = link;
    }
}