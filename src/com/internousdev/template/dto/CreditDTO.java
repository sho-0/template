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
	private String creditName;

	/**
	 * クレジット番号
	 */
	private int creditNumber;

	/**
	 * セキュリティ番号
	 */
	private int securityCode;

	/**
	 * IDナンバー
	 */
	private int idNumber;

	/**
	 * クレジット会社名を取得
	 * @return creditNam クレジット会社名
	 */
	public String getCreditName(){
		return creditName;
	}

	/**
	 * クレジット会社名を格納
	 * @param creditName クレジット会社名
	 */
	public void setCreditName(String creditName){
		this.creditName = creditName;
	}

	/**
	 * クレジット番号を取得
	 * @return creditNumber クレジット番号
	 */
	public int getCreditNumber(){
		return creditNumber;
	}

	/**
	 * クレジット番号を格納
	 * @param creditNumber クレジット番号
	 */
	public void setCreditNumber(int creditNumber){
		this.creditNumber = creditNumber;
	}

	/**
	 * セキュリティ番号を取得
	 * @return securityCode セキュリティ番号
	 */
	public int getSecurityCode(){
		return securityCode;
	}

	/**
	 * セキュリティ番号を格納
	 * @param securityCode セキュリティ番号
	 */
	public void setSecurityCode(int securityCode){
		this.securityCode = securityCode;
	}

	/**
	 * iDナンバーを取得
	 * @return idNumber IDナンバー
	 */
	public int getIdNumber(){
		return idNumber;
	}

	/**
	 * IDナンバーを格納
	 * @param idNumber IDナンバー
	 */
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
}
