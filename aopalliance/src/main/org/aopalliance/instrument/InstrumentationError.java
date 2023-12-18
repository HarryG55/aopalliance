
package org.aopalliance.instrument;

/**
 * The error that is raised when an error occurs during an instrumentation.
 * 
 * 当在仪器化期间发生错误时引发的错误。
 *
 * @see Instrumentor */

public class InstrumentationError extends Error {
   
   /**
    * Sets a generic error message for an instrumentation error. */
   public InstrumentationError(Instrumentation instrumentation,
                               Throwable cause) {
      super("Error while instrumenting " + instrumentation,cause);
   }
   
}

