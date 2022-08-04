public class App {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enqueue(3);
		fila.enqueue(5);
		fila.enqueue(1);
		System.out.println(fila);
		fila.dequeue();
		
		System.out.println(fila);
		System.out.println(fila.size());
		System.out.println("Primeiro: "+fila.front());
	}
}