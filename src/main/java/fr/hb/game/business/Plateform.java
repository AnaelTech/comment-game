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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Plateform plateform = (Plateform) obj;

        return id != null ? id.equals(plateform.id) : plateform.id == null;
    }
    

    @Override
    public String toString() {
        return "Plateform{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
