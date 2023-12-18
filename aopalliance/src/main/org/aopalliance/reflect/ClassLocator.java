
package org.aopalliance.reflect;

/**
 * This interface represents a specific unit locator for base program
 * classes.
 * 
 * 这个接口代表一个基于类的定位器
 *
 * <p>For instance, this locator can represent a given class, or a
 * given classes set (e.g. all the classes of a given package or all
 * the classes that implement a given interface).
 * 
 * 举例来说，这个定位器可以用于代表一个类，或者一个类集（比如一个指定包下的所有类，
 * 或者所有实现某个接口的类）
 *
 * @see ProgramUnit#getLocator()
 * @see Class#getClassLocator() */

public interface ClassLocator extends UnitLocator {
}



