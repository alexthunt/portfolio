package animalcraft;

public class Tool {

    private String name;

    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String useTool(boolean isUsable) {
        if (isUsable && name.equalsIgnoreCase("Shovel")) {
            return "You dig.";
        }
        if (isUsable && name.equalsIgnoreCase("Hammer")) {
            return "You build.";
        }
        if (isUsable && name.equalsIgnoreCase("Axe")) {
            return "You chop.";
        }
        return "You can't do that.";
    }
}
