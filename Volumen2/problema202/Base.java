package problema202;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Base {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = new BufferedOutputStream(System.out);

		String entrada = in.readLine();
		String[] entradaSplit = entrada.split(" ");
		int n = Integer.parseInt(entradaSplit[0]);
		int k = Integer.parseInt(entradaSplit[1]);
		while (n + k != 0) {
			int cantidad = 0;
			for (int numero = 0; numero < n * n; ++numero) {
				int numeroAux = numero;
				int bitsAUno = 0;
				for (int bit = 0; bit < n; ++bit) {
					bitsAUno += numeroAux & 1;
					numeroAux = numeroAux >> 1;
				}

				if (bitsAUno == k) {
					++cantidad;
				}
			}

			String imprimir = String.format("%s\n", Integer.toString(cantidad));
			out.write(imprimir.getBytes());

			entrada = in.readLine();
			entradaSplit = entrada.split(" ");
			n = Integer.parseInt(entradaSplit[0]);
			k = Integer.parseInt(entradaSplit[1]);
		}

		out.flush();
	}

}
