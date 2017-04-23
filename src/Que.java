/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerrad
 */
public class Que {
private int maxSize;
private Presidents[] queArray;
private int front;
private int rear;
private int nItems;
public Que(int s) // constructor
{
    maxSize=s;
    queArray= new Presidents [maxSize];
    front =0;
    rear=-1;
    nItems=0;
}//end constructor
public void insert (Presidents j) //put item in rear of que
{
if(rear==maxSize-1) //deal with wraparound
    rear = -1;
queArray[++rear] = j; //increment rear and insert
nItems++;             // add more item
}//end insert method
/*public String remove() //take item from front of que
{
Presidents [] temp;
long temp =queArray[front++]; //get value and increment front
if(front ==maxSize)           //deal with wraparound
    front =0;
nItems--;                      //one less item
return temp;
}//end remove method*/
public String peekFront() //peek at front of que
{
return queArray[front];
}// end peekFront method
public boolean isEmpty() //true if que is empty
{
return (nItems==0);
}//end isEmpty method
public boolean isFull() //true is que is full
{
return (nItems==maxSize);
}//end isFull method
public int size()       //number of items in que
{
return nItems;
}
}// end Que class
