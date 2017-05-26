import io.reactivex.Observable;

public class Launcher {

	public static void main(String[] args) { 
	
		Observable.just("Hello World!")
			.subscribe(System.out::println);
	}
}