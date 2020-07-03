package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer gostei;
	private List <Comentario> comentarios = new ArrayList <> ();

	public Postagem () {
		
	}

	public Postagem(Date momento, String titulo, String conteudo, Integer gostei) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.gostei = gostei; //A lista comentarios n�o deve estar no construtor.
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getGostei() {
		return gostei;
	}

	public void setGostei(Integer gostei) {
		this.gostei = gostei;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	//n�o se pode ter o m�todo setComentarios para que n�o troque a lista por outra.
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	//Usando a classe StringBilder para strings muito grandes.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//concatenando strings com o m�todo append.
		sb.append(titulo + "\n");
		sb.append(gostei);
		sb.append(" Gostei - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Coment�rios:\n");
		for (Comentario c : comentarios) {//Associando os textos de coment�rios a postagem.
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}

	
