package meusclientes;

public class Clientes {
	
	private int ID;
	private String NOME;
	private String TELEFONE;
	private String CELULAR;
	private String EMAIL ;
	
	public Clientes(int id, String nome, String telefone, String celular, String email) {
		super();
		ID = id;
		this.NOME = nome;
		this.TELEFONE = telefone;
		this.CELULAR = celular;
		this.EMAIL = email;
	}
	public Clientes(){}
	


	public Clientes(String nome, String telefone, String celular, String email) {
		this.NOME = nome;
		this.TELEFONE = telefone;
		this.CELULAR = celular;
		this.EMAIL = email;
		}
	public String getCELULAR() {
		return CELULAR;
	}
	
	public void setCELULAR(String CELULAR) {
		this.CELULAR = CELULAR;
	}
	
	public String getEMAIL() {
		return EMAIL;
	}
	
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getNOME() {
		return NOME;
	}
	
	public void setNOME(String NOME) {
		this.NOME = NOME;
	}
	
	public String getTELEFONE() {
		return TELEFONE;
	}
	
	public void setTELEFONE(String TELEFONE) {
		this.TELEFONE = TELEFONE;
	}
}