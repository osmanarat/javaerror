package application;

public class bilgilerim {

			
	private String bilgilerim_ad;
	private String bilgilerim_soyad;
	private String bilgilerim_mail;
	public bilgilerim(String bilgilerim_ad, String bilgilerim_soyad, String bilgilerim_mail) {
		super();
		this.bilgilerim_ad = bilgilerim_ad;
		this.bilgilerim_soyad = bilgilerim_soyad;
		this.bilgilerim_mail = bilgilerim_mail;
	}
	public String getbilgilerim_ad() {
		return bilgilerim_ad;
	}
	public void setbilgilerim_ad(String bilgilerim_ad) {
		this.bilgilerim_ad = bilgilerim_ad;
	}
	public String bilgilerim_soyad() {
		return bilgilerim_soyad;
	}
	public void setbilgilerim_soyad(String bilgilerim_soyad) {
		this.bilgilerim_soyad = bilgilerim_soyad;
	}
	public String bilgilerim_mail() {
		return bilgilerim_mail;
	}
	public void setbilgilerim_mail(String bilgilerim_mail) {
		this.bilgilerim_mail = bilgilerim_mail;
	}
	
	
}
