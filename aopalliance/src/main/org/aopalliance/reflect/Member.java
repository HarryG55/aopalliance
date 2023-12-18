
package org.aopalliance.reflect;

/**
 * This interface represents a class member.
 * 
 * 这个接口代表一个类成员
 *
 * <p>A member can be a field, a method, or a constructor. 
 * 
 * 一个类成员可以是一个属性，一段方法，或者一个构造器。
 * */

public interface Member extends ProgramUnit {

   /**
    * A constant to denote the program side that uses this member. 
    * 一个用于表示程序中使用这个成员数量的常量
    */
   int USER_SIDE=0;
   /**
    * A constant to denote the program side that provides this
    * member. 
    * 一个用于表示程序中提供这个成员数量的常量
    */
   int PROVIDER_SIDE=1;

   /**
    * Gets the class that declares this member. */
   Class getDeclaringClass();

   /**
    * The member's name. */
   String getName();

   /**
    * The modifiers value. */
   int getModifiers();
   
}
