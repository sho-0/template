package com.internousdev.template.action;

import java.util.ArrayList;

import com.internousdev.template.dao.AppliListDAO;
import com.internousdev.template.dto.AppliDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品一覧を表示するアクション
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @version 1.1
 */

public class AppliListAction extends ActionSupport {


    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2317378109140954249L;

	/**
     * 商品ID
     */
    private int id;

    /**
     * 商品名
     */
    private String item_name;

    /**
     * テーマ
     */
    private String theme;

    /**
     * 価格
     */
    private int price;

    /**
     * 画像パス
     */
    private String img;

    /**
     * 商品詳細
     */
    private String comment;

    /**
     * 商品一覧表示用リスト
     */
    public ArrayList<AppliDTO> selectList=new ArrayList<AppliDTO>();


	/**
	 * 商品一覧を表示する実行メソッド
	 * @author MASAHIRO IZAWA
	 * @since 2017/10/24
	 * @version 1.1
	 */

    public String execute() throws IllegalAccessException, InstantiationException{
        String result=ERROR;
        System.out.println(id);

        AppliListDAO dao =new AppliListDAO();

        selectList=dao.display(id);

        if(selectList.size()>0){
            result=SUCCESS;

            System.out.println(img);
        }
        return result;
    }


    /**
     * 商品IDを取得
     * @return item_id 商品ID
     */
    public int getId() {
        return id;
    }

    /**
     * 商品IDを格納
     * @param tour_id ツアーID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 商品名を取得
     * @return tourName ツアー名
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * 商品名を格納
     * @param tour_name ツアー名
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * テーマを取得
     * @return thema テーマ
     */
    public String getTheme() {
        return theme;
    }

    /**
     * テーマを格納
     * @param theme テーマ
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 価格を格納
     * @param region 地方*/

    public int getPrice() {
        return price;
    }

    /**
     * 価格を格納
     * @param price 価格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 画像パスを取得
     * @return img 画像パス
     */
    public String getImg() {
        return img;
    }

    /**
     * 画像パスを格納
     * @param img 画像パス
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 商品詳細を取得
     * @return img 画像パス
     */
    public String getComment() {
        return comment;
    }

    /**
     * 商品詳細を格納
     * @param img 画像パス
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * 商品一覧表示用リストを取得
     * @return selectList セレクトリスト
     */
    public ArrayList<AppliDTO> getSelectList() {
        return selectList;
    }

    /**
     * 商品一覧表示用リストを格納
     * @param selectList セレクトリスト
     */
    public void setSelectList(ArrayList<AppliDTO> selectList) {
        this.selectList = selectList;
    }

    /**
     * シリアルIDを取得
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}