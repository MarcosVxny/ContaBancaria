package contamodel;

public class ContaPoupanca extends Conta{

	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getDataCriacaoConta() {
		return aniversario;
	}

	public void setDataCriacaoConta(int dataCriacaoConta) {
		this.aniversario = dataCriacaoConta;
	}
		
		@Override 
		public void visualizar() {
			super.visualizar();
			System.out.println("Aniversario da Conta: ");
		}
		
		
		
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
