package datastructure.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Graph {

	private Vertex[] listOfVertex;

	private Stack<Integer> stack;
	private Queue<Integer> queue;
	private boolean visited[];
	public String[] pathTraversed;
	private int pathTraversedIndex = 0;

	public Graph() {
		stack = new Stack<Integer>();
	}
	
	

	public Vertex[] getListOfVertex() {
		return listOfVertex;
	}



	public void initializeGraphDS(String inputFile) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(inputFile)));
			int numberOfVertex = Integer.valueOf(br.readLine().trim()).intValue();
			// initialize the graph with the number of vertex
			listOfVertex = new Vertex[numberOfVertex];
			visited = new boolean[numberOfVertex];
			pathTraversed = new String[numberOfVertex];

			// store all the vertex
			for (int i = 0; i < numberOfVertex; i++) {
				Vertex vertex = new Vertex(br.readLine().trim());
				listOfVertex[i] = vertex;
			}

			// set all the neighbor list
			StringTokenizer str;
			String line;
			while ((line = br.readLine()) != null) {
				str = new StringTokenizer(line.trim(), " ");
				int vertexIndex = Integer.valueOf(str.nextToken()).intValue();
				Vertex vertex = listOfVertex[vertexIndex];
				int[] neighborList = new int[str.countTokens()];
				int index = 0;
				while (str.hasMoreTokens()) {
					int nodeIndex = Integer.valueOf(str.nextToken()).intValue();
					neighborList[index++] = nodeIndex;
				}
				vertex.addNeighborList(neighborList);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void findPathDFS(int index) {

		Vertex vertex = listOfVertex[index];

		if (!visited[index]) {
			visited[index] = true;
			stack.push(index);
			pathTraversed[pathTraversedIndex++] = vertex.name;
		}
		if (vertex.listOfNeighobrs != null) {
			for (int i = 0; i < vertex.listOfNeighobrs.length; i++) {
				int newIndex = vertex.listOfNeighobrs[i];
				if (!visited[newIndex]) {
					findPathDFS(newIndex);
				}
			}

			if (!stack.isEmpty()) {
				Integer item = stack.pop();
				findPathDFS(item.intValue());
				// System.out.println(listOfVertex[item.intValue()].name);
			}
		}

	}

	public void findPathBFS(Queue<Integer> queue) {

		int index = queue.poll();

		Vertex startVertx = listOfVertex[index];
		if (!visited[index]) {
			visited[index] = true;
			pathTraversed[pathTraversedIndex++] = startVertx.name;
		}

		if (startVertx.listOfNeighobrs != null) {
			for (int neighbor : startVertx.listOfNeighobrs) {
				if (!visited[neighbor] && !queue.contains(neighbor)) {
					queue.add(neighbor);
				}
			}
		}
		if (!queue.isEmpty())
			findPathBFS(queue);

	}

}
