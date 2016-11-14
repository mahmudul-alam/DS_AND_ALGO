package datastructure.graph.dijkstra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph {

	private Vertex[] graphObject;

	public Graph(File inputFile) {
		this.initializeGraph(inputFile);
	}

	private void initializeGraph(File inputFile) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(inputFile));
			int totalNumberOfNodes = Integer.valueOf(br.readLine().trim()).intValue();
			graphObject = new Vertex[totalNumberOfNodes];

			for (int i = 0; i < graphObject.length; i++) {
				Vertex v = new Vertex(br.readLine().trim(), "", -1);
				graphObject[i] = v;
			}
			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line.trim(), " ");
				int[] neighborList = new int[totalNumberOfNodes];
				int sourceVertexIndex = Integer.valueOf(str.nextToken());

				while (str.hasMoreTokens()) {
					neighborList[Integer.valueOf(str.nextToken())] = Integer.valueOf(str.nextToken());
				}

				graphObject[sourceVertexIndex].setListOfNeighborsAndDistance(neighborList);
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Vertex[] getGraphObject() {
		return graphObject;
	}

	
	/**
	 * 
	 * @param queue
	 */
	
	
	// TOOD - THIS FUNCTION IS ALMOST DONE. TRY TO DEBUG WITH THE DATA IN THE GRAPH_INPUT. YOU WILL FIND A LITTLE PROBLEM IN THE LOGIC.
	// FIX THAT.
	public void findShortestPath(Queue<Integer> queue) {
		Integer startVertex = queue.poll();
		Vertex finalVertex = graphObject[startVertex];
		finalVertex.setDoneCalulatingLength(true);
		if (finalVertex.getListOfNeighborsAndDistance() != null) {
			for (int i = 0; i < finalVertex.getListOfNeighborsAndDistance().length; i++) {
				if (finalVertex.getListOfNeighborsAndDistance()[i] != 0) {
					
					Vertex toModify = graphObject[i];

					if (!toModify.isDoneCalulatingLength()) {

						if (toModify.getLengthFromSourceVertex() == -1) {
							toModify.setLengthFromSourceVertex(toModify.getLengthFromSourceVertex()
									+ finalVertex.getListOfNeighborsAndDistance()[i] + 1);
							toModify.setSourceConnectedVertexName(finalVertex.getVertexName());
							queue.add(i);
						} else if (finalVertex.getLengthFromSourceVertex()
								+ finalVertex.getListOfNeighborsAndDistance()[i] < toModify
										.getLengthFromSourceVertex()) {
							toModify.setLengthFromSourceVertex(finalVertex.getLengthFromSourceVertex()
									+ finalVertex.getListOfNeighborsAndDistance()[i]);
							toModify.setSourceConnectedVertexName(finalVertex.getVertexName());
						}
					}
				}
			}
		}

		if (!queue.isEmpty()) {
			findShortestPath(queue);
		}

	}
}
