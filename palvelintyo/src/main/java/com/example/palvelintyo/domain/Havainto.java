package com.example.palvelintyo.domain;

public class Havainto {
		
		private String tyyppi;
		private String havainto;
		private String tila;
		private String osoite;
		private String ilmoittaja;
		
		
		
		public Havainto () {
			this.tyyppi = tyyppi;
			this.havainto = havainto;
			this.tila = tila;
			this.osoite = osoite;
			this.ilmoittaja = ilmoittaja;
		}

		public String getTyyppi() {
			return tyyppi;
		}

		public void setTyyppi(String tyyppi) {
			this.tyyppi = tyyppi;
		}

		public String getHavainto() {
			return havainto;
		}

		public void setHavainto(String havainto) {
			this.havainto = havainto;
		}

		public String getTila() {
			return tila;
		}

		public void setTila(String tila) {
			this.tila = tila;
		}

		public String getOsoite() {
			return osoite;
		}

		public void setOsoite(String osoite) {
			this.osoite = osoite;
		}

		public String getIlmoittaja() {
			return ilmoittaja;
		}

		public void setIlmoittaja(String ilmoittaja) {
			this.ilmoittaja = ilmoittaja;
		}

		@Override
		public String toString() {
			return tyyppi + havainto + osoite + ilmoittaja + tila;
		}

		
	}



