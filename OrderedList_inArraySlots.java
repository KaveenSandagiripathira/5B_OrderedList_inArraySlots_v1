/** 
  OrderedList_inArraySlots
  
  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots implements OrderedList {

    private List_inArraySlots list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    /** 
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
     }

    /**
      @return the number of elements in this list
     */
	public int size(){
		return list_iAS.size();
	}
	
	 /**
      accessor
      @return element @index from this list
     */
	public int get(int index){
		return list_iAS.get(index);	
	}

    /**
      Set value at @index to @newValue and re-order
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
	public int set(int value, int index){
		int oldValue = get(index);
		remove(index);
		add(value);
		return oldValue;
		
	}
	
    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
	public int remove(int index){
		return list_iAS.remove(index);
	}

}
