import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> valores = new ArrayList<>();
	        valores.add(86);
			valores.add(28);
			valores.add(25);
			valores.add(31);
			valores.add(42);
			valores.add(45);
			valores.add(52);
			valores.add(65);
			valores.add(17);
			   
		        System.out.println("VALORES DESORDENADOS");
		        System.out.println(valores);
		        System.out.println();
		        
		        System.out.println("VALORES ORDENADOS");
		        Collections.sort(valores);
		        System.out.println(valores);
		        System.out.println("\nFIM DA PESQUISA\n");
	}
}


