package datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

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
		// graph.findPathDFS(0);
		Queue<Integer> queue = new ArrayBlockingQueue(graph.getListOfVertex().length);
		queue.add(0);
		graph.findPathBFS(queue);
		System.out.println("Traversed Path");
		for (int i = 0; i < graph.pathTraversed.length; i++) {
			System.out.print(graph.pathTraversed[i]);
			if (i != graph.pathTraversed.length - 1)
				System.out.print("->");
		}
	}
}
