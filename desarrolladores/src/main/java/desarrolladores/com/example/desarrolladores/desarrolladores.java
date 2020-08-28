package desarrolladores.com.example.desarrolladores;


public class desarrolladores {
    private int id;
    private String nombre_completo;
    private String link_github;
    private String tecnologias_conocidas;
 
    public desarrolladores() {
        super();
    }
 
    public desarrolladores(int id, String nombre_completo, String link_github, String tecnologias_conocidas) {
        super();
        this.id=id;
        this.nombre_completo = nombre_completo;
        this.link_github = link_github;
        this.tecnologias_conocidas=tecnologias_conocidas;
    }
    
    public int getid() {
    	return id;
    }
    
    public void setid(int id) {
    	this.id=id;
    }
 
    public String getnombre_completo() {
        return nombre_completo;
    }
 
    public void setnombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
 
    public String getlinkgithub() {
        return link_github;
    }
 
    public void setlink_github(String link_github) {
        this.link_github = link_github;
    }
 
    public String gettecnologias_conocidas() {
        return tecnologias_conocidas;
    }
 
    public void settecnologias_conocidas(String tecnologias_conocidas) {
        this.nombre_completo = tecnologias_conocidas;
    }
 
 
    @Override
    public String toString() {
        return "desarrolladores [id=" + id + ", nombre_completo=" + nombre_completo + ", link_github:"+ link_github+ ", tecnologias_conocidas:"+tecnologias_conocidas+ "]";
    }
 

}
