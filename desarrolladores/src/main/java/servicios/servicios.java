package servicios;
import java.util.List;
import desarrolladores.com.example.desarrolladores.desarrolladores;
public interface servicios {
    public List<desarrolladores> readAll();
    
    public desarrolladores readById(int id);
 
    public desarrolladores create(desarrolladores myEntity);
 
    public desarrolladores update(int id, desarrolladores myEntity);
 
    public void deleteById(int id);
 
    public void deleteAll();
}
