package ver2_lec04;

public class InnerClassMainMethod {
	
	public static void main(String[] args) {
		
		InnerClassMake innerClassMake = new InnerClassMake();
		InnerClassMake.SampleInnserClass sampleInnserClass = innerClassMake.new SampleInnserClass();
		
		innerClassMake.outMainMethod1();
		sampleInnserClass.inMethod1();
		
	}

}
