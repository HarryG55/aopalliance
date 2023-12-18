
package org.aopalliance.instrument;

/**
 * The exception that is raised when the client program tries to undo
 * an instrumentation and when current implementation does not support
 * it.
 * 
 * 这个异常在客户端程序试图撤销一个仪器化但当前实现不支持它时而引发。
 *
 * <p>Undoing is implemented by the {@link
 * Instrumentor#undo(Instrumentation)} method.
 *
 * @see Instrumentor */

public class UndoNotSupportedException extends Exception {
   
   /**
    * Sets a generic exception message for an instrumentation. */
   public UndoNotSupportedException(Instrumentation instrumentation) {
      super("Undo not supported for instrumentation: " + instrumentation);
   }
   
}

