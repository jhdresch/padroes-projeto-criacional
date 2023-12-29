package br.com.padroesprojeto.builder.builders;

import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public interface IBuilder {
	
	public void reset();
	public void setMotor(Motor motor);
	public void setLugares(Integer lugares);
	public void setTransmicao(Transmissao transmicao);
	public void setTipoCarro(TipoCarro tipoCarro);
	

}
