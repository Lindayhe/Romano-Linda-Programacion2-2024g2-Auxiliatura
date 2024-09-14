package math;
import math.Vector;
import math.VectorOperation;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorOperation operation = new VectorOperation();
        Vector a = new Vector(34, 56);
        Vector b = new Vector(6, 34);
        operation.add();
        Integer result = operation.add(34, 3);
        Vector vectorResult = operation.add(a, b);
        Vector multResult = operation.multiply(a, b);
        Vector subResult = operation.subtract(a, b);
        System.out.println("los resultados de la suma, resta y multiplicacion son:");
        operation.print(vectorResult);
        operation.print(subResult);
        operation.print(multResult); 

	}

}
