package com.internousdev.template.action;

import java.util.ArrayList;

import com.internousdev.template.dao.AppliListDAO;
import com.internousdev.template.dto.AppliDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品一覧を表示するアクション
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */

public class AppliListAction extends ActionSupport {


    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2317378109140954249L;

	/**
     * アプリID
     */
    private int id;

    /**
     * アプリ名
     */
    private String item_name;

    /**
     * テーマ
     */
    private String theme;

    /**
     * 地方

    private String region;

 */
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
     * サーチリスト
     */
    public ArrayList<AppliDTO> selectList=new ArrayList<AppliDTO>();


    /**
     * 実行メソッド
     * @return success or error
     * @throws InstantiationException
     * @throws IllegalAccessException
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
     * ツアーIDを取得するメソッド
     * @return item_id 商品ID
     */
    public int getId() {
        return id;
    }

    /**
     * ツアーIDを格納するメソッド
     * @param tour_id ツアーID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * ツアー名を取得するメソッド
     * @return tourName ツアー名
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * ツアー名を格納するメソッド
     * @param tour_name ツアー名
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * テーマを取得するメソッド
     * @return thema テーマ
     */
    public String getTheme() {
        return theme;
    }

    /**
     * テーマを格納するメソッド
     * @param theme テーマ
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * テーマを取得するメソッド
     * @return thema テーマ

    public String getRegion() {
        return region;
    }*/

    /**
     * 地方を格納するメソッド
     * @param region 地方

    public void setRegion(String region) {
        this.region = region;
    }*/

    /**
     * 地方を格納するメソッド
     * @param region 地方*/

    public int getPrice() {
        return price;
    }

    /**
     * 価格を格納するメソッド
     * @param price 価格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 画像パスを取得するメソッド
     * @return img 画像パス
     */
    public String getImg() {
        return img;
    }

    /**
     * 画像パスを格納するメソッド
     * @param img 画像パス
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 商品詳細を取得するメソッド
     * @return img 画像パス
     */
    public String getComment() {
        return comment;
    }

    /**
     * 商品詳細を格納するメソッド
     * @param img 画像パス
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * セレクトリストを取得するメソッド
     * @return selectList セレクトリスト
     */
    public ArrayList<AppliDTO> getSelectList() {
        return selectList;
    }

    /**
     * セレクトリストを格納するメソッド
     * @param selectList セレクトリスト
     */
    public void setSelectList(ArrayList<AppliDTO> selectList) {
        this.selectList = selectList;
    }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}