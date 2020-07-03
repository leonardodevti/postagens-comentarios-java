package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entidades.Comentario;
import entidades.Postagem;

public class programa {

	public static void main(String[] args) throws ParseException {


	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	Comentario c1 = new Comentario ("Tenha uma boa viagem!");
	Comentario c2 = new Comentario ("Que legal!!!");
	Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"), 
			"Viajando para Nova Zelândia!", 
			"Vou visitar esse país maravilhoso!", 
			12);
	
	p1.adicionarComentario(c1);
	p1.adicionarComentario(c2);
	
	
	Comentario c3 = new Comentario ("Boa noite!");
	Comentario c4 = new Comentario ("Que a força esteja com você!");
	Postagem p2 = new Postagem(sdf.parse("28/07/2018 23:14:19"), 
			"Boa noite pessoal!", 
			"Até amanhã!", 
			5);
	
	p2.adicionarComentario(c3);
	p2.adicionarComentario(c4);
	
	System.out.println(p1);
	System.out.println(p2);
	}

}
