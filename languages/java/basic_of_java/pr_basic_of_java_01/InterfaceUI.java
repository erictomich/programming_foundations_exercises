
interface UIComponentFactory {
    String createButtonAddToGlossary();
    String createButtonFavorite();
    String createButtonReaded();
}

class ClassicUIComponentFactory implements UIComponentFactory {
    @Override
    public String createButtonAddToGlossary() {
        return "Classic UI Button Add To Glossary";
    }

    @Override
    public String createButtonFavorite() {
        return "Classic UI Button Favorite";
    }

    @Override
    public String createButtonReaded() {
        return "Classic UI Button Readed";
    }
}

class DarkUIComponentFactory implements UIComponentFactory {
    @Override
    public String createButtonAddToGlossary() {
        return "Dark UI Button Add To Glossary";
    }

    @Override
    public String createButtonFavorite() {
        return "Dark UI Button Favorite";
    }

    @Override
    public String createButtonReaded() {
        return "Dark UI Button Readed";
    }
}

class UIConfigurator {
    private String theme;

    public UIConfigurator(String theme) {
        this.theme = theme;
    }

    public UIComponentFactory getUIComponent() {
        if("classic".equals(this.theme)) {
            return new ClassicUIComponentFactory();
        } else if ("dark".equals(this.theme)) {
            return new DarkUIComponentFactory();
        } else {
            throw new IllegalArgumentException("Unknown theme: " + this.theme);
        }
    }
}

interface Button {
	void render();
}

class ClassicUIButtonAddToGlossary implements Button {
	@Override
	public void render() {
		System.out.println('ClassicUIButtonAddToGlossary');
	}
}

class ClassicUIButtonFavorite implements Button {
	@Override
	public void render() {
		System.out.println('ClassicUIButtonFavorite');
	}
}

class ClassicUIButtonReaded implements Button {
	@Override
	public void render() {
		System.out.println('ClassicUIButtonFavorite');
	}
}

class DarkUIButtonAddToGlossary implements Button {
	@Override
	public void render() {
		System.out.println('DarkUIButtonAddToGlossary');
	}
}

class DarkUIButtonFavorite implements Button {
	@Override
	public void render() {
		System.out.println('DarkUIButtonFavorite');
	}
}

class DarkUIButtonReaded implements Button {
	@Override
	public void render() {
		System.out.println('DarkUIButtonFavorite');
	}
}

public class InterfaceUI {
    public static void main(String[] args) {
        UIConfigurator configurator = new UIConfigurator("dark");
        UIComponentFactory factory = configurator.getUIComponent();

        // Usa a fábrica para criar e exibir botões
        System.out.println(factory.createButtonAddToGlossary());
        System.out.println(factory.createButtonFavorite());
        System.out.println(factory.createButtonReaded());
    }
}
