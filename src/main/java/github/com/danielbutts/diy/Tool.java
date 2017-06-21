package github.com.danielbutts.diy;

import javax.persistence.*;

/**
 * Created by danielbutts on 6/19/17.
 */

@Entity
@Table(name="tools")
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String name;

    @Column(length = 10000)
    private String description;
    private String weight;
    private String length;
    private String width;
    private String height;

    private enum Condition {
        NEW("New","This tool is brand new."),
        EXCELLENT("Excellent", "This tool has been used, but is in excellent working order."),
        GOOD("Good", "This tool has some wear and tear, but still has all its parts."),
        WELL_USED("Well Used", "This tool has had a hard life but still works."),
        PARTS_MISSING("Parts Missing", "This tool is missing some key parts"),
        BROKEN("Broken", "This tool is not currently working.");

        private String name;
        private String description;

        Condition(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
