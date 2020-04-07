package application;

public class users {
		
		private String username;
		private String password;
		private String email;
		public users(String username, String password, String email) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
		}
		public String getuserName() {
			return username;
		}
		public void setuserName(String name) {
			this.username = username;
		}
		public String password() {
			return password;
		}
		public void setuserPassword(String password) {
			this.password = password;
		}
		public String email() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		

	}


