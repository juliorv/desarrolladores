package controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import desarrolladores.com.example.desarrolladores.desarrolladores;
import servicios.servicios;


@RestController
@RequestMapping("/des")
public class controlador {
	@Autowired
    servicios servicio;
	
	 @RequestMapping(value = "/desarrolladores/", method = RequestMethod.GET)
	    public ResponseEntity<List<desarrolladores>> readAllEntities() {
	        return new ResponseEntity<List<desarrolladores>>(servicio.readAll(), HttpStatus.OK);
	    }
	 
	   @RequestMapping(value = "/desarrolladores/{id}", method = RequestMethod.GET)
	    public ResponseEntity<desarrolladores> readEntityById(@PathVariable("id") int id) {
	        desarrolladores myEntityResult = servicio.readById(id);
	        return new ResponseEntity<desarrolladores>(myEntityResult, HttpStatus.OK);
	    }
	 
	    @RequestMapping(value = "/desarrolladores/", method = RequestMethod.POST)
	    public ResponseEntity<desarrolladores> createEntity(@RequestBody desarrolladores myEntity) {
	        servicio.create(myEntity);
	        return new ResponseEntity<desarrolladores>(myEntity, HttpStatus.CREATED);
	    }
	 
	    @RequestMapping(value = "/desarrolladores/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<desarrolladores> updateEntity(@PathVariable("id") int id, @RequestBody desarrolladores myEntity) {
	        servicio.update(id, myEntity);
	        return new ResponseEntity<desarrolladores>(myEntity, HttpStatus.OK);
	    }
	 
	    @RequestMapping(value = "/desarrolladores/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<desarrolladores> deleteEntityById(@PathVariable("id") int id) {
	        servicio.deleteById(id);
	        return new ResponseEntity<desarrolladores>(HttpStatus.NO_CONTENT);
	    }
	 
	    @RequestMapping(value = "/desarrolladores/", method = RequestMethod.DELETE)
	    public ResponseEntity<desarrolladores> deleteAllEntities() {
	        servicio.deleteAll();
	        return new ResponseEntity<desarrolladores>(HttpStatus.NO_CONTENT);
	 
	    }

}
