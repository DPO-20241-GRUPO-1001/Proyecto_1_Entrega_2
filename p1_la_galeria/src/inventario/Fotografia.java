package inventario;

public class Fotografia extends ObraDeArte 
{

	//heredados
	private int codigoRegistro; //único para cada pieza
	private String tipoPieza;
	private String titulo;
	private int anio;
	private String lugar;
	private String autor;
	private boolean exhibicion; //exhibida o en bodega
	private String estado; //en venta, en subasta, en revisión, vendida, no adquirida 
	private int valor; 
	private boolean esValorFijo; //true si es fijo, false si es valor inicial de subasta
	private int propietarioActual; //identificador del ususario propietario en ese momento
	
	//atributos
	private float alto_cm;
	private float ancho_cm;
	private boolean color; //true si a color, false si a B&W
	
	
	//constructor
	public Fotografia(int codigoRegistro, String tipoPieza, String titulo, int anio, String lugar, String autor,
				boolean exhibicion, String estado, int valor, boolean esValorFijo, int propietarioActual, float alto,
				float ancho, boolean color) 
	{
		super(codigoRegistro, tipoPieza, titulo, anio, lugar, autor, exhibicion, estado, valor, esValorFijo, propietarioActual);
		// TODO Auto-generated constructor stub
		this.alto_cm = alto;
		this.ancho_cm = ancho;
		this.color = color;
		
	}


	//metodos
	public float getAlto_cm() {
		return alto_cm;
	}

	public float getAncho_cm() {
		return ancho_cm;
	}

	public boolean isColor() {
		return color;
	}


	@Override
	public int getCodigoRegistro() {
		// TODO Auto-generated method stub
		return super.getCodigoRegistro();
	}


	@Override
	public String getTipoPieza() {
		// TODO Auto-generated method stub
		return super.getTipoPieza();
	}


	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return super.getTitulo();
	}


	@Override
	public int getAnio() {
		// TODO Auto-generated method stub
		return super.getAnio();
	}


	@Override
	public String getLugar() {
		// TODO Auto-generated method stub
		return super.getLugar();
	}


	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return super.getAutor();
	}


	@Override
	public boolean isExhibicion() {
		// TODO Auto-generated method stub
		return super.isExhibicion();
	}


	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return super.getEstado();
	}


	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}


	@Override
	public boolean isEsValorFijo() {
		// TODO Auto-generated method stub
		return super.isEsValorFijo();
	}


	@Override
	public int getPropietarioActual() {
		// TODO Auto-generated method stub
		return super.getPropietarioActual();
	}
	
	

}
