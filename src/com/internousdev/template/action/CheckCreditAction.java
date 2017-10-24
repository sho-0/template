/**
 *
 */
package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.CreditDAO;
import com.internousdev.template.dto.CreditDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * クレジットカード認証を実行クラス
 * @author MASAHIRO IZAWA
 * @since 2017/10/24
 * @since 1.1
 */

public class CheckCreditAction extends ActionSupport implements SessionAware{

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
	 * セッション情報
	 */
	private Map<String,Object>session;

	/**
	 * クレジットカード認証を実行メソッド
	 * @author MASAHIRO IZAWA
	 * @since 2017/10/24
	 * @version 1.1
	 */

	public String execute(){
		String result = ERROR;
		CreditDAO dao = new CreditDAO();
		CreditDTO dto = new CreditDTO();


		dto = dao.select(credit_name,credit_number,security_code,id_number);

		if(credit_name.equals(dto.getCredit_name()) && credit_number.equals(dto.getCredit_number())
				&& security_code.equals(dto.getSecurity_code()) && id_number.equals(dto.getId_number())){
			result = SUCCESS;
	}
	session.put("credit_name",dto.getCredit_name());
	session.put("credit_number",dto.getCredit_number());
	session.put("securityc_code",dto.getSecurity_code());
	session.put("id_number",dto.getId_number());
	return result;
}

	/**
	 * クレジット会社を取得
	 * @return credit_name クレジット会社
	 */
	public String getCredit_name() {
		return credit_name;
	}

	/**
	 * クレジット会社を格納
	 * @param credit_name クレジット会社
	 */
	public void setCredit_name(String credit_name) {
		this.credit_name = credit_name;
	}

	/**
	 * クレジット番号を取得
	 * @return credit_number クレジット番号
	 */
	public String getCredit_number() {
		return credit_number;
	}

	/**
	 * クレジット番号を格納
	 * @param credit_number クレジット番号
	 */
	public void setCredit_number(String credit_number) {
		this.credit_number = credit_number;
	}

	/**
	 * セキュリティ番号を取得
	 * @return security_code セキュリティ番号
	 */
	public String getSecurity_code() {
		return security_code;
	}

	/**
	 * セキュリティ番号を格納
	 * @param security_code セキュリティ番号
	 */
	public void setSecurity_code(String security_code) {
		this.security_code = security_code;
	}

	/**
	 * IDナンバーを取得
	 * @return id_number IDナンバー
	 */
	public String getId_number() {
		return id_number;
	}

	/**
	 * IDナンバーを格納
	 * @param id_number IDナンバー
	 */
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	/**
	 * セッション情報を取得
	 * @return session セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納
	 * @param session セッション情報
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
