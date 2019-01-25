public class App() {
	class Clothing {
		private Material material;
		private Color color;
		private ArrayList<Clothing> line;

		public Clothing() {

		}
	}

	class Material {
		String name;
		String origin;
		int quality;
	}

	class Color {
		int red;
		int green;
		int blue;
	}

	class Shirt extends Clothing {
		String brand;		
	}

	class Pants extends Clothing {
		String zipper;
	}

	public static void main(String[] args) {
		
	}
}