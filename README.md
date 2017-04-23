# COP3538-P2-Ques
inserting, deleting, and searching a priority queue of objects.
COP 3538 – Data Structures with OOP
Project 2 – Fall 2016
Due:  October 4th (Tuesday) midnight

Priority Queues

Using NetBeans 8.0 or newer version, you are to write a Java program using OOP principles to accommodate the following functionality
  
Assignment #2
Objectives:
	Provide student with additional experiences with file input output.
	Provide student with exercises in learning UML
	Provide student with exercises in internally documented methods and classes 
	Provide student with exercises in building an array of objects to support priority 			queuing.
	Provide student with experience in inserting, deleting, and searching a priority 			queue of objects.

	
Functionality:

Step 1:  Build Three Regular Queues:  Given a sequential file, Presidents.docx (you may change this to a .txt file) on my Blackboard page  (same input file as Program 1) , you are to build a series of queues (later to become priority queues) as discussed ahead, and an additional stack to contain updates to the queues.  (Note:  initially the queues are not sorted and are thus regular queues.  Later, we will sort them and they will become priority queues.)  You are specifically required to build three queues of President objects one queue for each Party (Democrats, Republicans, and Whigs).  These queues are to be built from objects in the order of their occurrence in the input file.   

	As you are aware, there is additional data in each record in the file that you may not need for this program.  You will actually only need Party, Name, Number and perhaps a couple of other attributes named below.    You may continue to store all attributes in your objects, as before, if you wish.  But you will not need them all.

	When you initially design your queues, since you theoretically do not know the number of objects that your queues will need to hold the input President you are to use ArrayList() to contain your President Objects.  

	 

Step 2.  Display the Regular Queues:  Once all three  queues have been built (please verify as you go), you are to display each of the queues – by Party -  with an appropriate left justified header and detail lines on your screen, such as

Queue 1 : Democrats
     <skip a line> 
Number	Name		  Party

    39           Jimmy Carter     	Democrat
      7           Andrew Jackson	Democrat
	Etc.
Note:  numeric data is right justified;  text is left justified.
Try to center the text under the column headers as shown

.<skip two lines;  that is, two blank lines should appear, followed by:>

Queue 2:  Republicans 
	<skip a line>
Number	  Name		  Party

   38             Gerald Ford             Republican
   16             Abraham Lincoln    Republican
	etc.

Same for Queue 3 for Whigs


Step 3 Sort each of the queues using a Selection Sort:  sort the objects in each queue on Number, ascending.   This will now reconfigure the contents of each of the three queues as a ‘priority queue’ based on Number.

Step 4:  Display the Sorted Priority Queues:  You are to display each of the sorted priority queues    Your header should appear as:

Sorted Priority Queues    
<follow with a blank line and then print each queue in the format above>

Step 5:  Modify the Priority Queues via Update:  Using file President.Update.docx, 
You are to read this file of Strings, create a Stack of president objects in the order in which you read these from the input file, President.Update.docx.  After creating an object, push the object onto the Stack.

Step 6:  Display the Stack.  Display the Stack
Header should appear as:

Input Stack for Updating Priority Queues
<skip a blank line>
Number	  Name		  Party		
(Below are examples of how the stack is to appear.  But your inputs will be different than these )

Top of stack:
   38             Gerald Ford             Republican
   16             Abraham Lincoln    Republican
	etc.
Bottom of Stack

Step 7:  Update Priority Queues:  Update each priority queue according to Party and the Number of the President object.   Objects will be taken one at a time from the stack using pop() and then inserted appropriately into the correct Priority Queue in place.  Objects in each updated stack are to be in numerically ascending order ‘by number.’

Step 8:  Display Updated Priority Queues:  Using the formats to which we are accustomed, you are to display the priority queues in the same order as in Step 2.  The Header should read:

Updated Priority Queues:

<the rest is the same>


That’s it.    Since you are using ArrayList(), the size of each queue is not fixed and thus there is no need for wrap around.   As you add to each priority queue, the size of each queue will be made larger.  Thus no wrap around and no circularity. 


UML
	
	Recommend that you use a Main class and a Queue class (that contains the queues) and a President class as in the past.   You may include a Stack class that the Queue class depends upon (dashed open arrow from Queue class to Stack Class or perhaps aggregate from Main to Stack Class – or both)  so you should consider having four classes.

You may only use Word or Power Point.  Be sure to drag this rendering into your P2 folder on your desktop.  If you have any questions, please ask well in advance of the due date.

	Bonus in UML.  IF (and I stress IF) your program is graded at at least 85 (this means you cannot have pseudo-code or any other component in the deliverable missing), I will award ten points if you create a separate File Class in which you have your Opens, parsing, looping, closing, etc. for both input files).  DO NOT put much functionality in this File class, as its intent is to separate reading the input file (I/O operations) from the computations that start off with the Main driver.   Your UML must include the File I/O class in this rendering too, of course.   Idea here too is that we could change your input file(s) and the functionality of your program would still be in tact!!   Very important for quality program design and implementation.

Internal Documentation:

All classes and methods MUST have a cryptic clause or sentence describing the functionality.  Cryptic.  No book.  No more than a single sentence.   If you have more, this means that you have too much functionality in the method, which is not good.   EACH method is to have an @params to indicate parameters expected as inputs;  If none, then so state.  @params  None.  You must also have an @returns.  Same deal.  If method returns nothing, then say @returns Nothing.   This is very important.  See rubric.


Detailed Design:

Provide your detailed design, that is, your pseudo-code, for your queue-builder or queue driver or queue collection class, and your Stack class methods, whatever you call them.  Specifically, the algorithms within this class (that is, the methods) are to be included in your submission  You do not need to submit pseudo-code for any code in your main module or your President class.

Please look at examples and make this submission look professional!!  Separate your pseudo-code modules;  include indentation;  use language independent text such as Loop….end Loop;   if…Else…..Endif… all appropriated indented.

Lastly
Please ensure your zip file is entitled project2Yourname for easy identification for me.  Also look at the grading rubric to see how your deliverable to me will be graded.

Your grade will be found in the grading rubric in myGrades in Blackboard when the grading is completed.  Also you will see the grading rubric as shown with this project assignment.  Don’t forget to make your files ‘relative’ in the inputs.  Do not include a specification such as “C:\my stuff” as this will not work and it will cause serious problems since I cannot access your C drive.

Good luck and have fun!!
Program appears long, but it is short if you start right away!  Don’t wait!!  That way, if you encounter errors, we can clarify as you go.  Be smart.  Work smarter not harder.

