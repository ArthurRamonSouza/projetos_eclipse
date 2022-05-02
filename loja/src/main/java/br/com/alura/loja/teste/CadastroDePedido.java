package br.com.alura.loja.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Cliente;
import br.com.alura.loja.modelo.ItemPedido;
import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.vo.RelatorioDeVendasVo;

public class CadastroDePedido {

	public static void main(String[] args) {

		Categoria celulares = new Categoria("Celulares");
		Produto celular = new Produto("Xiaomi Smartphone", "Redmi Note 9S", new BigDecimal("1700"), celulares);
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		
		Cliente cliente = new Cliente("Arthur", "112.962-.274-64");
		ClienteDao daoCliente = new ClienteDao(em);
		daoCliente.cadastrar(cliente);
		
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(new ItemPedido(10, pedido, celular));
		PedidoDao dao = new PedidoDao(em);
		dao.cadastrar(pedido);
		
		em.getTransaction().commit();
		
		BigDecimal valorTotal = dao.valorTotalVendido();
		System.out.println("VALOR TOTAL " + valorTotal);
		
		List<RelatorioDeVendasVo> relatorio = dao.relatorioDeVendas();
		relatorio.forEach(System.out::println);
		
		
		em.close();
	}
}
