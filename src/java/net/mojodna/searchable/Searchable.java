package net.mojodna.searchable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker interface for beans that should be searchable. Implementors of this
 * interface may use the provided annotations.
 * 
 * @author Seth Fitzsimmons
 */
public interface Searchable extends Result {
    /**
     * Mark this property as the id field for this class.
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ID {
        boolean value() default true;
    }
    
    /**
     * Mark this property as indexed.  Use the "name" attribute to override the
     * field name, the "nested" attribute to specify whether it should be
     * indexed when the object is a property on another Searchable, the
     * "stored" attribute to specify whether it should be stored (defaults to
     * false), the "boost" attribute to set a boost value, the "tokenized"
     * attribute to change whether it is tokenized (defaults to true), and the
     * storeTermVector" attribute to specify whether a term vector should be
     * stored.
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Indexed {
        String[] aliases() default {};
        float boost() default 1.0F;
        String name() default "";
        boolean nested() default true;
        boolean stored() default false;
        boolean storeTermVector() default false;
        boolean tokenized() default true;
        boolean value() default true;
    }
    
    /**
     * Mark this property to be stored (but not indexed) in the index.  Use the
     * "name" attribute to override the field name and the "nested" attribute
     * to specify whether this field should be processed in a nested Searchable.
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Stored {
        String[] aliases() default {};
        String name() default "";
        boolean nested() default true;
        boolean value() default true;
    }
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Sortable {
        String name() default "";
        boolean nested() default false;
    }
}
