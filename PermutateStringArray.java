package usa_computing_olympiad;

import java.io.*;
import java.util.*;

public class PermutateStringArray {
	
	static ArrayList<String> permutations(ArrayList<String> s ) {
        
        int first = s.size() - 2;
        for ( ; first >= 0; first-- ) {
            if (s.get(first).compareTo(s.get(first + 1)) < 0)
                break;
        }

        if (first == -1)
            return null;

        
        int toSwap = s.size() - 1;
        for ( ; toSwap >= 0; toSwap-- ) {
            if (s.get(first).compareTo(s.get(toSwap)) < 0)
                break;
        }

        
        Collections.swap(s, first++, toSwap);

        
        toSwap = s.size() - 1;
        while ( first < toSwap )
            Collections.swap( s, first++, toSwap-- );

        return s;
    }

}
