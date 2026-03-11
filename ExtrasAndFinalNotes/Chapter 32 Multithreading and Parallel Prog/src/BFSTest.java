import java.util.*;

public class BFSTest {

	public static void main(String[] args) {
		Vertex<Character> v1 = new Vertex<>('A'), v2 = new Vertex<>('B'), v3 = new Vertex<>('C'), v4 = new Vertex<>('D'), v5 = new Vertex<>('E');
		UndirectedGraph<Character> graph = new UndirectedGraph<>();
		graph.addVertex(v1); graph.addVertex(v2); graph.addVertex(v3); graph.addVertex(v4); graph.addVertex(v5);
		graph.addEdge(v1, v2); graph.addEdge(v1, v3); graph.addEdge(v2, v3); graph.addEdge(v2, v5); graph.addEdge(v3, v4);
		
		graph.displayList();
		graph.BFS(v1);
	}
	
	private static class Vertex<E>{
		E data;
		int distance;
		Vertex<E> parent;
		
		public Vertex(E data) {
			this.data = data;
			this.distance = 0;
			this.parent = null;
		}
	}
	
	private static class UndirectedGraph<E>{
		
		HashMap<Vertex<E>, LinkedList<Vertex<E>>> adjacencyList;
		HashMap<Vertex<E>, Integer> vertexList;
		int size = 0;
		
		public UndirectedGraph() {
			adjacencyList = new HashMap<>();
			vertexList = new HashMap<>();
		}
		
		public void addVertex(Vertex<E> vertex) {
			if(!adjacencyList.containsKey(vertex)) {
				adjacencyList.put(vertex, new LinkedList<>());
				vertexList.put(vertex, size++);
			}else {
				System.out.println("Vertex " + vertex.data + " already exists");
			}
		}
		
		public void addEdge(Vertex<E> vertex1, Vertex<E> vertex2) {
			if(adjacencyList.containsKey(vertex1) && adjacencyList.containsKey(vertex2)) {
				adjacencyList.get(vertex1).add(vertex2);
				adjacencyList.get(vertex2).add(vertex1);
			}else {
				System.out.println("At least one vertex doesn't exist");
			}
		}
		
		public void displayList() {
			adjacencyList.forEach((Vertex<E> v, LinkedList<Vertex<E>> list)->{
				System.out.print(v.data +"->");
				for(Vertex<E> u : list) {
					System.out.print(u.data + " ");
				}
				System.out.println();
			});
		}
		
		public void BFS(Vertex<E> start) {
			Queue<Vertex<E>> queue = new LinkedList<>();
			boolean[] visited = new boolean[adjacencyList.size()];
			
			queue.add(start);
			visited[vertexList.get(start)] = true;
			while(!queue.isEmpty()) {
				Vertex<E> u = queue.peek();
				
				System.out.println(u.data + " ");
				for(Vertex<E> adj : adjacencyList.get(u)) {
					if(visited[vertexList.get(adj)] == false) {
						visited[vertexList.get(adj)] = true;
						queue.add(adj);
					}
				}
				queue.poll();
			}
			
		}
	}

}
