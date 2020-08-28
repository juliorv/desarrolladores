package servicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import org.springframework.stereotype.Service;
 
import desarrolladores.com.example.desarrolladores.desarrolladores;
 
@Service
public  class servicio_impl implements servicios{
    private List<desarrolladores> lista;
    
    {
        lista = new ArrayList<desarrolladores>();
        lista.add(new desarrolladores(1, "JULIO NUÑEZ","LINK","TECNO1, TECNO2"));
        lista.add(new desarrolladores(2, "JULIO NUÑEZ","LINK","TECNO1, TECNO2"));
        lista.add(new desarrolladores(3, "JULIO NUÑEZ","LINK","TECNO1, TECNO2"));
        
    }

	@Override
	public List<desarrolladores> readAll() {
		// TODO Auto-generated method stub
		
		return lista;
	}

	@Override
	public desarrolladores readById(int id) {
		// TODO Auto-generated method stub
		 for (desarrolladores des : lista) {
	            if (des.getid() == id) {
	                return des;
	            }
		 }
		return null;
	}

	@Override
	public desarrolladores create(desarrolladores des) {
		// TODO Auto-generated method stub
        lista.add(des);
        return des;
	}

	@Override
	public desarrolladores update(int id, desarrolladores des) {
		// TODO Auto-generated method stub
		 for (desarrolladores desact : lista) {
	            if (desact.getid() == id) {
	                int indice = lista.indexOf(desact);
	                lista.set(indice, des);
	                break;
	            }
	        }
	        return des;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		for (Iterator<desarrolladores> iterador = lista.iterator(); iterador.hasNext();) {
            desarrolladores des = iterador.next();
            if (des.getid() == id) {
                iterador.remove();
            }
        }
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		lista.clear();
	}
    
 
}
