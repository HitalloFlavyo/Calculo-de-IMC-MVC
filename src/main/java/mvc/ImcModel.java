package mvc;

public class ImcModel {

	double imc = 0;
	String situacao, sexo;
	double peso, altura;

	public ImcModel(double peso, double altura, String sexo) {

		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	public String situacao() {

		imc = peso / (altura * altura);
		
		// Verifica se o sexo e masculino ou feminino
		if ("Masculino".equals(sexo)) { // Masculino
			if (imc < 20.7) {
				situacao = "IMC: " + imc + " (abaixo do peso)";
			} else if (imc >= 20.7 && imc < 26.4) {
				situacao = "IMC: " + imc + " (no peso normal)";
			} else if (imc >= 26.4 && imc < 27.8) {
				situacao = "IMC: " + imc + " (marginalmente acima do peso)";
			} else if (imc >= 27.8 && imc < 31.1) {
				situacao = "IMC: " + imc + " (acima do peso ideal)";
			} else if (imc > 31.1) {
				situacao = "IMC: " + imc + " (acima do peso ideal)";
			}
		} else { // Feminino
			if (imc < 19.1) {
				situacao = "IMC: " + imc + " (abaixo do peso)";
			} else if (imc >= 19.1 && imc < 25.8) {
				situacao = "IMC: " + imc + " (no peso normal)";
			} else if (imc >= 25.8 && imc < 27.3) {
				situacao = "IMC: " + imc + " (marginalmente acima do peso)";
			} else if (imc >= 27.3 && imc < 32.3) {
				situacao = "IMC: " + imc + " (acima do peso ideal)";
			} else if (imc > 32.3) {
				situacao = "IMC: " + imc + " (acima do peso ideal)";
			}
		}

		return situacao;
	}
}