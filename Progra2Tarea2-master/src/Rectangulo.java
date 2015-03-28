public class Rectangulo {
int altura, base;
	
	Rectangulo(int base, int altura) // este esl e constructor del rectangulo
	{
		this.base = base;
		this.altura = altura;		
	}
	
	int getAltura() // esta clase envia la altura
	{
		return altura;
	}
	int getBase() //esta clase envia la base
	{
		return base;
	}
	
	void setAltura(int altura) // esta clase modifica la altura
	{
		this.altura = altura;
	}
	void setBase(int base) // este clase modigica la base
	{
		this.base = base;
	}
	
	int getPerimetro() // esta clase modifica el perimetro
	{
		return (2*(altura+base));
	}
	int getArea() // este modigica el area
	{
		return (altura*base);
	}
}
