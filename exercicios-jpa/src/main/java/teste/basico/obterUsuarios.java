package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class obterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); 
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql,  Usuario.class);
		query.setMaxResults(5);
		List<Usuario> usuarios = query.getResultList();
		
//		for (int i = 0; i < usuarios.size(); i++) {
//			System.out.println(usuarios.get(i));
//		}
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		
		emf.close();
		em.close();
	}
}
