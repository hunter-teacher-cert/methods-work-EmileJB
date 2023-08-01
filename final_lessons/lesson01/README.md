# Lesson 01 - Error Types

## Intended Audience and Course

This lesson should be appropriate for any high school student's first computer science class centered around written code. I imagine that means that this lesson would mostly be used in intro computer science classes, but I am aware that some intro CS classes start with block coding like Scratch or Snap, meaning this might be useful for classes that come after that. The materials for this lesson are very much centered around Java as programming language, more so than lesson 00 gets into how Java specifically handles errors.  This could fit well in an AP CS A course but it could be applied to other languages as well with enough modifications as the actual core of the lesson is not a Java exclusive idea.


## Explanation of Methods Used and Lesson Goals
Although as a class we would probably learn about errors and debugging naturally as the course went on, I feel like it would probably be good to devote at least one lesson to talking about errors. More specifically, the goal of this lesson would be for students to identify and differentiate between three types of programming errors; compilation errors, runtime errors, and logical errors. This lesson would probably come after both arrays/lists and loops have been introduced, as arrays can be a common cause of runtime errors and loops can be a common cause of logical errors. In a sense, this lesson could also serve as a refresher/review of both concepts. I'm unsure if this would be able to fit in this one lesson or if it would necessitate its own, but it would also be a good place for a class discussion of what errors students have noticed come up in their programming experience so far, and what has been their ways of dealing with them.

There are a lot of methods that could potentially be employed for such a lesson. For example, this could potentially include live coding to demonstrate what different errors in a program might look like when run. Students could have scaffolded but error-prone code as an activity where they have to work on both identifying and fixing errors in the code they've been presented. I've also thought of a potential group activity where each student has a chance to write, sabotage, and debug code given to them by other members of their group.

## Lesson Structure
### Aim:  How can we identify and differentiate between the three types of programming errors?

### Warm-Up (3-5 minutes)
Do Now: What is the difference between these two programs (provided in the materials as DoNowError1 and DoNowError2) and the errors they produce? How would we fix both programs?

Students will be given 3-5 minutes to answer these questions in their notebook (or something equivalent). A useful hint for students who might be struggling is to look carefully at what the error messages say.

### Warm-Up Review (3 - 5 minutes)
Although the Do Now uses pictures of the two different programs, we'll go over the Do Now by using live coding (provided in materials as main), using the code with syntax errors as the starting point

The review of the Do Now should follow a sequence somewhat like this. Bullets in quotes are examples of what you might ask the class

1)
-   Ask the class a similar question to the Do Now, "what is the difference between the two console outputs?"
-   Students wordings may vary, but it should be something along the lines of “one compiles while the other doesn’t” or “They have different error messages”
2) 
-   If it hasn’t been pointed out yet already, point out that the two different code samples have two different error messages
-   “Now that we know what the errors are, can we find what in the code/where in the code these errors are being caused by?”
-   If a student doesn’t point it out, point out that the error messages will tend to have line numbers next to them to help find the errors
3) 
-   “Now that we’ve identified what the errors are and where they are in the code, what should we do to fix these errors?”
-   Apply the coding fixes live
4)    
-   “Now that we’ve fixed these errors, let’s try running this program to see if it works”
-   Run the program and show that it compiles and runs, but the output is different than what would be expected
-   “We don’t get any error messages when we run our code, but is this output what we’d expect?”
-   “Why is the output of our program different from what we’d expect? What might we need to correct in our code?”
	- If everyone seems unsure what the problem is (the order of the if statements), it would be a good idea to do a quick code trace of the program
5) 
-   Run the program and show that it works correctly after applying the changes (
-   “So what you all might’ve noticed is that while working on this we encountered three different types of errors. Let’s go over in more detail what those three types of errors are.” AKA segue into the slides

### Slide Presentation (10-15 minutes)
Present the slides provided in the materials

A few of the slides in the materials have images of code that cause runtime or logic errors. While on these slides, ask the students if they can tell why the error arises. (The console outputs are there as a potential hint). 

For the logic error slides in particular, it may also be worth to ask students what they might do to correct the error. Doing quick trace diagrams in front of the class may also be helpful for this part

### Activity 1: Code Bugging (7 - 10 minutes)
Present students with code (provided in materials as ReverseArray) and ask them what potential errors we could introduce into this code. Make sure they also include what type of error they think this will cause and/or what they think the error message might look like (if any). Make sure to then run the newly bugged code live to see what error actually occurs
-   If need be, ask for specific types of errors if students are focusing on one type, i.e. “Can anyone think of any runtime errors we could introduce into this code”.
- If you trust your students, you could also have students come up to the front of the class and add the errors themselves. 
	- With this variation, you as the teacher could close your eyes and try to demonstrate how you might go about debugging such a program
	- Alternatively, you could have the rest of the class close their eyes and see if they can debug the newly introduced error.

### Activity 2: Code Debugging (8 - 12 minutes)
Students will be presented with code (provided in materials as CurvedAverageStudent) that is already riddled with errors (and will be told how many errors there are to look for). Students will take some time to look through and even run the code on their own and try to find and fix the errors themselves before reconvening as a class to go over what everyone found.