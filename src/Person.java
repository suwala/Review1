class Person {
	public static String uji="氏";
	public static String na="名";
	public String fist_name;
	public String last_name;

	public String get_firsName(){

		return this.fist_name;
	}

	public void set_fistName(String str){

		str = this.fist_name;

	}

	public String get_lastName(){
		return this.last_name;
	}

	public void set_lastName(String str){
		str = this.last_name;

	}

	public void show_name(){
		//fist_name last_name wo hyoji

		System.out.println(Person.uji+":"+this.last_name
			+" "+Person.na+":"+this.fist_name);
	}
	
	public void main(args[]){

	}
}