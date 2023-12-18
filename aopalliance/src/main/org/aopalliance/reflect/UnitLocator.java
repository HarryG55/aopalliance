
package org.aopalliance.reflect;

/**
 * This interface represents a locator on a base program structural unit.
 * 
 * 这个接口代表了通过一个基本程序单元进行定位的定位器。
 *
 * <p>A program unit represents any structural part of the program
 * (i.e. any part excepting code) such as a class, a method, a
 * field...
 * 
 * 一个程序单元代表程序的任何结构部分（即除代码之外的任何部分），例如类，方法，字段...
 *
 * <p>Unit locators are quite different from code locators.
 * 
 * 单元定位器与代码定位器非常不同。
 *
 * @see ProgramUnit
 * @see ProgramUnit#getLocator()
 * @see CodeLocator */

public interface UnitLocator extends Locator {
}



