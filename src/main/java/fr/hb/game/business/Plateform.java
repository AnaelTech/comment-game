package fr.hb.game.business;


public class Plateform {

    private Long id;
    private String name;
    private static Long counter = 0L;
 

    public Plateform(int id) {
        this.id = ++counter;
    }

    public Plateform(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plateform{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
