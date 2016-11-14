package datastructure.graph.dijkstra;

import java.io.File;
import java.net.URL;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestGraph {

	public static void main(String[] args) {
		URL path = TestGraph.class.getResource("graph_input.txt");
		Graph graph = new Graph(new File(path.getFile()));
		Vertex[] vertex = graph.getGraphObject();
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(vertex.length);
		queue.add(0);
		graph.findShortestPath(queue);
		
		System.out.println("Debug Here");
	}

}
