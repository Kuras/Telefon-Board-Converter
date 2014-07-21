/**
 *  Class represent arrbitraty record from file(Like DB)
 */
package main;

/**
 * @author Baraka
 * Created at 20.02.2014
 */
public class Record {
	private int id;
	private String name;
	private int telefonNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelefonNumber() {
		return telefonNumber;
	}
	public void setTelefonNumber(int telefonNumber) {
		this.telefonNumber = telefonNumber;
	}
	public String toString(){
		return id+"\n"+ name+"\n"+ telefonNumber+"\n";
	}
	public void setTelefonNumber(String telefonNumber) {
		try {
			this.telefonNumber = Integer.parseInt(telefonNumber);
		} catch (NumberFormatException e) {
			System.out.println("Pares error");
		}
	}
	
}
