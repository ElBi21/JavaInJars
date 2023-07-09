<h1 align="center">Java in Jars</h1>
<p align="center">A collection of files made during the Programming 2 course @ Sapienza</p>

---

# Introduction

The **Programming 2** course I took during my first year at Sapienza was about
Object Oriented programming, and the language that was used to teach us this programming
paradigm was **Java**. This is a mere collection of files that explain useful concepts
behind the vast world of **OOP** and Java itself. Each lesson has its own package, for a
whopping total of around **20** packages

# Lessons' topics

<table align="center">
    <tr>
        <th>Lesson</th>
        <th>Topics</th>
        <th>Files</th>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_01">01</a></td>
        <td><ul>
            <li>How to print <code>Hello World</code>;</li>
            <li>Creation of <b>methods</b>: how to make and call them;</li>
            <li>Creation of <b>attributes</b></li>
        </ul></td>
        <td>
            <code>HelloWorld.java</code>
            <br>
            <code>Sum.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_02">02</a></td>
        <td><ul>
            <li>Various operations in Java (<code>+</code>, <code>-</code>, <code>*</code> and <code>/</code>);</li>
            <li>Creation of <b>objects</b>;</li>
            <li>Meaning of the <code>static</code> keyword</li>
        </ul></td>
        <td>
            <code>Counter.java</code>
            <br>
            <code>Lesson02_Main.java</code>
            <br>
            <code>Static.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_03">03</a></td>
        <td><ul>
            <li>Concept of <b>encapsulation</b> and use of the <code>private</code> keyword;</li>
            <li>Use of <code>arrays</code> to implement <code>stacks</code>;</li>
            <li>Handling of <b>exceptions</b>;</li>
            <ul>
                <li>Use of the <code>throws</code> keyword;</li>
                <li>Use of the <code>try {...} catch (Exception) {...}</code> block;</li>
                <li>Creation of new exceptions</li>
            </ul>
        </ul></td>
        <td>
            <code>ArrayStack.java</code>
            <br>
            <code>ArrayStack2.java</code>
            <br>
            <code>EmptyStackException.java</code>
            <br>
            <code>Encapsulation.java</code>
            <br>
            <code>FullStackException.java</code>
            <br>
            <code>Lesson03_Main.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_04">04</a></td>
        <td><ul>
            <li>Implementation of <b>linked lists</b>;</li>
            <li>Introduction of the <code>null</code> value;</li>
            <li>The <code>this</code> object</li>
        </ul></td>
        <td>
            <code>EmptyStackException.java</code>
            <br>
            <code>IntList.java</code>
            <br>
            <code>Lesson04_Main.java</code>
            <br>
            <code>ListStack.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_05">05</a></td>
        <td><ul>
            <li>Introduction to <b>subclasses</b>;</li>
            <li>Use of <code>this</code> and <code>super</code> to respectively call the subclass'
                or the super class' constructor;</li>
            <li>Concepts of <b>inheritance</b>, <b>overloading</b> and <b>overriding</b>;</li>
            <li>Concept of <b>polymorphism</b>: methods are treated <b>dynamically</b>, while
                attributes are treated <b>statically</b></li>
        </ul></td>
        <td>
            <code>FirstClass.java</code>
            <br>
            <code>Lesson05_Main.java</code>
            <br>
            <code>SecondClass.java</code>
        </td>
    </tr>
    <tr>
        <td align="center" rowspan="5"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_06">06</a></td>
        <td><ul>
            <li><b>Packages</b>, <b>interfaces</b>, <b>abstract</b> classes and methods, <b>access modifiers</b> (each
                   topic is explained in a different package)</li>
        </ul></td>
        <td>
            <code>Lesson06_Main</code>
        </td>
    </tr>
    <tr>
        <td><ul>
            <li>Introduction to <b>packages</b> (1/2);</li>
            <li>Extendability of packages through other packages</li>
        </ul></td>
        <td>
            <code>Package01</code><br><ul>
                <li><code>SuperPowers.java</code></li>
                <li><code>TestPackage01Class.java</code></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td><ul>
            <li>Introduction to <b>packages</b> (2/2);</li>
            <li>Access modifiers (<code>public</code>, <code>package-private</code> (or <code>default</code>),
                <code>protected</code> and <code>private</code>)</li>
        </ul></td>
        <td>
            <code>Package02</code><br><ul>
                <li><code>Powers.java</code></li>
                <li><code>TestPackage02Class.java</code></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td><ul>
            <li>Application of <b>inheritance</b> in packages;</li>
            <li>Dynamicity of <code>this</code> and staticity of <code>super</code></li>
        </ul></td>
        <td>
            <code>Package03</code><br><ul>
                <li><code>ClassOne.java</code></li>
                <li><code>ClassTwo.java</code></li>
                <li><code>ClassThree.java</code></li>
                <li><code>TestPackage03Class.java</code></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td><ul>
            <li>Introduction to <b>interfaces</b> and <b>abstract</b> classses;</li>
            <li>Concrete methods against abstract methods;</li>
            <li>Concepts of <b>variable</b></li>
        </ul></td>
        <td>
            <code>Package04</code><br><ul>
                <li><code>IntegerVar.java</code></li>
                <li><code>IntegerVar_01.java</code></li>
                <li><code>IntegerVar_02.java</code></li>
                <li><code>ReadableInteger.java</code></li>
                <li><code>WritableInteger.java</code></li>
                <li><code>TestPackage04Class.java</code></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_07">07</a></td>
        <td><ul>
            <li>Further examples of <b>abstract</b> classes and introduction of <b>abstract methods</b>;</li>
            <li><b>Static</b> fields</li>
        </ul></td>
        <td>
            <code>Benchmark.java</code>
            <br>
            <code>Children.java</code>
            <br>
            <code>ConcreteBenchmark.java</code>
            <br>
            <code>Lesson07_Main.java</code>
            <br>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_08">08</a></td>
        <td><ul>
            <li>Interfaces: <b>fields</b>, <code>static</code> and <code>default</code> interface methods;</li>
            <li>Inheritance of <code>default</code> methods for multiple interfaces;</li>
            <li><b>Inner</b> classes, <b>inner</b> and <b>outer</b> objects;</li>
            <li><b>Scopes</b>;</li>
            <li><b>Local classes</b></li>
        </ul></td>
        <td>
            <code>Clash.java</code>
            <br>
            <code>Interface1.java</code>
            <br>
            <code>Interface2.java</code>
            <br>
            <code>Lesson08_Main.java</code>
            <br>
            <code>ReverseStack.java</code>
            <br>
            <code>Stack.java</code>
            <br>
            <code>State.java</code>
            <br>
            <code>TestLocalClasses.java</code>
            <br>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_09">09</a></td>
        <td><ul>
            <li><b>Generics</b>: implementation of <code>GenericList</code>;</li>
            <li><b>Identities</b>: differences between <code>==</code> and <code>equals()</code></li>
        </ul></td>
        <td>
            <code>GenericIdentity.java</code>
            <br>
            <code>GenericList.java</code>
            <br>
            <code>IntList.java</code>
            <br>
            <code>Lesson09_Main.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_10">10</a></td>
        <td><ul>
            <li><b>Generics</b>: <b>raw types</b>, <b>covariance</b> and <b>contravariance</b>;</li>
            <li><b>Wildcard</b>: use of <code>?</code> for indicating any type</li>
        </ul></td>
        <td>
            <code>ClassOne.java</code>
            <br>
            <code>ClassTwo.java</code>
            <br>
            <code>ClassThree.java</code>
            <br>
            <code>Generics.java</code>
            <br>
            <code>GenericsOne.java</code>
            <br>
            <code>GenericsTwo.java</code>
            <br>
            <code>Lesson10_Main.java</code>
            <br>
            <code>WildcardTest.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_11">11</a></td>
        <td><ul>
            <li><b>Anonymous classes</b>: implementation by <b>extending classes</b> and by <b>implementing interfaces</b>;</li>
            <li><b>Functional interfaces</b>;</li>
            <li><b>Lambda expressions</b> for replacing anonymous classes;</li>
            <li><b>Closures</b></li>
        </ul></td>
        <td>
            <code>Closures.java</code>
            <br>
            <code>Functio.java</code>
            <br>
            <code>FunctioTest.java</code>
            <br>
            <code>LambdaTest.java</code>
            <br>
            <code>Lesson11_Main.java</code>
            <br>
            <code>MyReadable.java</code>
            <br>
            <code>Readable.java</code>
            <br>
            <code>TestAnonymous.java</code>
        </td>
    </tr>
    <tr>
        <td align="center"><a href="https://github.com/ElBi21/Java-In-Jars/tree/main/src/Lesson_12">12</a></td>
        <td><ul>
            <li>Introduction to <b>Threads</b> and <b>Runnables</b>;</li>
            <li>Implementation of <code>delay()</code> and <code>run()</code> methods;</li>
            <li>Use of <b>lambda expressions</b> for creating a <code>run()</code> method</li>
        </ul></td>
        <td>
            <code>CompulsiveWordPrinter.java</code>
            <br>
            <code>Lesson12_Main.java</code>
            <br>
            <code>SleepyWordPrinter.java</code>
            <br>
            <code>ThreadTest.java</code>
            <br>
            <code>WordPrinter.java</code>
        </td>
    </tr>
</table>