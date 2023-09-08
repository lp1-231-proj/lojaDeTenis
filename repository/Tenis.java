package repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.TenisModel;


public class Tenis {
	//insert 
	
		public void insert(TenisModel tenis) {
			String sql = "insert into  (id, nome, rg, cpf, data_nascimento, telefone, email) values (?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setLong(1, tenis.getIdTenis());
				stmt.setString(2, tenis.getPreco());
				stmt.setString(3, tenis.getTamanho());
				stmt.setInt(4, tenis.getColorway());
				stmt.setDate(5, tenis.getModelo());
				stmt.setString(6, tenis.getQuantidade());
				
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//selectAll
		
		public List<TenisModel> selectAll() {
			List<TenisModel> tenis = new ArrayList<>();
			String sql = "select * from tenis";
			List<TenisModel> teniss;
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					TenisModel tenis = new TenisModel();
					tenis.setIdTenis(rs.getLong("id"));
					tenis.setPreco(rs.getString("preco"));
					tenis.setTamanho(rs.getLong("tamanho"));
					tenis.setColorway(rs.getLong("colorway"));
					tenis.setModelo(rs.getDate("modelo"));
					tenis.setQuantidade(rs.getString("quantidade"));
					teniss.add(tenis);
				}

				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return teniss;
		}
		
		//selectById
		
		public TenisModel selectById(long id) {
			TenisModel tenis = null;
			String sql = "select * from tenis where id = ?";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					tenis = new TenisModel();
					tenis.setIdTenis(rs.getLong("id"));
					tenis.setPreco(rs.getString("preco"));
					tenis.setTamanho(rs.getLong("tamanho"));
					tenis.setColorway(rs.getLong("colorway"));
					tenis.setModelo(rs.getDate("modelo"));
					tenis.setQuantidade(rs.getString("quantidade"));
				}

				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return tenis;
		}

	}



