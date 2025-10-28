public class Monster {
    private int arms, eyes, buttons;
    private String name;
    
    public Monster(int a, int e, int b, String n){
        arms = a;
        eyes = e;
        buttons = b;
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }
    
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public String getName() {
        return name;
    }

    public int getArms() {
        return arms;
    }

    public int getEyes() {
        return eyes;
    }
    public int getButtons() {
        return buttons;
    }

    public String toString(){
        return "eyes:" + eyes + "arms:" + arms + "buttons:" + buttons + "name:" + name;
    }
}
