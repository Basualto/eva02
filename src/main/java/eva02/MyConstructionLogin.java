package eva02;
import java.util.Scanner;

public class MyConstructionLogin {


	    private static final String USERNAME = "admin";
	    private static final String PASSWORD = "1234";

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("=== Sistema de Login ===");

	        // Solicitar credenciales
	        System.out.print("Ingrese su usuario: ");
	        String inputUsername = scanner.nextLine();

	        System.out.print("Ingrese su contraseña: ");
	        String inputPassword = scanner.nextLine();

	        // Validar credenciales
	        if (authenticate(inputUsername, inputPassword)) {
	            System.out.println("¡Login exitoso! Bienvenido, " + USERNAME + ".");
	        } else {
	            System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
	        }

	        scanner.close();
	    }

	    // Método para autenticar usuario
	    private static boolean authenticate(String username, String password) {
	        return USERNAME.equals(username) && PASSWORD.equals(password);
	    }
	}
