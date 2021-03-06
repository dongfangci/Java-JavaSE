package HashMap;
/*
 * 	If you're only interested in the keys, you can iterate through the keySet() of the map:
 * 
	Map<String, Object> map = ...;

	for (String key : map.keySet()) {
	    // ...
	}
	If you only need the values, use values():

	for (Object value : map.values()) {
	    // ...
	}
	
	
	Finally, if you want both the key and value, use entrySet():

	for (Map.Entry<String, Object> entry : map.entrySet()) {
	    String key = entry.getKey();
	    Object value = entry.getValue();
	    // ...
	}
	One caveat: if you want to remove items mid-iteration, 
	you'll need to do so via an Iterator . 
	However, changing item values is OK (see Map.Entry).
	
	
	Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Extracted from the reference How to Iterate Over a Map in Java:

There are several ways of iterating over a Map in Java.
 Let's go over the most common methods and review their 
 advantages and disadvantages. Since all maps in Java 
 implement the Map interface, the following techniques 
 will work for any map implementation (HashMap, TreeMap, LinkedHashMap, Hashtable, etc.)
 

Method #1: Iterating over entries using a For-Each loop.

This is the most common method and is preferable in most cases. 
It should be used if you need both map keys and values in the loop.

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    
}
Note that the For-Each loop was introduced in Java 5, so this 
method is working only in newer versions of the language. 
Also a For-Each loop will throw NullPointerException if you 
try to iterate over a map that is null, so before iterating 
you should always check for null references.


Method #2: Iterating over keys or values using a For-Each loop.

If you need only keys or values from the map, you can iterate over keySet or values instead of entrySet.

Map<Integer, Integer> map = new HashMap<Integer, Integer>();

// Iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

// Iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}
This method gives a slight performance advantage over entrySet iteration (about 10% faster) and is more clean.

Method #3: Iterating using Iterator.

Using Generics:

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry<Integer, Integer> entry = entries.next();
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
Without Generics:

Map map = new HashMap();
Iterator entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry entry = (Map.Entry) entries.next();
    Integer key = (Integer)entry.getKey();
    Integer value = (Integer)entry.getValue();
    System.out.println("Key = " + key + ", Value = " + value);
}
You can also use same technique to iterate over keySet or values.

This method might look redundant, but it has its own advantages. 
First of all, it is the only way to iterate over a map in older versions of Java.
 The other important feature is that it is the only method that 
 allows you to remove entries from the map during iteration by calling iterator.remove().
  If you try to do this during For-Each iteration you will get "unpredictable results" according to Javadoc.

From a performance point of view this method is equal to a For-Each iteration.

Method #4: Iterating over keys and searching for values (inefficient).

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Integer key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println("Key = " + key + ", Value = " + value);
}
This might look like a cleaner alternative for method #1, but in practice
 it is pretty slow and inefficient as getting values by a key might be
  time-consuming (this method in different Map implementations is 
  20%-200% slower than method #1). If you have FindBugs installed, it 
  will detect this and warn you about inefficient iteration. This method should be avoided.

Conclusion:

If you need only keys or values from the map, use method #2. 
If you are stuck with older version of Java (less than 5) or 
planning to remove entries during iteration, you have to use method #3. Otherwise use method #1.
 * */

public class HashMapIterator {
	

}
