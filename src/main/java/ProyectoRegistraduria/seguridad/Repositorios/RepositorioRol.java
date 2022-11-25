package ProyectoRegistraduria.seguridad.Repositorios;
import ProyectoRegistraduria.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
