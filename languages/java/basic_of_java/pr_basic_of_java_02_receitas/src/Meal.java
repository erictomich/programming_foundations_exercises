interface Food {
    String getName();
    int getCalories();
    String getDescription();
}

class Carrot implements Food {
    private String name;
    private int calories;
    private String description;

    public Carrot() {
        this.name = "Carrot";
        this.calories = 30;
        this.description = "Teste";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

}

class Beet implements Food {
	private String name;
	private int calories;
	private String description;

	public Beet() {
		this.name = "Beet";
		this.calories = 10;
		this.description = "teste beet";
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getCalories() {
		return this.calories;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}
}

public class Meal {
    public static void main(String[] args) {
        Carrot carrot = new Carrot();
        String name;
        
        name = carrot.getName();

        System.out.println(name);

    }
}