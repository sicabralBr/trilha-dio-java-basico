
public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 233.37;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá! Por favor informe o número da conta: ");
		numero = entrada.nextInt();
		System.out.println("Por favor informe a agência bancária: ");
		agencia = entrada.next();
		System.out.println("Por favor informe o nome do cliente: ");
		nomeCliente = entrada.next();
		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
