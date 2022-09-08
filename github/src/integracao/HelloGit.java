package integracao;

public class HelloGit {
	
	public static void main(String[] args) {
		
	GitTudo gt = new GitTudo("Git é tudo de bom", "08/09/2022");
	   System.out.println("Hello Git!"); 
	   System.out.println("Este Projeto foi clonado e alterado!");
	   System.out.println("Clonado e commitado novamente....." + "agora com... \n" +  
	   gt.getNomeGitudo() + " em " + gt.getDataGitTudo());
	}   

}
