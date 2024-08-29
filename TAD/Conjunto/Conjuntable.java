
public class Conjunto implements Conjuntable{
    private Object[] datos;

}


public interface Conjuntable{
    public void agregar(Object elemento);
    public void eliminar(Object elemento);
    public boolean contiene (Object elemento);
    public boolean estaaVaciio;
    public int tamanio();
    public void vaciar();
    public Conjuntable unioon(Conjuntable c1);
    public Conjuntable interseccioon(Conjuntable c1);
    public Conjuntable diferenciar(Conjuntable c1);
    public boolean subconjunto(Conjuntable c1);
}

