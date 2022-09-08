package datastructuresproject3;
//Project 3
//CIS-2352
//Summer 2022
//Alexander Hunt
public class Image {

    private final String name;
    private final boolean animals;
    private final boolean flowers;
    private final boolean people;
    private final boolean buildings;
    private final boolean landscapes;

    public Image(String name, boolean animals, boolean flowers, boolean people, boolean buildings, boolean landscapes) {
        this.name = name;
        this.animals = animals;
        this.flowers = flowers;
        this.people = people;
        this.buildings = buildings;
        this.landscapes = landscapes;
    }

    public String getName() {
        return name;
    }

    public boolean isAnimals() {
        return animals;
    }

    public boolean isFlowers() {
        return flowers;
    }

    public boolean isPeople() {
        return people;
    }

    public boolean isBuildings() {
        return buildings;
    }

    public boolean isLandscapes() {
        return landscapes;
    }

    public boolean isWithinSearch(boolean animals, boolean flowers, boolean people, boolean buildings, boolean landscapes, boolean and, boolean or) {
        if (and == false) {
            if (animals && this.animals) {
                return true;
            } else if (flowers && this.flowers) {
                return true;
            } else if (people && this.people) {
                return true;
            } else if (buildings && this.buildings) {
                return true;
            } else if (landscapes && this.landscapes) {
                return true;
            }
        }
        if (and == true && or == false) {
            if (animals && this.animals) {
                if (flowers && this.flowers) {
                    return true;
                } else if (people && this.people) {
                    return true;
                } else if (buildings && this.buildings) {
                    return true;
                } else if (landscapes && this.landscapes) {
                    return true;
                }
            }
            if (flowers && this.flowers) {
                if (people && this.people) {
                    return true;
                } else if (buildings && this.buildings) {
                    return true;
                } else if (landscapes && this.landscapes) {
                    return true;
                }
            }
            if (people && this.people) {
                if (buildings && this.buildings) {
                    return true;
                } else if (landscapes && this.landscapes) {
                    return true;
                }
            }
            if (buildings && this.buildings) {
                if (landscapes && this.landscapes) {
                    return true;
                }
            }
        }
        return false;
    }

}
