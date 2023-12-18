
package org.aopalliance.reflect;

/**
 * This interface represents a locator on a base program piece of
 * code.
 * 
 * 这个接口代表了通过一段代码片段进行定位的定位器。
 *
 * <p>The AOP Alliance implementation provider should provide code
 * locators implementations in order to support several kinds of code
 * locators (e.g. as the ones used in the <code>Code</code>
 * interface).
 * 
 * AOP联盟接口提供者应该提供代码定位器接口，以便支持多种代码定位器（例如，<code>Code</code>接口中使用的代码）。
 *
 * <p>The AOP Alliance client program gets the locator by navigating
 * the base program metamodel (using the
 * {@link org.aopalliance.reflect} package) and using the
 * <code>get...Locator(...)</code> methods.
 * 
 * AOP联盟客户端程序通过导航基本程序元模型（使用{@link org.aopalliance.reflect}包）并使用<code>get...Locator（...）</code>方法来获取定位器。
 *
 * <p>Code locators are quite different from unit locators.
 * 
 * 代码定位器与单元定位器非常不同。
 *
 * @see Code
 * @see Code#getLocator()
 * @see Code#getCallLocator(Method)
 * @see Code#getReadLocator(Field)
 * @see Code#getWriteLocator(Field)
 * @see Code#getThrowLocator(Class)
 * @see Code#getCatchLocator(Class)
 * @see Method#getCallLocator()
 * @see UnitLocator */

public interface CodeLocator extends Locator {
}



