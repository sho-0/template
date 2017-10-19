package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.AppliDTO;
import com.internousdev.template.util.DBConnector;

/**
 * 商品一覧画面遷移に関するメソッド
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */

public class AppliListDAO {

    ArrayList<AppliDTO> selectList=new ArrayList<AppliDTO>();

    public ArrayList<AppliDTO> display(int id) throws IllegalAccessException, InstantiationException{


    	/*テーマで検索されるとエリアが、エリアが入力されるとテーマが未入力のままアクションが動いてしまうので、空白を入れておきます*/

        try{

        	/*↓SQLへの接続を行っています*/
        	DBConnector dbc = new DBConnector();
            Connection con = dbc.getConnection();

            /*実行してもらうSQL分の、すでに決まっている部分を先に書いておきます*/
            /*テーマとエリアの部分だけは、お客さんが何を選ぶかによって変わるので、もう少しあとで決まります。*/
            /*（？の部分は、空欄、とイメージしてもらえるとわかりやすいかも）*/

            String sql = "select id,item_name,item_price,comment,img from item_info_transaction";

            /*↓psさんに、上で書いたSQL文をあげておつかいを頼むイメージです*/
            PreparedStatement ps= con.prepareStatement(sql);

            if(id > 0){
            	sql = "select id,item_name,item_price,comment,img from item_info_transaction where id = ?";
                /*ここで初めて、お客さんが選んだ（＝入力した）テーマとエリアの内容を、psの持っているSQL文に書き足します*/
                ps.setInt(1,  id );
            }


            /*psに、DBの中におつかいに行ってもらい、rsという入れ物に中身を入れて届けてもらうイメージです。*/
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
            	AppliDTO dto= new AppliDTO();
                dto.setId(rs.getInt("id"));
                dto.setItem_name(rs.getString("item_name"));
                dto.setItem_price(rs.getBigDecimal("item_price"));
                dto.setComment(rs.getString("comment"));
                dto.setImg(rs.getString("img"));
                System.out.println("取得ID："+ dto.getId());
                System.out.println("取得アイテム名：" + dto.getItem_name());
                System.out.println("取得価格：" + dto.getItem_price());
                System.out.println("商品詳細：" + dto.getComment());
                System.out.println("取得画像パス：" + dto.getImg());

                selectList.add(dto);
                }

            System.out.println("全取得データ数：" + selectList.size());

            rs.close();
            ps.close();
            con.close();


            /*↓ここから下の「catch」の部分は、（）の中に指定した例外（エラー）が出たときに、どのような対処を行わせるかが書かれています*/
        	}catch (SQLException e){
            e.printStackTrace();//←コンソールに並ぶ赤い文字のあれです
            }


        return selectList;
        }

}