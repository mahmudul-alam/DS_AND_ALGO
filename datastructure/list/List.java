package datastructure.list;

public interface List<GENERIC_TYPE> {
	
	public void add(GENERIC_TYPE element);
	public GENERIC_TYPE get(int index);
	public int indexOf(GENERIC_TYPE element);
}
