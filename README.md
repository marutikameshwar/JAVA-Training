# JAVA-Training
BAJAJ JAVA TRAINING

JAVA NOTES  

- [ ] Java object oriented , multithreaded platform independent, robust, portable, secure programming language
- [ ] OOPS concept. -> Object, Class , Encapsulation, Abstraction ,Inheritance,Polymorphism, Late binding/ Dynamic binding
- [ ] Can develop wen standalone …..
- [ ] Its owned by Oracle 


Byte code makes java as a platform independent languagee
Robust - >   no need to delete the memory , automatically it gets deleted done by demon thread , automatic memory collection 

- [ ] Does not have pointers

Highly secure because it is platform independent only jre and Jvm takes care


Memory management 
JVM ( java virtual machine ) 
- [ ] It is an abstract machine
- [ ] It is a specifications that provides runtime environment
- [ ] Which java byte code can be executed 
- [ ] It allows to run a program
    - [ ] Loads code
    - [ ] Verifies code 
    - [ ] Executes code
    - [ ] Provides runtime environment

Stack - > temp memory 
Heap - > Dynamic memory can be allocated by new
Code is stored in class area

JDK = JRE + Developer tools
JRE = JVM + Library classes

.java file  - > Complier - > .class file is created 

Every java program should have a main function 
Main is the default thread which will be gets executed first 
It must have atlas one head 
Main is a very standard method which acts as the entry point of every program 


Static - > without and object we are executing so static is used 
- [ ] Save the code 
- [ ] Compile using javac filename
- [ ] Execute with java classname 

.class files are byte code

Standard pratice 
- [ ] Class name with capital letter 
- [ ] Method name with small letter
- [ ] Only one class in file 
- [ ] Class name is same as file name


Data types 

Primitive and non primitive DS
- [ ] Class name itself is a datatype it is user defined datatype this is non primitive datatype
DS	Bytes
Char	2
String	Not specified
Int	4
Long	8
Short	2
Byte	1
Float	4
Double	8
boolean	1 bit 

Byte > short > char > int > long > float > double
—— Widening
Reverse is not directly done should be done explicitly
Typecasting
* Widening Casting (automatically) - converting a smaller type to a larger type sizebyte -> short -> char -> int -> long -> float -> double
* Narrowing Casting (manually) - converting a larger type to a smaller size typedouble -> float -> long -> int -> char -> short -> byte

Double a = 32.4;
Int b = (int ) a;


OOPS 
- [ ] Objects 
- [ ] Classes
- [ ] Encapsulation 
- [ ] Abstraction 
- [ ] Inheritance 
- [ ] Polymorphism 
- [ ] Late binding / dynamic binding 
- [ ] Message passing.  

Object 
- [ ] It is a real world entity which exist can be difined 
- [ ] Instance of a class is object
- [ ] Every object has
    - [ ] Property / attribute 
    - [ ] Behaviour / functions
    - [ ] Identity 
CLass
    - [ ] User defined data type 
    - [ ] Which serves as the template for creating the objects

Syntax

class className{
	// variables
	// methods
	// blocks 
}


.this refers to the current object 
invocing name to the current object 


DTO - Data transfer object 
Every bin class should have setter and getter methods 


Constructor - > used to instantiate the object 
Special member function of a class
Name of constructor is same as class name 
Constructor can be public or private 
If constructor is a private we cannot create outside 
Generally we declare constructor as public 
It is automatically called as we create the object to a class
It is called once in a life of a object 

* To string method it is inbuilt can be modified (override ) 

public String toString(){
        return eid + " "+ name + " "+ salary;
    }

* String toString()
* Default will be the Class name and address
* 
 

If we want to call the parameterised constructor of parent class in inheritance then super key word should be used 
Eg = super(100)
Super key word should be used in the constructor first line of the child class 

Inheritance 

* Multiple inheritance is not applicable in java 
* To invoke the parent class function with same name (method overriding ) we can use super keyword super.display();
* Method overloading is accepted in inheritance
    * This is run time polymorphism 

Abstract Class
- [ ] It is always parent class
- [ ] Cannot create a object 
- [ ] Can be declared  by using abstract keyword
- [ ] You can have abstract and non abstract methods 
- [ ] But If we want to keep a abstract method then class must be a abstract class vice versa is not true
- [ ] Abstract method is a method without a body 

Exceptions Handling 
- [ ] Good programmer always handles exceptions 
- [ ] Exceptions are run time Errors which stops executions abnormally
- [ ] Errors which occur at run time are exceptions 

User Defined Exceptions
- [ ] Examples 
    - [ ] InvalidAgeException
    - [ ] CartEmptyException
    - [ ] EventException
    - [ ] OddException
- [ ] Creating own exception according to the business logic
- [ ] It should be extended with exception class
- [ ] For run time exceptions it she extends for runtimeException


Nested TRY CATCH
- [ ] We can use nested try catch 
- [ ] Try catch inside try 
- [ ] And try catch inside catch block is possible 

Try with resource 

- [ ] Resources which implements closable and if we initialise in try block then after completion it automatically closes 

Ex: - 

try(Scanner sc = new Scanner(System.in){

}catch(Exception e){

}

Here scanner class automatically closes 

——————————————
* Interfaces must have abstract classes

Collection Framework 
- [ ] Array is a collection of similar data type stored In contiguous memory locations
- [ ] Readymade classes 
- [ ] Boxing = converting primitive to non primitive 
    - [ ] Unboxing = non primitive to primitive 

￼


MAP

- [ ] Store Data in key and value pair
- [ ] Looks up key and get its corresponding value as a result
- [ ] No duplicate keys 


MAPS 
Collections
Functional interface
Abstract method
Ref
Lambda
Stream api


STREAM API 

- [ ] Stream is a sequence of data 
- [ ] Stream does not store elements 
- [ ] It conveys elements from source such as a date structure an array or an IO channel through a pipeline for computational operations
- [ ] All classes and interfaces are present in java.util.steam
- [ ] Operations
    - [ ] Map 
    - [ ] Filter 
    - [ ] Sorted

