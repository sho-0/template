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
	public CreditDTO select(String creditName,int creditNumber,
			int securityCode, int  idNumber){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		CreditDTO result = new CreditDTO();

		String sql = "select * from credit";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,creditName);
			ps.setInt(2,creditNumber);
			ps.setInt(3,securityCode);
			ps.setInt(4,idNumber);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result.setCreditName(rs.getString("creditName"));
				result.setCreditNumber(rs.getInt("creditNumber"));
				result.setSecurityCode(rs.getInt("securityCode"));
				result.setIdNumber(rs.getInt("idNumber"));
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
