package cat.tecnocampus.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Classroom {


    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 20, message = "Name must be between 4 an 15 characters long")
    @Pattern(regexp = "^\\w+", message = "Name must match ^\\w+")
    private String name;

    @NotNull(message = "capacity cannot be null")
    private int capacity;

    @NotNull(message = "orientation cannot be null")
    @Size(min = 4, max = 15, message = "orientation must be between 4 an 15 characters long")
    @Pattern(regexp = "^\\w+", message = "must have alphanumeric characters")
    private String orientation;

    @NotNull(message = "plugs cannot be null")
    private boolean plugs;

    public Classroom() {

    }

    public Classroom(ClassroomBuilder builder) {
        name = builder.name;
        capacity = builder.capacity;
        orientation = builder.orientation;
        plugs = builder.plugs;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getOrientation() {
        return orientation;
    }

    public boolean isPlugs() {
        return plugs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public void setPlugs(boolean plugs) {
        this.plugs = plugs;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", orientation='" + orientation + '\'' +
                ", plugs=" + plugs +
                '}';
    }

    public static class ClassroomBuilder {
        public String name;
        public int capacity;
        public String orientation;
        public boolean plugs;

        public ClassroomBuilder() {
        }

        public ClassroomBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClassroomBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public ClassroomBuilder orientation(String orientation) {
            this.orientation = orientation;
            return this;
        }

        public ClassroomBuilder plugs(boolean plugs) {
            this.plugs = plugs;
            return this;
        }

        public Classroom build() {
            return new Classroom(this);
        }
    }
}
