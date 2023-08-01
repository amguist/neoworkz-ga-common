package org.neoworkz.common.ga.utilities;

import java.util.ArrayList;
import java.util.List;

public final class StringUtil {

    private StringUtil() {

    }

    public static List<String> splitEqually(final String text, final int size) {
        final var ret = new ArrayList<String>((text.length() +size - 1) / size);
        for(var start = 0; start < text.length(); start += size) {
            ret.add(text.substring(start, Math.min(text.length(), start + size)));
        }
        return ret;
    }
}
