package pkg;

public abstract class Graphics implements GraphicsAction {
	
	@Override
	public void afficher() {
		System.out.println(this);
	}
	
	int color;
}
