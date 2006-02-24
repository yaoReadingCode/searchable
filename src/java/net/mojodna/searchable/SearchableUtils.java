/*
Copyright 2005-2006 Seth Fitzsimmons <seth@note.amherst.edu>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package net.mojodna.searchable;

import java.util.Collection;

/**
 * Utility methods for the Searchable toolkit.
 * 
 * @author Seth Fitzsimmons
 */
public class SearchableUtils {
    /**
     * Converts a Collection to an array of Strings.
     * 
     * @param fields Collection to convert.
     * @return Array of Strings.
     */
    public static String[] toStringArray(final Collection fields) {
        final String[] defaultFields = new String[ fields.size() ];
        int i = 0;
        for (final Object f : fields) {
            defaultFields[i++] = f.toString();
        }
        return defaultFields;
    }
}