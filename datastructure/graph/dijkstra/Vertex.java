package datastructure.graph.dijkstra;

public class Vertex {

	private String vertexName;
	private String sourceConnectedVertexName;
	private int lengthFromSourceVertex;
	private boolean doneCalulatingLength;

	// we will store the distance length on the index where there is a neighbor
	// for example if A, B , C, D is the four node in the graph, and A has an edge to B and C
	// the Vertex A will have neighbor list array as [0, 2, 5, 0]. means that A has a no edge to A and D,
	// the distance between A and B and A and C respectively as 2 and 5. 
	private int[] listOfNeighborsAndDistance;

	public Vertex(String vertexName, String sourceConnectedVertexName, int lengthFromSourceVertex) {
		super();
		this.vertexName = vertexName;
		this.sourceConnectedVertexName = sourceConnectedVertexName;
		this.lengthFromSourceVertex = lengthFromSourceVertex;
		this.doneCalulatingLength = false;
	}

	public int[] getListOfNeighborsAndDistance() {
		return listOfNeighborsAndDistance;
	}

	public void setListOfNeighborsAndDistance(int[] listOfNeighborsAndDistance) {
		this.listOfNeighborsAndDistance = listOfNeighborsAndDistance;
	}

	public String getSourceConnectedVertexName() {
		return sourceConnectedVertexName;
	}

	public void setSourceConnectedVertexName(String sourceConnectedVertexName) {
		this.sourceConnectedVertexName = sourceConnectedVertexName;
	}

	public int getLengthFromSourceVertex() {
		return lengthFromSourceVertex;
	}

	public void setLengthFromSourceVertex(int lengthFromSourceVertex) {
		this.lengthFromSourceVertex = lengthFromSourceVertex;
	}

	public boolean isDoneCalulatingLength() {
		return doneCalulatingLength;
	}

	public void setDoneCalulatingLength(boolean doneCalulatingLength) {
		this.doneCalulatingLength = doneCalulatingLength;
	}

	public String getVertexName() {
		return vertexName;
	}
	
	
	
	
}
