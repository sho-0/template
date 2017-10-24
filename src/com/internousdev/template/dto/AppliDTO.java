package com.internousdev.template.dto;

import java.math.BigDecimal;



/** 商品情報に関するDTO
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @version 1.1
 */

public class AppliDTO {

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
     * 商品リストから値を取得するためのインデックス番号
     */
    private int index;



	/**
	 * 商品IDを取得するメソッド
	 * @return tour_id 商品ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品IDを格納
	 * @param tour_id 商品ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 商品名を取得
	 * @return tour_name 商品名
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * 商品名を格納
	 * @param tour_name 商品名
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
	 * 詳細文を取得する
	 * @return comment 詳細文
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 詳細文を格納
	 * @param comment 詳細文
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
     * 商品リストから値を取得するためのインデックス番号を取得
     * @return index 商品リストから値を取得するためのインデックス番号
     */
    public int getIndex() {
        return index;
    }

    /**
     * 商品リストから値を取得するためのインデックス番号を格納
     * @param index 商品リストから値を取得するためのインデックス番号
     */
    public void setIndex(int index) {
        this.index = index;
    }

}
