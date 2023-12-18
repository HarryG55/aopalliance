
package org.aopalliance.intercept;

/**
 * This interface represents an invocation in the program.
 *
 * <p>An invocation is a joinpoint and can be intercepted by an
 * interceptor.
 * 一个调用是一个连接点，可以被拦截器拦截。
 *
 * @author Rod Johnson */

public interface Invocation extends Joinpoint {
   
   /**
    * Get the arguments as an array object.
    * It is possible to change element values within this
    * array to change the arguments.
    * 
    * 用数组的方式来获取参数。可以通过更改数组中的元素值来更改参数。
    * 
    * @return the argument of the invocation */
   Object[] getArguments();

}
