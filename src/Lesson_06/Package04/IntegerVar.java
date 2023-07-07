package Lesson_06.Package04;

/** Interfaces are classes that work as templates for other classes. They provide a set of methods and attributes
 * (or eventually even classes) that have to be present in the class which will implement the interface. Interfaces
 * are under all effects classes: they can, for instance, extend one or multiple interfaces, creating thus a new
 * interface.
 *
 * Interfaces can either have abstract and concrete methods. An abstract method is a method that doesn't provide a
 * direct implementation, but that works as a blueprint for all the extending classes. Any class that extends an
 * interface where an abstract method is implemented must implement a method that has the same type, same return values
 * (with the same type as well) and same parameters prescribed by the abstract method.
 * */

public interface IntegerVar extends ReadableInteger, WritableInteger {
}