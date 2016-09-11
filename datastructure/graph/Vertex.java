package datastructure.graph;

public class Vertex {

	public String name;
	public int[] listOfNeighobrs = null;

	public Vertex(String name) {
		this.name = name;
	}

	public void addNeighborList(int[] neighborList) {
		if (listOfNeighobrs == null) {
			listOfNeighobrs = new int[neighborList.length];
			this.listOfNeighobrs = neighborList;
		}
	}

}
