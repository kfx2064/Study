package Chapter14_4;

public class UsingThis {
	
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			// ���ٽ�
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				//System.out.println("" + ThisExample);

				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			
			fi.method();
		}
	}

}