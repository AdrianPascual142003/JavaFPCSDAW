package es.pascual.biblioteca;

import java.util.StringTokenizer;

class Data {

	private int dia;

	private int mes;

	private int anyo;

	private final int MESES_TOTAL_ANYO = 12;

	private static final String[] DIAS_TEXTO = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes",
			"sabado"};

	private static final String[] MESES_TEXTO = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1970
	 */
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1970;
	}

	/**
	 *  Inicializa la fecha
	 *  @param dia de la semana
	 *  @param mes del año
	 *  @param anyo
	 */
	public Data(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Crea una fecha a partir de otra fecha pasada como argumento
	 *
	 * Deberemos hacer uso de los métodos consultores para inicializar nuestra clase
	 *
	 * @param fecha
	 */
	public Data(Data fecha) {
		this.dia = fecha.getDia();
		this.mes = fecha.getMes();
		this.anyo = fecha.getAnyo();
	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
	 * @param fecha
	 */
	public Data(String fecha) {
		StringTokenizer cadenaFecha = new StringTokenizer(fecha,"/");
		int [] fechaPartida = new int[3];
		int indice = 0;
		while (cadenaFecha.hasMoreTokens()){
			fechaPartida[indice] = Integer.parseInt(cadenaFecha.nextToken());
			indice++;
		}
		this.dia = fechaPartida[0];
		this.mes = fechaPartida[1];
		this.anyo = fechaPartida[2];
	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){
		return mes;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAnyo(){
		return anyo;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarFormatoES()  {
		System.out.printf("%d-%d-%d %n",dia,mes,anyo);
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarFormatoGB() {
		System.out.printf("%d-%d-%d %n",anyo,mes,dia);
	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmm-yyyy
	 * Ej. 1 enero de 1970
	 */
	public void mostrarFormatoTexto() {
		System.out.printf("%d %s de %d %n",dia,getMesTexto(),anyo);
	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isEqual(Data otraFecha) {
		return dia == otraFecha.dia && mes == otraFecha.mes && anyo == otraFecha.anyo;
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato String
	 * @return String
	 */
	public String getDiaSemana() {
		int diaSemana = getDiasTranscurridosOrigen() % 7;
		String dia;
		if (diaSemana == 0){
			dia = DIAS_TEXTO[0];
		}else if (diaSemana == 1){
			dia = DIAS_TEXTO[1];
		}else if (diaSemana == 2){
			dia = DIAS_TEXTO[2];
		}else if (diaSemana == 3){
			dia = DIAS_TEXTO[3];
		}else if (diaSemana == 4){
			dia = DIAS_TEXTO[4];
		}else if (diaSemana == 5){
			dia = DIAS_TEXTO[5];
		}else{
			dia = DIAS_TEXTO[6];
		}
		return dia;
	}

	/**
	 * Solo Festivo sábado o domingo
	 * @return boolean
	 */
	public boolean isFestivo() {
		return getDiaSemana().equalsIgnoreCase(DIAS_TEXTO[0]) || getDiaSemana().equalsIgnoreCase(DIAS_TEXTO[6]);
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha añadiendo  @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Data anyadir(int numDias){
		int diaNuevo = dia + numDias;
		int mesNuevo = mes;
		int anyoNuevo = anyo;
		if (numDias > 30){
			return new Data(dia,mes,anyo);
		}
		if (diaNuevo > getDiasMes(mes,anyo)){
			diaNuevo = diaNuevo - getDiasMes(mes,anyo);
			mesNuevo++;
			if (mesNuevo > MESES_TOTAL_ANYO){
				mesNuevo = mesNuevo - MESES_TOTAL_ANYO;
				anyoNuevo++;
			}
		}
		return new Data(diaNuevo,mesNuevo,anyoNuevo);
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha restando @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Data restar(int numDias){
		int diasNuevos = dia - numDias;
		int mesNeuvo = mes;
		int anyoNuevo = anyo;
		if (numDias > 30){
			return new Data(dia,mes,anyo);
		}
		if (dia <= 0){
			diasNuevos = getDiasMes(mes,anyo) - Math.abs(diasNuevos);
			mesNeuvo--;
			if (mes <= 0){
				mesNeuvo = MESES_TOTAL_ANYO;
				anyoNuevo--;
			}
		}
		return new Data(Math.abs(diasNuevos),mesNeuvo,anyoNuevo);
	}

	public boolean isCorrecta(){
		return dia >= 0 && dia <= getDiasMes(mes, anyo);
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato caracter
	 * @return char
	 */
	private String getMesTexto() {
		return MESES_TEXTO[mes-1];
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiasTranscurridosOrigen() {
		int diasTotales = 0;
		for (int i = 1; i < anyo; i++) {
			diasTotales += getDiasAnyo(i);
		}
		return diasTotales + getDiasTranscurridosAnyo();
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo actual
	 *
	 * @return int
	 */
	private int getDiasTranscurridosAnyo() {
		int diesTotals = 0;
		for (int i = 1; i < mes; i++) {
			diesTotals += getDiasMes(i,anyo);
		}
		return diesTotals + dia;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto
	 * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
	 *
	 * @return boolean
	 */
	public static boolean isBisiesto(int anyo){
		return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 4 == 0 && anyo % 100 == 0 && anyo % 400 == 0);
	}

	/**
	 *  Calcula el número de días que tiene el mes representado por la fecha actual
	 *
	 *  @return int total dias mes en curso
	 */
	public static int getDiasMes(int mes, int anyo) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
			return 30;
		}else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			return 31;
		}else if (isBisiesto(anyo)){
			return 29;
		}else {
			return 28;
		}
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	public static int getDiasAnyo(int anyo){
		if (isBisiesto(anyo)){
			return 366;
		}else {
			return 365;
		}
	}
}
