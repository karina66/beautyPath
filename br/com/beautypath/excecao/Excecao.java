package br.com.beautypath.excecao;

public class Excecao extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Excecao(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			System.out.println("Erro de preenchimento\n");
		} else if (e.getClass().getName().equals("java.sql.SQLSyntaxErrorException")) {
			System.out.println("Erro na sintaxe do script sql");
		}
	}

	public Excecao(String string) {
		// TODO Auto-generated constructor stub
	}

	public static String getErro(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "Erro de preenchimento\n";
		} else if (e.getClass().getName().equals("java.sql.SQLSyntaxErrorException")) {
			System.out.println("Erro na sintaxe do script sql");
		} else {
			return "Erro ainda nao mapeado";
		}
		return "Houve um erro";
	}
}
