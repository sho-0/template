package com.internousdev.template.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AppliDetailDAO;
import com.internousdev.template.dto.AppliDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * 商品詳細を表示するクラス
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @since 1.1
 */

public class AppliDetailAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1521502778776531460L;

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 商品名
	 */
	private String item_name;

	/**
	 * 価格
	 */
	private BigDecimal item_price;

	/**
	 * テーマ
	 */
	private String theme;

	/**
	 * 詳細文
	 */
	private String comment;

	/**
	 * 画像パス
	 */
	private String img;

	/**
    * 商品詳細表示用リスト
    */
   private ArrayList<AppliDTO>  selectList = new ArrayList<AppliDTO>();

	/**
	 * セッション
	 */
	private Map<String, Object> session;



	/**
	 * 商品詳細を表示する実行メソッド
	 * @author MASAHIRO IZAWA
	 * @since 2017/10/24
	 * @version 1.1
	 */

	public String execute() throws SQLException {
		String result = ERROR;

		AppliDetailDAO dao = new AppliDetailDAO();
		 selectList = dao.select(id);

		if( selectList.size() != 0) {
			this.item_name =  selectList.get(0).getItem_name();
			this.img =  selectList.get(0).getImg();

			result = SUCCESS;
		}

		return result;

	}



	/**
	 * 商品IDを取得
	 * @return tour_id ツアーID
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
	 * @return tour_name ツアー名
	 */
	public String getIm_name() {
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
	 * 価格を取得
	 * @return price 価格
	 */
	public BigDecimal getItem_price() {
		return item_price;
	}

	/**
	 * 価格を格納
	 * @oaram price 価格
	 */
	public void setItem_price(BigDecimal item_price) {
		this.item_price = item_price;
	}

	/**
	 * テーマを取得
	 * @return theme テーマ
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
	 * 商品詳細文を取得
	 * @return comment ツアー詳細文
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 商品詳細文を格納
	 * @param comment ツアー詳細文
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
     * 商品一覧表示用リストを取得
     * @return displayList 商品一覧表示用リスト
     */
    public ArrayList<AppliDTO> getSelectList() {
        return  selectList;
    }

    /**
     * 商品一覧表示用リストを格納
     * @param displayList 商品一覧表示用リスト
     */
    public void setSelectList(ArrayList<AppliDTO> selectList) {
        this. selectList =  selectList;
    }

    /**
     * セッションを取得
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * シリアルIDを取得
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}