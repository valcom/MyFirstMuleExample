/**
 * 
 */
package com.myws;

/**
 * @author valer
 *
 */
public class EntryPointImpl implements EntryPointWsInterface {

	/* (non-Javadoc)
	 * @see com.myws.EntryPointWsInterface#checkCodeNumber(java.lang.String)
	 */
	@Override
	public String checkCodeNumber(String codiceCliente) {
		 System.out.println("++++ entrato nel metodo checkCodeNumber del WS ");
		  System.out.println("ricevuto codice cliente :" + codiceCliente);
		  // elaboro code
		  StringBuffer sb = new StringBuffer();
		  sb.append("{\"nome\":\"Giuseppe\",");
		  sb.append("\"cognome\": \"Astarita\",");
		  sb.append("\"codiceIban\": \"ACVXFXXFDCHS564243\"}");
		   
		  return sb.toString();
	}

}
