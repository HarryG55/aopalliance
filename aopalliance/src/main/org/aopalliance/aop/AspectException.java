package org.aopalliance.aop;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Superclass for all AOP infrastructure exceptions.
 * Unchecked, as such exceptions are fatal and end user
 * code shouldn't be forced to catch them.
 * 
 * 所有AOP异常的超类。
 * 声明为未受检异常。用户不应该被强制要求捕获该类异常。
 * 
 * @author Rod Johnson
 * @author Bob Lee
 */
public class AspectException extends RuntimeException {
	
	private String message;
	
	private String stackTrace;
	
	private Throwable t;

	/**
	 * Constructor for AspectException.
	 * @param s
	 */
	public AspectException(String s) {
		super(s);
		this.message = s;
		this.stackTrace = s;
	}

	/**
	 * Constructor for AspectException.
	 * @param s
	 * @param t
	 */
	public AspectException(String s, Throwable t) {
		super(s + "; nested exception is " + t.getMessage());
		this.t = t;
		StringWriter out = new StringWriter();
		t.printStackTrace(new PrintWriter(out));
		this.stackTrace = out.toString();
	}
	
	/**
	 * Return the root cause of this exception.
	 * May be null
	 * @return Throwable
	 */
	public Throwable getCause() {
		return t;
	}

	public String toString() {
		return this.getMessage();
	}

	public String getMessage() {
		return this.message;
	}

	public void printStackTrace() {
		System.err.print(this.stackTrace);
	}

	public void printStackTrace(PrintStream out) {
		printStackTrace(new PrintWriter(out));
	}

	public void printStackTrace(PrintWriter out) {
		out.print(this.stackTrace);
	}

}
