import java.util.ArrayList;

public class Planet {

    private String name;
    private int mass;
    private ArrayList<Moon> moons;
    private boolean habitable;


    public Planet(String name, int mass, boolean habitable){
        this.name = name;
        this.moons = new ArrayList<Moon>();
        this.mass = mass;
        this.habitable = habitable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }

    public int getNumberOfMoons(){
        return this.moons.size();
    }

    public int getMassOfMoons() {
        int total = 0;
        for(Moon moon : this.moons){
           total += moon.getMass();
        }
        return total;
    }

    public int getMass() {
        return this.mass;
    }

    public void setMass(int mass){
        this.mass = mass;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
