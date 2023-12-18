
package org.aopalliance.intercept;

import java.lang.reflect.AccessibleObject;

/**
 * 
 * 这个接口代表了一个通用的运行时连接点（joinpoint）（在AOP术语中）。
 *
 * 一个运行时连接点是一个发生在静态连接点上的事件（event）（即程序中的位置）。
 * 例如，调用是方法上的运行时连接点（静态连接点）。
 * 可以使用{@link #getStaticPart()}方法通用地检索给定连接点的静态部分。
 *
 * 在一个拦截框架的上下文中，一个运行时连接点是一个可访问对象（一个方法，一个构造器，一个字段）的实体化。
 * 也就是连接点的静态部分。
 * 用于传输给安装在静态连接点上的拦截器。
 *
 * @see Interceptor */

public interface Joinpoint {

   /**
    * 处理调用链中的下一个拦截器。

    * <p>The implementation and the semantics of this method depends
    * on the actual joinpoint type (see the children interfaces).
    *
    * @return see the children interfaces' proceed definition.
    *
    * @throws Throwable if the joinpoint throws an exception. */
   Object proceed() throws Throwable;

   /**
    * 返回持有当前连接点静态部分的对象。
    *
    * 例如，调用的目标对象。
    *
    * @return 对象（如果可访问对象是静态的，则可以为null）。
    *
    */
   Object getThis();

   /**
    * 返回此连接点的静态部分。
    * 静态部分是一个可访问对象，上面安装了一系列（chain of）拦截器。
    */

   AccessibleObject getStaticPart();   

}
