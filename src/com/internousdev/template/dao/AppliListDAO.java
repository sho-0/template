package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.AppliDTO;
import com.internousdev.template.util.DBConnector;

/**
 * DBから商品情報一覧を取得するクラス
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @version 1.1
 */

public class AppliListDAO {

    ArrayList<AppliDTO> selectList=new ArrayList<AppliDTO>();

    public ArrayList<AppliDTO> display(int id) throws IllegalAccessException, InstantiationException{
        try{

        	/*SQLへの接続*/
        	DBConnector dbc = new DBConnector();
            Connection con = dbc.getConnection();

            /*SQLから商品情報(カラム/商品ID、商品名、価格、商品詳細文、画像パス)を取得*/
            String sql = "select id,item_name,item_price,comment,img from item_info_transaction";
            PreparedStatement ps= con.prepareStatement(sql);

            if(id > 0){
            	sql = "select id,item_name,item_price,comment,img from item_info_transaction where id = ?";
                /*ユーザーが選んだ商品内容を、psの持っているSQL文に書き足す*/
                ps.setInt(1,  id );
            }


            /*psがDBを検索し該当データを見つけたら、そのデータをrsに入れ引っ張ってきてもらう*/
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
            	AppliDTO dto= new AppliDTO();
                dto.setId(rs.getInt("id"));
                dto.setItem_name(rs.getString("item_name"));
                dto.setItem_price(rs.getBigDecimal("item_price"));
                dto.setComment(rs.getString("comment"));
                dto.setImg(rs.getString("img"));

                selectList.add(dto);
                }

            rs.close();
            ps.close();
            con.close();


            /*catchは（）の中に指定した例外（エラー）が出たときに、どのような対処を行わせるかを記述する*/
        	}catch (SQLException e){
            e.printStackTrace();//←コンソールに例外(エラー)を表示させる
            }


        return selectList;
        }

}