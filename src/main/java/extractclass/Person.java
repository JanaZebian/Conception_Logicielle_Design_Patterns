package extractclass;

public class Person {
	private String _name;
	private Telephone _officeTelephone;
	
	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return "(" + this._officeTelephone.get_areaCode() + ")" + this._officeTelephone.get_number();}
}
