package org.aopalliance.intercept;

/**
 * Intercepts the construction of a new object.
 * 
 * 构造方法拦截器。
 *
 * <p>The user should implement the {@link
 * #construct(ConstructorInvocation)} method to modify the original
 * behavior. E.g. the following class implements a singleton
 * interceptor (allows only one unique instance for the intercepted
 * class):
 *
 * 用户应当实现construct方法来修改原始的行为。例如，下面的类实现了一个单例拦截器（只允许被拦截类的一个唯一实例）：
 * 
 * <pre class=code>
 * class DebuggingInterceptor implements ConstructorInterceptor {
 *   Object instance=null;
 *
 *   Object construct(ConstructorInvocation i) throws Throwable {
 *     if(instance==null) {
 *       return instance=i.proceed();
 *     } else {
 *       throw new Exception("singleton does not allow multiple instance");
 *     }
 *   }
 * }
 * </pre> */

public interface ConstructorInterceptor extends Interceptor
{
    /**
     * Implement this method to perform extra treatments before and
     * after the consrution of a new object. Polite implementations
     * would certainly like to invoke {@link Joinpoint#proceed()}.
     * 
     * 实现这个方法来在构造一个新对象之前和之后执行额外的处理。
     * 比较优雅的实现应当调用Joinpoint.proceed()。
     *
     * @param invocation the construction joinpoint
     * @return the newly created object, which is also the result of
     * the call to {@link Joinpoint#proceed()}, might be replaced by
     * the interceptor.
     * 
     * @param invocation 构造方法连接点
     * @return 新创建的对象，也是Joinpoint.proceed()方法的返回值，可以被拦截器替换。
     *
     * @throws Throwable if the interceptors or the
     * target-object throws an exception.  
     * 
     * @throws Throwable 如果拦截器或目标对象抛出异常。
     * */
    Object construct(ConstructorInvocation invocation) throws Throwable;
}
