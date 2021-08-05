package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido Pedido = dao.obterPorId(1L);

		for (ItemPedido item : Pedido.getItens()) {
			System.out.println(item.getQuantidade());

		}
	}
}
