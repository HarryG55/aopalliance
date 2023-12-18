
package org.aopalliance.reflect;

/**
 * This element represents classes in the base program. */

public interface Class extends ProgramUnit {

   /**
    * Returns the class locator that corresponds to this class.
    * 
    * 返回与此类对应的类定位器。
    *
    * <p>This method returns exactly the same result as
    * <code>ProgramUnit.getLocator()</code> but with a more precise
    * type (<code>ClassLocator</code> instead of
    * <code>UnitLocator</code>).
    *
    * 这个方法返回的结果实际上和<code>ProgramUnit.getLocator()</code>完全相同，
    * 只不过提供了更精确的类型（提供<code>ClassLocator</code>而不是<code>UnitLocator</code>）
    *
    * @see ProgramUnit#getLocator() */
   ClassLocator getClassLocator();

   /**
    * Gets the class's full name. */
   String getName();

   /**
    * Gets the fields of this class (including superclass fields). */
   Field[] getFields();

   /**
    * Gets the fields declared by this class. */
   Field[] getDeclaredFields();

   /**
    * Gets the methods of this class (including superclass
    * methods). */
   Method[] getMethods();

   /**
    * Gets the methods declared by this class. */
   Method[] getDeclaredMethods();

   /**
    * Gets the superclass of this class. */
   Class getSuperclass();

   /**
    * Gets all the interfaces implemented by this class. */
   Class[] getInterfaces();

}
