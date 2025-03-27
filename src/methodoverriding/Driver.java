package methodoverriding;

public class Driver{
public static void main(String[] args) {
	Dog d = new Dog();
	d.sound();
	Tiger t= new Tiger();
	t.sound();
}
}
