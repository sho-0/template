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
 * @author MASAHIO IZAWA
 *
 */
public class CheckCreditAction2 extends ActionSupport implements SessionAware{

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

	public String execute(){
		System.out.println(credit_name);
		System.out.println(credit_number);
		System.out.println(security_code);
		System.out.println(id_number);
		String result = ERROR;
		CreditDAO dao = new CreditDAO();
		CreditDTO dto = new CreditDTO();


		dto = dao.select(credit_name,credit_number,security_code,id_number);

		System.out.println(dto.getCredit_name());
		System.out.println(dto.getCredit_number());
		System.out.println(dto.getSecurity_code());
		System.out.println(dto.getId_number());

		if(credit_name.equals(dto.getCredit_name()) && credit_number.equals(dto.getCredit_number())
				&& security_code.equals(dto.getSecurity_code()) && id_number.equals(dto.getId_number())){
			result = SUCCESS;
	}
	session.put("credit_name",dto.getCredit_name());
	session.put("credit_number",dto.getCredit_number());
	session.put("securityc_code",dto.getSecurity_code());
	session.put("id_number",dto.getId_number());
	System.out.println(result);
	return result;
}

	/**
	 * @return credit_name
	 */
	public String getCredit_name() {
		return credit_name;
	}

	/**
	 * @param credit_name セットする credit_name
	 */
	public void setCredit_name(String credit_name) {
		this.credit_name = credit_name;
	}

	/**
	 * @return credit_number
	 */
	public String getCredit_number() {
		return credit_number;
	}

	/**
	 * @param credit_number セットする credit_number
	 */
	public void setCredit_number(String credit_number) {
		this.credit_number = credit_number;
	}

	/**
	 * @return security_code
	 */
	public String getSecurity_code() {
		return security_code;
	}

	/**
	 * @param security_code セットする security_code
	 */
	public void setSecurity_code(String security_code) {
		this.security_code = security_code;
	}

	/**
	 * @return id_number
	 */
	public String getId_number() {
		return id_number;
	}

	/**
	 * @param id_number セットする id_number
	 */
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
