#Chapter 5 Classes Summary

###5.0 Key points
* Fields in scala classes automatically come with getters and setters.
* 

###5.1 Simple classes and parameter-less methods.
* A parameter-less method can be called with or without parentheses. 
* To create a new class, use new ClassName() or new ClassName.
* **Note**: In scala a class is not declared as Public, and a source file can contain more than one class and all has public visibility.
```scala
class Counter {
    private var value: Int = 0
    //Function return unit, it has side effect, assignment return unit
    def increment() { value += 1}
    def current() = value
}
```

####It is pretty interesting that the way you define a scala method can be so different:
    1. Define with return type def current(): Int = value
    2. Define without return type def current() = value 
        * Compiler can refer the return type from value. 
        * In scala no return type is needed, unless the function makes recursive call to itself
        * You can call the function using current() or current, since it does not take any parameters, parentheses can be ignored.
    3. Define without return type and without parathenses def current = value
        *By removing the parentheses we can only call current by current, current() will give error **Int does not take parameters**
        
###5.2 Properties with Getter and Setter.
* A getter/setter pair is called a _property_
* In java, for classes, instead of providing public access level for fields, we provide getter and setter methods and enforce some restrictions on setter.
* Scala provides getter and setter methods for every field in the class. 
  * If a field is declared to be public, or not declared, it is public, and the getter and setter methods are public.
