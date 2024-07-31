	package br.edu.ifs.academico;
	
	public class Vigilante extends Pessoa {
	
		public Vigilante(String nome) {
			super(nome);
		}
		
		private boolean armado;
		private String horario;
		
		public boolean isArmado() {
			return armado;
		}
		public void setArmado(boolean armado) {
			this.armado = armado;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
		
	}
