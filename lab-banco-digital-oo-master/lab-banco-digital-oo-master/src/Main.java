import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente sandra = new Cliente();
		sandra.setNome("Sandra");
		
		Conta ccSandra = new ContaCorrente(sandra);
		Conta poupancaSandra = new ContaPoupanca(sandra);
		ccSandra.depositar(10);
		poupancaSandra.depositar(1.5);
		ccSandra.imprimirExtrato();
		poupancaSandra.imprimirExtrato();
		
		cc.transferir(90, poupancaSandra);
		ccSandra.imprimirExtrato();
		poupancaSandra.imprimirExtrato();
		
		sandra.setNome("Sandra dos Anjos");
		System.out.println("O nome da cliente: " + sandra.getNome());
		sandra.setSobrenome("Ferreira");
		System.out.println("O cliente chama se: " + sandra.getNomeCompleto());
		
		List<Cliente> listaDeClientes = new ArrayList<Cliente>();
		listaDeClientes.add(sandra);
		listaDeClientes.add(venilton);
		
		for(int i = 0; i<listaDeClientes.size(); i++) {
			System.out.println("Cliente: " + listaDeClientes.get(i).getNomeCompleto());
		}
		
		
		//System.out.println("Os clientes sao: " + sandra.getNomeCompleto() + " " + venilton.getNomeCompleto());
		
	}

}
