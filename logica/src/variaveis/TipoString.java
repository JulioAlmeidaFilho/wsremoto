package variaveis;

public class TipoString {
	
	public static void main(String[] args) {
		
		
		String email = "julio.fee07@Gmail.Com";
		System.out.println("Original: "+email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("? igual: " + email.equals("julio.fee07@gmail.com"));
		System.out.println("? igual 2: " + email.equalsIgnoreCase("julio.fee07@gmail.com"));
		System.out.println("Tem arroba? " + email.contains("@"));
		
		// j u l i o . f e e 0 7 @
		// 0 1 2 3 4 5 6 7 8 9 1011
		
		//-1 n?o achou
		
		System.out.println("Posi??o do @: " + email.indexOf("@"));
		System.out.println("Posi??o do -: " + email.indexOf("-"));
		System.out.println("Do 3? at? o 5?: " + email.substring(2,5));
		
		if(email.contains("@")==true) {
		System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));	
		} else {
		System.out.println("E-mail sem arroba!");
		}
		
		
		
		
		
		
	}

}
