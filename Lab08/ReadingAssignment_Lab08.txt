1. When overriding the equals() method of the Object class, If the passing object is not an instance of Media, what happens?
Java does allow us to compare two different data types, so we have to cast the Object parameter obj to the type of Object that we dealing with (in this case is media).
To make sure that the passing object is an instance of Media, we should use keywork "instanceof" to check it. If the passing object is not an instance of Media,
the equal() method will return false.

2.Which method(s) do you need to implement from Comparable interface?
Comparable interface contains only one method named compareTo(Object)
public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns
	- positive integer, if the current object is greater than the specified object.
	- negative integer, if the current object is less than the specified object.
	- zero, if the current object is equal to the specified object.