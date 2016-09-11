package datastructure.list;

import java.util.Arrays;

public class MyList<GENERIC_TYPE> implements List<GENERIC_TYPE> { // this is
																	// equivalent
																	// to:
																	// //public
																	// class
																	// MyList<T>
																	// //public
																	// class
																	// MyList<E>
																	// //public
																	// class
																	// MyList<ANYTHING>

	private int DEFAULT_SIZE = 10;
	private Object[] elements;
	private int index = 0;

	public MyList() {
		elements = new Object[DEFAULT_SIZE];
	}

	public MyList(int size) {
		elements = new Object[size];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see datastructure.list.List#add(java.lang.Object)
	 */
	@Override
	public void add(GENERIC_TYPE element) {
		if (index == elements.length) {
			increaseCapacity();
		}
		elements[index++] = element;
	}

	private void increaseCapacity() {
		elements = Arrays.copyOf(elements, elements.length * 2);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see datastructure.list.List#get(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public GENERIC_TYPE get(int index) {
		if (index >= elements.length || index < 0) {
			throw new IndexOutOfBoundsException("Index Out of Bound");
		}
		return (GENERIC_TYPE) elements[index];
	}

	public String toString() {
		return Arrays.toString(elements);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see datastructure.list.List#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(GENERIC_TYPE element) {
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == element)
				return i;
		}
		
		return -1;
	}

}
