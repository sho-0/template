/**
 *
 */
package com.internousdev.template.dto;

/**
 * @author internousdev
 *
 */
public class CreditDTO {
	/**
	 * クレジット会社
	 */
	private String credit_name;

	/**
	 * クレジット番号
	 */
	private String credit_number;

	/**
	 * セキュリティ番号
	 */
	private String security_code;

	/**
	 * IDナンバー
	 */
	private String id_number;

	/**
	 * クレジット会社名を取得
	 * @return creditName クレジット会社名
	 */
	public String getCredit_name(){
		return credit_name;
	}

	/**
	 * クレジット会社名を格納
	 * @param creditName クレジット会社名
	 */
	public void setCredit_name(String credit_name){
		this.credit_name = credit_name;
	}

	/**
	 * クレジット番号を取得
	 * @return creditNumber クレジット番号
	 */
	public String getCredit_number(){
		return credit_number;
	}

	/**
	 * クレジット番号を格納
	 * @param creditNumber クレジット番号
	 */
	public void setCredit_number(String credit_number){
		this.credit_number = credit_number;
	}

	/**
	 * セキュリティ番号を取得
	 * @return securityCode セキュリティ番号
	 */
	public String getSecurity_code(){
		return security_code;
	}

	/**
	 * セキュリティ番号を格納
	 * @param securityCode セキュリティ番号
	 */
	public void setSecurity_code(String security_code){
		this.security_code = security_code;
	}

	/**
	 * iDナンバーを取得
	 * @return idNumber IDナンバー
	 */
	public String getId_number(){
		return id_number;
	}

	/**
	 * IDナンバーを格納
	 * @param idNumber IDナンバー
	 */
	public void setId_number(String id_numbe){
		this.id_number = id_numbe;
	}
}
