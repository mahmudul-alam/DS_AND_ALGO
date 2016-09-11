package datastructure.graph;

public class TestGraph {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter input file name"); Scanner scanner = new
		 * Scanner(System.in); String fileName = scanner.next();
		 * scanner.close();
		 */
		Graph graph = new Graph();
		graph.initializeGraphDS("graph_input.txt");
		System.out.println("Graph Initialized");
		graph.findPathDFS(0);
		System.out.println("Traversed Path");
		for (int i = 0; i < graph.pathTraversed.length; i++) {
			System.out.print(graph.pathTraversed[i]);
			if (i != graph.pathTraversed.length - 1)
				System.out.print("->");
		}
	}
}
