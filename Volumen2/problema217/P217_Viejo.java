package problema217;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P217_Viejo {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		OutputStream output = new BufferedOutputStream(System.out);

		int numero = Integer.parseInt(input.readLine());
		while (numero != 0) {
			boolean par = (numero & 1) == 0;
			output.write((par ? "DERECHA\n" : "IZQUIERDA\n").getBytes());
			numero = Integer.parseInt(input.readLine());
		}
		output.flush();
	}

}
