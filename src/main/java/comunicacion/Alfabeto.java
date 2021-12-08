package comunicacion;
public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;}

    public void setLetras(String[] letras) {
        this.letras = letras;}

    public String getInterpretacion() {
        return interpretacion;}

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;}

    @Override
    public String interpretacion() {
        return interpretacion; }

    @Override
    public String toString() {
        String string="";
        for(int i =0; i<letras.length;i++){
            if (i!=letras.length-1){
                string+=letras[i]+", ";
            }else{
                string+=letras[i];
            }
        }
        return string;
    }

    public int cantidadLetras(){
        return letras.length;
    }

}