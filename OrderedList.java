/*********************************
 * comments
 ********************************/

public interface OrderedList {
	int size();
	String toString();
	int get(int index);
	int set(int value, int index);
	void add(int value);
	int remove(int index);
}