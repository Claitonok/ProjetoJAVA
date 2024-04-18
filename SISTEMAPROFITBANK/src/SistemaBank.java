public class SistemaBank {
		
		//CONSTRUTOR
	    public SistemaBank(String nome,String numeroConta,double saldoConta){
	        this.nome = nome;
	        this.numeroConta = numeroConta;
	        this.saldoConta = saldoConta; 
		    SistemaBank.Pagamento = SistemaBank.getPagamento() - this.saldoConta;
		    
	    }
	    
	    
	    
	    static double getPagamento() {
			return Pagamento;
		}
	    public static void setPagamento(double Pagamento) {
	    	SistemaBank.Pagamento = Pagamento;
	    }
	    

		private String nome;
	    private String numeroConta;
	    private double saldoConta;
	    private static double Pagamento;
	    private double CTotal;

		//MÉTODOS GETTERS E SETTERS
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta( String numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		
		//Saldo da conta
		public double getSaldoConta() {
			return saldoConta;
		}
		public void setSaldoConta(double saldoConta) {
			this.saldoConta = saldoConta;
		}
		
         //Total da conta
		public double getCTotal() {
			return CTotal;
		}
		public void setCTotal(double cTotal){
			this.CTotal = cTotal;
		}
		
		
		double Valor() {
			return saldoConta + CTotal;
		}
		
	}
		