
package org.aopalliance.reflect;

/**
 * A metadata is a pair of values (key,data) that can be associated to
 * a program unit.
 * 
 * 元数据是指一对kv值，用于匹配对应的程序单元。
 *
 * @see ProgramUnit
 * @see ProgramUnit#addMetadata(Metadata) */

public interface Metadata {

   /**
    * Gets the key of this metadata. */
   Object getKey();   

   /**
    * Gets the value of this metadata. */
   Object getValue();   

}

