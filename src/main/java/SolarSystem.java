import java.util.ArrayList;

public class SolarSystem {

    private String name;
    private ArrayList<Planet> planets;

    public SolarSystem(String name){
        this.name = name;
        this.planets = new ArrayList<Planet>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public int getNumberOfPlanets(){
        return this.planets.size();
    }

    public int getNumberOfMoons(){
        int total = 0;
        for(Planet planet : this.planets){
            total +=  planet.getNumberOfMoons();
        }
        return total;
    }

    public int getMassOfMoons() {
        int total = 0;
        for (Planet planet: this.planets){
           total += planet.getMassOfMoons();
        }

        return total;
    }

    public int getMassOfPlanets(){
        int total = 0;
        for (Planet planet: this.planets){
            total += planet.getMass();
        }
        return total;
    }

    public int getMassOfSolarSystem(){
        return this.getMassOfMoons() + this.getMassOfPlanets();
    }

    public int getNumberOfHabitablePlanets() {
        ArrayList<Planet> habitablePlanets = new ArrayList<Planet>();
        for(Planet planet : this.planets) {
            if(planet.isHabitable() == true){
                habitablePlanets.add(planet);
        }

        }
        return habitablePlanets.size();
    }
}
