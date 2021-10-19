package br.com.banco_talentos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Candidato {
	
	@Entity
	@Table(name = "candidato")
	public class Candidat{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String nome;
		
		private String email;
		
		private Date dataNasc;
		
		private int telefone;
		
		private String senha;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		

		public Date getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(Date dataNasc) {
			this.dataNasc = dataNasc;
		}
		

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		
		
	}

}
