
package org.aopalliance.reflect;

/**
 * An abstract program unit.
 * 
 * 一个抽象的程序单元。
 *
 * <p>Any structural unit of a base program (class, member,
 * ...). Units exclude the code.
 * 
 * 任何基本程序的结构单元（类，成员，...）。单元不包括代码。
 *
 * <p>When referencing a program unit, the client can retrieve unit
 * locators using {@link #getLocator()} or more specific methods. This
 * locators shall be used conjointly with an {@link
 * org.aopalliance.instrument.Instrumentor} implementation in order to
 * perform aspetual transformations of the program (e.g. type merging,
 * parameters adding,...).
 * 
 * 当引用程序单元时，客户端可以使用{@link #getLocator（）}或更具体的方法检索单元定位器。
 * 定位器应当被用于与{@link org.aopalliance.instrument.Instrumentor}配合一起使用，
 * 已便于执行程序的转换（例如类型合并，参数添加，...）。
 *
 * <p>Program units also supports metadatas, i.e. the ability to add
 * extra information on the base program so that the client can
 * extends its meaning very easily.
 * 
 * 程序单元还支持元数据，即在基本程序上添加额外信息的能力，以便客户端可以非常容易地扩展其含义。
 *
 * @see org.aopalliance.instrument.Instrumentor
 * @see UnitLocator
 * @see Class
 * @see Method
 * @see Field */

public interface ProgramUnit {

   /**
    * Returns the locator that corresponds to this unit.
    */
   UnitLocator getLocator();

   /**
    * Returns the metadata that is associated to this unit from its
    * key. */
   Metadata getMetadata(Object key);

   /**
    * Returns all the metadatas that are associated to the current
    * unit. */
   Metadata[] getMetadatas();
   
   /**
    * Associates a metadata to the current unit.
    *
    * <p>If a metadata already exists with the same key, then its
    * value is replaced by the newly given one. */
   void addMetadata(Metadata metadata);

   /**
    * Removes a metadata from its key.
    *
    * <p>If none metadata having the given key exists, then this method
    * has no effect. */
   void removeMetadata(Object key);
}

