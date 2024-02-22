package test.com;

public class WhileLoop {

	 int i = 1;
	int limit;

	WhileLoop(int limit) {
		this.limit = limit;

	}

	 public void square() {
		 
		while (i * i < limit) {

			System.out.println(i * i+"square ");
			i++;
		}
		System.out.println();
	}

	 public void cube(){
		 
		while (i * i * i < limit) {

			System.out.println(i * i * i+" ");
			i++;
		}

	}

	public static void main(String[] args) {

		WhileLoop sq = new WhileLoop(90);
		WhileLoop wh = new WhileLoop(90);
		sq.square();
		wh.cube();
	}

}
