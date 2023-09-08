package repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ClienteModel;
import model.FuncionarioModel;
import model.VendaModel;
import model.TenisVenda;

public class Venda {
	
	public void insert(VendaModel venda) {
		String sql = "insert into venda (id, data_venda, cliente_id,  funcionaio_id) values (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, venda.getIdVenda());
			stmt.setDate(2, venda.getDataVenda());
			stmt.setString(3, cliente.getIdCliente());
			stmt.setString(4, funcionario.getIdFuncionario ());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
