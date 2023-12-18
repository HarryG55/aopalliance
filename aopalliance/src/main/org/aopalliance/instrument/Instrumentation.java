
package org.aopalliance.instrument;

import org.aopalliance.reflect.Locator;

/**
 * This interface represents an instrumentation on the base program.
 * 
 * 这个接口代表了一个基本程序上的一个仪器化。
 *
 * <p>The program instrumentor implementation should return an
 * intrumentation instance for each intrumentation which is performed.
 * 
 * 仪器化程序实现应该为每个执行的仪器化返回一个仪器化实例。
 *
 * @see Instrumentor */

public interface Instrumentation {

   /** Interface adding instrumentation type. */
   int ADD_INTERFACE=0;
   /** Superclass setting instrumentation type. */
   int SET_SUPERCLASS=1;
   /** Class adding instrumentation type. */
   int ADD_CLASS=2;
   /** Before code instrumentation type. */
   int ADD_BEFORE_CODE=3;
   /** After code adding instrumenta   tion type. */
   int ADD_AFTER_CODE=4;
   /** Metadata adding instrumentation type. */
   int ADD_METADATA=5;

   /**
    * Returns the location of this instrumentation. */
   Locator getLocation();
   
   /**
    * Gets the instrumentation type.
    *
    * @return ADD_INTERFACE | SET_SUPERCLASS | ADD_CLASS |
    * ADD_AFTER_CODE | ADD_BEFORE_CODE | ADD_AROUND_CODE |
    * ADD_METADATA */
   int getType();

}

