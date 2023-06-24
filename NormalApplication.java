public class NormalApplication {
	public static void main(String[] args) {
		Normal n0 = new Normal(1,0,1.1);
		n0.printResult();
		
		Normal n1 = new Normal(1,0,-1.1);
		n1.printResult();

		Normal n2 = new Normal(0.64498, 2, 0);
		n2.printResult();
	}
}