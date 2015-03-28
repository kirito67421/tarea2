public class PentagonoRegular {
	int lado;

	PentagonoRegular(int lado) // esta clase envia el lado del pentagono
	{
		this.lado = lado;
	}
	
	int getLado() // este clase envia el lado del pentagono
	{
		return lado;
	}
	
	void setLado(int lado) // este envia el lado del pentago
	{
		this.lado = lado;
	}
	
	int getPerimetro() // este toma el perimetro al pentagono
	{
		return lado*5;
	}
	
	
}
