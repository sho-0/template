/**
 *
 */
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.CreditDTO;
import com.internousdev.template.util.DBConnector;


/**
 * @author internousdev
 *
 */
public class CreditDAO {
	public CreditDTO select(String credit_name,String credit_number,
			String security_code, String  id_number){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		CreditDTO result = new CreditDTO();

		String sql = "select * from credit where credit_name=? and credit_number=? and security_code=? and id_number=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, credit_name);
			ps.setString(2,credit_number);
			ps.setString(3,security_code);
			ps.setString(4,id_number);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result.setCredit_name(rs.getString("credit_name"));
				result.setCredit_number(rs.getString("credit_number"));
				result.setSecurity_code(rs.getString("security_code"));
				result.setId_number(rs.getString("id_number"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
