# De Cenciarellis questionibus
*Die viginta prima Iunii anno duo millesimo viginta tertio
Ego Davidæ Avolius Cenciarellis interrogationes  transcripsi et saltem duodecim discipulos audii
Venia peto, tedia afficio, ibi octo horas sum*

---

1) [ ] How many ways are there to create anonymous classes?
2) [ ] Can you write (in your head) a lambda expression that adds two numbers?
3) [ ] Make that lambda expression work and use it to compute an actual sum
4) [ ] If x is a variable of type sum, what is the type of the object inside the lambda?
5) [ ] What are local classes?
6) [ ] The class is inside the method m. m creates an object of the local class and returns as a value. The object's class is class B. Now I've finished, can I invoke method m of the object. (No)
7) [ ] What is the problem?
8) [ ] What is the type of x? (since you're outside you can't say b; so it must be some class of type object)
9) [ ] What is a volatile variable?
10) [ ]  Suppose that class B is a subclass of class A. B x = new A, is this ok? (no)
11) [ ] Suppose that A has an attribute name. Can also attributes, like methods be overridden?
12) [ ] How do you override a method?
13) [ ] What are the occasions in which you write the keyword super
14) [ ] When is needed to use super in order to invoke te constructor of the super class
15) [ ] (Same as before with the subclass) I have class A and class B and both an attribute name and a method m. I am in the main and I say A x = new B. Then I do x.m. then i do print.name
16) [ ] A differrence between this and super (This dynamic, super static)
17) [ ] Can a constructor invoke another constructor?
18) [ ] Can abstract classes have constructors?
19) [ ] Why would you need that, if you can't create objects from an abstract class?
20) [ ] public static void main wait() why can't you do that?
21) [ ] How can you run main forever?
22) [ ] how can we stop the thread?
23) [ ] Who invokes isinterrupted?
24) [ ] What are assertions.?
25) [ ] Differrnce between exceptions and errors
26) [ ] How would you implement broadcast?
27) [ ] Are there lists already defined in standard Java?
28) [ ] Can you implement linked lists in standard?
29) [ ] Is a list of stacks a subtype of list of objects?
30) [ ] What are the uses of wildcards?
31) [ ] Can I use ? whenever I want instead of a type?
32) [ ] Instead of extend what can you use? (Super)
33) [ ] Suppose that you have a method public void m {sleep}. Is it possible that the compiler asks you to declare that there's an exception?
34) [ ] Is there any possibility in which I write method m and inside the method I say only wait?
35) [ ] Can you create artificially a deadlock? (Yes)
36) [ ] Can one thread stop another thread from running? Like for example if one thread never ends, but it's stopped by another one.
37) [ ] What are the values that a local class can manipulate? (Final or essentially final)
38) [ ] Talk about access modifiers
39) [ ] Can you write a lambda expression that writes "hello"? (The print statement is inside the lambda)
40) [ ] What's rhe difference between public static void main {new thread that lambda expression.start}
    Public static void main { Runnable r = that lambda expression
    r.run}
41) [ ] Talk about the function interface
42) [ ] Compose is a default method of interface function. Methods can be generic themselves, so does compose has its own generic parameter?
43) [ ] What is a functor? (For the laude)
44) [ ] Suppose that i have a shared stack with push and pop. At some point we gave an implementatil in which one thread pushes something in the stack and after that it notifies all. Why do we need to stnchronize push and pop and why do we need to notify all?
45) [ ] Why do we need to put synchronize?
46) [ ] I have a method m that has only wait, if I call this method does this will give a monitor exception?
47) [ ] When I extend the body of the anonymous class of A and I let that accept an integer. Can I use the newly created constructor? (Cenciarelli not Cenciarelling, he didn't want the answer, just a random thought)
48) [ ] How do you create an object of some class without calling the constructor (without new, you can use the reflections)
49) [ ] Threads doing push and pop (either one or both) and some of them get stuck and then it notify all. Since they're synchronized
50) [ ] Can a thread posses more than one lock at a time?