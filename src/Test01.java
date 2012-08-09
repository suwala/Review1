class Test01{
	public static void main(){
		Person watanabe = new Person();
		watanebe.set_lastName("渡辺");
		watanebe.set_fistName("高志");


		Person wada = new Person();
		wada.set_lastName("和田");
		wada.set_fistName("充史");

		watanebe.show_name();
		wada.show_name();
		watanebe.show_name();


	}
}

