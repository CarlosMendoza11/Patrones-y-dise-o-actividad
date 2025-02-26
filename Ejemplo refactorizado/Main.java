public class Main {
    public static void main(String[] args) {
        // Crear un perfil y un usuario
        Profile profile = new Profile("John", "Doe", "New York", "5th Ave", "10A", "2B");
        User user = new User("john.doe@example.com", "securePass123");

        // Servicios separados
        AuthService authService = new AuthService();
        FinanceService financeService = new FinanceService();

        // Registro y autenticación
        authService.register(user.getEmail(), user.getPassword());
        boolean loginSuccess = authService.login(user.getEmail(), "securePass123");

        System.out.println("Login successful: " + loginSuccess);
        System.out.println("User full name: " + profile.getFullName());
        System.out.println("User address: " + profile.getAddressString());

        // Operaciones financieras
        financeService.addBalance(100.50);
        System.out.println("User balance: " + financeService.getBalance());
    }
}
