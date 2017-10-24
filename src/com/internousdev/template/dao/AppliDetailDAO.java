package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.AppliDTO;
import com.internousdev.template.util.DBConnector;



/**
 * DBから商品詳細を取得するクラス
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @version 1.1
 */

public class AppliDetailDAO {

	public ArrayList<AppliDTO> select(int id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		AppliDTO dto = new AppliDTO();
		ArrayList<AppliDTO>  selectList = new ArrayList<AppliDTO>();
		String sql = "SELECT * FROM item_info_transaction WHERE id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getBigDecimal("item_price"));
				dto.setTheme(rs.getString("theme"));
				dto.setComment(rs.getString("comment"));
				dto.setImg(rs.getString("img"));

                selectList.add(dto);
			}

		} catch(SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();

			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return selectList;

	}

}